/*******************************************************************************
 * Copyright (c) 2021 Obeo.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
import { makeStyles } from '@material-ui/core/styles';
import { useMachine } from '@xstate/react';
import { HORIZONTAL, Panels, SECOND_PANEL } from 'core/panels/Panels';
import { OnboardAreaErrorCore } from 'onboarding/OnboardAreaErrorCore';
import React, { useContext, useEffect } from 'react';
import { LeftSite } from 'workbench/LeftSite';
import { RepresentationContext } from 'workbench/RepresentationContext';
import { RepresentationNavigation } from 'workbench/RepresentationNavigation';
import { RightSite } from 'workbench/RightSite';
import { Representation, RepresentationComponentProps, Selection, WorkbenchProps } from 'workbench/Workbench.types';
import {
  HideRepresentationEvent,
  ShowRepresentationEvent,
  UpdateSelectionEvent,
  WorkbenchContext,
  WorkbenchEvent,
  workbenchMachine
} from 'workbench/WorkbenchMachine';

const useWorkbenchStyles = makeStyles((theme) => ({
  main: {
    display: 'grid',
    gridTemplateRows: 'minmax(0, 1fr)',
    gridTemplateColumns: '1fr',
  },
  representationArea: {
    display: 'grid',
    gridTemplateColumns: '1fr',
    gridTemplateRows: 'min-content minmax(0, 1fr)',
  },
}));

export const ErrorWorkbenchCore = ({
  editingContextId,
  initialRepresentationSelected,
  onRepresentationSelected,
  readOnly,
}: WorkbenchProps) => {
  const classes = useWorkbenchStyles();
  const { registry } = useContext(RepresentationContext);
  const [{ context }, dispatch] = useMachine<WorkbenchContext, WorkbenchEvent>(workbenchMachine, {
    context: {
      displayedRepresentation: initialRepresentationSelected,
      representations: initialRepresentationSelected ? [initialRepresentationSelected] : [],
    },
  });
  const { selection, representations, displayedRepresentation } = context;

  const setSelection = (selection: Selection) => {
    const isRepresentation = registry.isRepresentation(selection.kind);
    const updateSelectionEvent: UpdateSelectionEvent = { type: 'UPDATE_SELECTION', selection, isRepresentation };
    dispatch(updateSelectionEvent);
  };

  const onRepresentationClick = (representation: Representation) => {
    const showRepresentationEvent: ShowRepresentationEvent = { type: 'SHOW_REPRESENTATION', representation };
    dispatch(showRepresentationEvent);
  };

  const onClose = (representation: Representation) => {
    const hideRepresentationEvent: HideRepresentationEvent = { type: 'HIDE_REPRESENTATION', representation };
    dispatch(hideRepresentationEvent);
  };

  useEffect(() => {
    if (displayedRepresentation && displayedRepresentation.id !== initialRepresentationSelected?.id) {
      onRepresentationSelected(displayedRepresentation);
    } else if (displayedRepresentation === null && initialRepresentationSelected) {
      onRepresentationSelected(null);
    }
  }, [onRepresentationSelected, initialRepresentationSelected, displayedRepresentation]);

  const leftSite = (
    <LeftSite
      editingContextId={editingContextId}
      selection={selection}
      setSelection={setSelection}
      readOnly={readOnly}
    />
  );

  const rightSite = <RightSite editingContextId={editingContextId} selection={selection} readOnly={readOnly} />;

  let main = (
    <OnboardAreaErrorCore
      editingContextId={editingContextId}
      selection={selection}
      setSelection={setSelection}
      readOnly={readOnly}
    />
  );
  if (displayedRepresentation) {
    const RepresentationComponent = registry.getComponent(displayedRepresentation);
    const props: RepresentationComponentProps = {
      editingContextId,
      readOnly,
      representationId: displayedRepresentation.id,
      selection,
      setSelection,
      docuId: selection.docuId,
    };
    main = (
      <div className={classes.representationArea} data-testid="representation-area">
        <RepresentationNavigation
          representations={representations}
          displayedRepresentation={displayedRepresentation}
          onRepresentationClick={onRepresentationClick}
          onClose={onClose}
        />
        <RepresentationComponent {...props} />
      </div>
    );
  }


  return (
    <Panels
      orientation={HORIZONTAL}
      firstPanel={leftSite}
      secondPanel={
        <div className={classes.main} data-testid="representationAndProperties">
          <Panels
            orientation={HORIZONTAL}
            resizablePanel={SECOND_PANEL}
            firstPanel={main}
            secondPanel={rightSite}
            initialResizablePanelSize={300}
          />
        </div>
      }
      initialResizablePanelSize={300}
    />
  );
};

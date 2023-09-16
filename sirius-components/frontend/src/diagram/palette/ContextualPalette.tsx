/*******************************************************************************
 * Copyright (c) 2019, 2020 Obeo.
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
import { ContextualPaletteProps } from 'diagram/palette/ContextualPalette.types';
import { ToolSection } from 'diagram/palette/tool-section/ToolSection';
import { ToolSeparator } from 'diagram/palette/tool-separator/ToolSeparator';
import { Tool } from 'diagram/palette/tool/Tool';
import { isContextualTool } from 'diagram/toolServices';
import React from 'react';
import styles from './ContextualPalette.module.css';
import closeImagePath from './icons/close.svg';
import deleteImagePath from './icons/delete.svg';
import editImagePath from './icons/edit.svg';
import schedulesImagePath from './icons/scheduling.svg';

//Amir added
const schedulesTool = {
  id: 'schedules',
  type: 'edit',
  imageURL: schedulesImagePath,
  label: 'Scheduling',
};

const editTool = {
  id: 'edit',
  type: 'edit',
  imageURL: editImagePath,
  label: 'Edit',
};
const deleteTool = {
  id: 'delete',
  type: 'delete',
  imageURL: deleteImagePath,
  label: 'Delete',
};
const closeTool = {
  id: 'close',
  type: 'close',
  imageURL: closeImagePath,
  label: 'Close',
};

/**
 * The component used to display a Contextual Palette.
 *
 * @hmarchadour
 */
export const ContextualPalette = ({
  toolSections,
  targetElement,
  invokeTool,
  invokeLabelEdit,
  invokeDelete,
  invokeClose,
  editingContextId,
  representationId,
  selectedObjectId,
  onShowSchedule,
}: ContextualPaletteProps) => {
  let toolSectionsContent;

  const contextualToolSections = [];
  // Keep only create node/edge tools
  toolSections.forEach((toolSection) => {
    const filteredTools = toolSection.tools.filter((tool) => isContextualTool(tool, targetElement));
    if (filteredTools.length > 0) {
      // copy toolSection and replace filtered tools.
      const filteredToolSection = Object.assign({}, toolSection);
      filteredToolSection.tools = filteredTools;
      if (!filteredTools.some((filteredTool) => filteredTool.id === toolSection.defaultTool.id)) {
        filteredToolSection.defaultTool = filteredTools[0];
      }
      contextualToolSections.push(filteredToolSection);
    }
  });

  if (contextualToolSections.length > 0) {
    toolSectionsContent = contextualToolSections.map((toolSection) => {
      return (
        <div className={styles.toolSectionEntry} key={targetElement.id + toolSection.id}>
          <ToolSection toolSection={toolSection} onToolClick={invokeTool} />
        </div>
      );
    });
  }

  //   //Amir added
  //   const createRepresentationMutation = gql`
  //   mutation createRepresentation($input: CreateRepresentationInput!) {
  //     createRepresentation(input: $input) {
  //       __typename
  //       ... on CreateRepresentationSuccessPayload {
  //         representation {
  //           id
  //           label
  //           kind
  //           __typename
  //         }
  //       }
  //       ... on ErrorPayload {
  //         message
  //       }
  //     }
  //   }
  // `;

  // const [
  //   createRepresentation,
  // ] = useMutation<GQLCreateRepresentationMutationData>(createRepresentationMutation);

  // const onCreateRepresentation = () => {
  //   //dispatch({ type: 'CREATE_REPRESENTATION' } as CreateRepresentationEvent);
  //   const input = {
  //     id: uuid(),
  //     editingContextId,
  //     objectId,
  //     representationDescriptionId: "960a6b52-09a2-4345-b040-717d976f8cc3",
  //     representationName: name,
  //   };

  //   console.log('created!');
  //   createRepresentation({ variables: { input } });
  // };



  //Amir added 
  let openSchedule;
  openSchedule = (
    <div className={styles.toolEntry}>
      <Tool tool={schedulesTool} thumbnail={true} onClick={onShowSchedule} />
    </div>
  );


  let renameEntry;
  if (invokeLabelEdit) {
    renameEntry = (
      <div className={styles.toolEntry}>
        <Tool tool={editTool} thumbnail={true} onClick={() => invokeLabelEdit()} />
      </div>
    );
  }
  let deleteEntry;
  if (invokeDelete) {
    deleteEntry = (
      <div className={styles.toolEntry}>
        <Tool tool={deleteTool} thumbnail={true} onClick={() => invokeDelete()} />
      </div>
    );
  }

  let separator;
  if (toolSectionsContent && (invokeLabelEdit || invokeDelete)) {
    separator = <ToolSeparator />;
  }
  const closeEntry = (
    <div className={styles.toolEntry}>
      <Tool tool={closeTool} thumbnail={true} onClick={() => invokeClose()} />
    </div>
  );
  let result = <></>;
  if (toolSectionsContent || invokeLabelEdit || invokeDelete) {
    result = (
      <>
        <div className={styles.toolbar} data-testid={`PopupToolbar`}>
          <div className={styles.toolEntries}>
            {toolSectionsContent}
            {openSchedule}
            {separator}
            {renameEntry}
            {deleteEntry}
            <ToolSeparator />
            {closeEntry}
          </div>
        </div>
      </>
    );
  }
  return result;
};


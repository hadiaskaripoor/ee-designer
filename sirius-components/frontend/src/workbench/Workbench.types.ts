/*******************************************************************************
 * Copyright (c) 2021 Obeo and others.
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
export type Selection = {
  id: string;
  label: string;
  kind: string;
  docuId: string;
};

export type Representation = {
  id: string;
  label: string;
  kind: string;
  docuId: string; 
};

export type WorkbenchProps = {
  editingContextId: string;
  initialRepresentationSelected: Representation;
  onRepresentationSelected: (representation: Representation) => void;
  readOnly: boolean;
  docuId: string;
};


export type RepresentationComponentProps = {
  editingContextId: string;
  representationId: string;
  readOnly: boolean;
  selection: Selection;
  setSelection: (selection: Selection) => void;
  docuId: string;
};

export type RepresentationComponent = (props: RepresentationComponentProps) => JSX.Element;

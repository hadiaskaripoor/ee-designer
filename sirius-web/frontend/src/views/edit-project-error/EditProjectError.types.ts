export type EditingContext = {
    id: string;
  };
  
  export type Project = {
    id: string;
    name: string;
    currentEditingContext: EditingContext;
  };
  
  export type GQLRepresentation = {
    id: string;
    label: string;
    kind: string;
  };
  
  export type GQLEditingContext = {
    id: string;
    representation: GQLRepresentation | undefined;
  };
  
  export type GQLProject = {
    id: string;
    name: string;
    currentEditingContext: GQLEditingContext;
  };
  
  export type GQLViewer = {
    project: GQLProject;
  };
  
  export type GQLGetProjectQueryData = {
    viewer: GQLViewer;
  };
  
  export type GQLGetProjectQueryVariables = {
    projectId: string;
    representationId: string;
    includeRepresentation: boolean;
  };
  
  export interface EditProjectViewParams {
    projectId: string;
    representationId: string;
  }
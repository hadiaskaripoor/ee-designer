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
import { useLazyQuery } from '@apollo/client';
import Grid from '@material-ui/core/Grid';
import Typography from '@material-ui/core/Typography';
import gql from 'graphql-tag';
import React, { useEffect } from 'react';
import styles from './OnboardArea.module.css';
import { OnboardAreaProps } from './OnboardArea.types';

const getOnboardDataQuery = gql`
  query getOnboardData($editingContextId: ID!, $classId: ID!) {
    viewer {
      editingContext(editingContextId: $editingContextId) {
        stereotypeDescriptions {
          id
          label
        }
        representationDescriptions(classId: $classId) {
          edges {
            node {
              id
              label
            }
          }
        }
        representations {
          id
          label
          kind
        }
      }
    }
  }
`;



export const OnboardAreaErrorCore = ({ editingContextId, selection, setSelection, readOnly }: OnboardAreaProps) => {
  const classId = selection ? selection.kind : '';

  const [getOnboardData, { loading, data, error }] = useLazyQuery(getOnboardDataQuery);
  useEffect(() => {
    getOnboardData({ variables: { editingContextId, classId } });
  }, [editingContextId, classId, getOnboardData]);
  useEffect(() => {
    if (!loading && !error && data?.viewer) {    
      ;
    }
  }, [editingContextId, classId, loading, data, error]);
  return (
    <div className={styles.onboardArea}>
      <div className={styles.onboardContent}>
      <Grid container justify="center" alignItems="center">
        <Typography variant="h4" align="center" gutterBottom>
          <p>Error</p> 
          There are no cores in the model
        </Typography>
      </Grid>
      </div>
    </div>
  );
};

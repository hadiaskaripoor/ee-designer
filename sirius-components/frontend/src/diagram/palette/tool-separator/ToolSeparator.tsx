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
import React from 'react';
import styles from './ToolSeparator.module.css';

/**
 * The component used to display a tool separator.
 *
 * @author hmarchadour
 */
export const ToolSeparator = () => (
  <div className={styles.toolSeparatorWrapper}>
    <div className={styles.toolSeparator}></div>
  </div>
);

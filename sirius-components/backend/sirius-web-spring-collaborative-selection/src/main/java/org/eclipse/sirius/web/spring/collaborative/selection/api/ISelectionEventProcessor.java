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
package org.eclipse.sirius.web.spring.collaborative.selection.api;

import org.eclipse.sirius.web.spring.collaborative.api.IRepresentationEventProcessor;

/**
 * Interface implemented by the selection event processor.
 *
 * @author arichard
 */
public interface ISelectionEventProcessor extends IRepresentationEventProcessor {
    /**
     * Implementation which does nothing, used for mocks in unit tests.
     *
     * @author sbegaudeau
     */
    class NoOp extends IRepresentationEventProcessor.NoOp implements ISelectionEventProcessor {

    }
}

/*******************************************************************************
 * Copyright (c) 2021 THALES GLOBAL SERVICES.
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
package org.eclipse.sirius.web.graphql.datafetchers.mutation;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

import org.eclipse.sirius.web.annotations.graphql.GraphQLMutationTypes;
import org.eclipse.sirius.web.annotations.spring.graphql.MutationDataFetcher;
import org.eclipse.sirius.web.core.api.ErrorPayload;
import org.eclipse.sirius.web.core.api.IPayload;
import org.eclipse.sirius.web.graphql.messages.IGraphQLMessageService;
import org.eclipse.sirius.web.graphql.schema.MutationTypeProvider;
import org.eclipse.sirius.web.spring.collaborative.api.IEditingContextEventProcessorRegistry;
import org.eclipse.sirius.web.spring.collaborative.diagrams.dto.ArrangeAllInput;
import org.eclipse.sirius.web.spring.collaborative.diagrams.dto.ArrangeAllSuccessPayload;
import org.eclipse.sirius.web.spring.graphql.api.IDataFetcherWithFieldCoordinates;

import graphql.schema.DataFetchingEnvironment;

/**
 * The data fetcher used to layout a diagram
 * <p>
 * It will be used to handle the following GraphQL field:
 * </p>
 *
 * <pre>
 * type Mutation {
 *   arrangeAll(input: ArrangeAllInput!): ArrangeAllPayload!
 * }
 * </pre>
 *
 * @author wpiers
 *
 */
// @formatter:off
@GraphQLMutationTypes(
    input = ArrangeAllInput.class,
    payloads = {
        ArrangeAllSuccessPayload.class
    }
)
@MutationDataFetcher(type = MutationTypeProvider.TYPE, field = MutationArrangeAllDataFetcher.ARRANGE_ALL_FIELD)
// @formatter:on
public class MutationArrangeAllDataFetcher implements IDataFetcherWithFieldCoordinates<CompletableFuture<IPayload>> {
    public static final String ARRANGE_ALL_FIELD = "arrangeAll"; //$NON-NLS-1$

    private final ObjectMapper objectMapper;

    private final IEditingContextEventProcessorRegistry editingContextEventProcessorRegistry;

    private final IGraphQLMessageService messageService;

    public MutationArrangeAllDataFetcher(ObjectMapper objectMapper, IEditingContextEventProcessorRegistry editingContextEventProcessorRegistry, IGraphQLMessageService messageService) {
        this.objectMapper = Objects.requireNonNull(objectMapper);
        this.editingContextEventProcessorRegistry = Objects.requireNonNull(editingContextEventProcessorRegistry);
        this.messageService = Objects.requireNonNull(messageService);
    }

    @Override
    public CompletableFuture<IPayload> get(DataFetchingEnvironment environment) throws Exception {
        Object argument = environment.getArgument(MutationTypeProvider.INPUT_ARGUMENT);
        var input = this.objectMapper.convertValue(argument, ArrangeAllInput.class);

        // @formatter:off
        return this.editingContextEventProcessorRegistry.dispatchEvent(input.getEditingContextId(), input)
                .defaultIfEmpty(new ErrorPayload(input.getId(), this.messageService.unexpectedError()))
                .toFuture();
        // @formatter:on
    }
}

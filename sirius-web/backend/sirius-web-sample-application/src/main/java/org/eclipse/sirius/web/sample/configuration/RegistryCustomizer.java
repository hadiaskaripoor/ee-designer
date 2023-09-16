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
package org.eclipse.sirius.web.sample.configuration;

import java.util.Objects;

import javax.annotation.PostConstruct;

import org.eclipse.emf.ecore.EValidator;
import org.springframework.context.annotation.Configuration;

import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.design.CustomValidator;

/**
 * @author Andre
 */
@Configuration
public class RegistryCustomizer {
    private final EValidator.Registry registry;

    public RegistryCustomizer(EValidator.Registry registry) {

        this.registry = Objects.requireNonNull(registry);
    }

    @PostConstruct
    public void registerCustomValidator() {
        this.registry.put(AutoDesigner1Package.eINSTANCE, new CustomValidator());
        // this.registry.put(EedPackage.eINSTANCE, new AhpccValidator());
        // this.registry.put(RoutingPackage.eINSTANCE, new RoutingValidator());
    }
}

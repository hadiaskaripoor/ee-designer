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

//import fr.obeo.dsl.designer.sample.flow.FlowPackage;
//import fr.obeo.dsl.designer.sample.flow.provider.FlowItemProviderAdapterFactory;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.sirius.web.domain.DomainPackage;
import org.eclipse.sirius.web.domain.provider.DomainItemProviderAdapterFactory;
import org.eclipse.sirius.web.view.ViewPackage;
import org.eclipse.sirius.web.view.provider.ViewItemProviderAdapterFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import autoDesigner1.AutoDesigner1Package;
import autoDesigner1.provider.AutoDesigner1ItemProviderAdapterFactory;
import autoDesigner1.util.AutoDesigner1AdapterFactory;

/**
 * Configuration of the EMF support for Sirius Web.
 *
 * @author sbegaudeau
 */
@Configuration
public class SampleEMFConfiguration {

    // Added by Amir
    @Bean
    public AdapterFactory autoDesignerAdapterFactory() {
        return new AutoDesigner1AdapterFactory();
    }

    // Added by Amir
    @Bean
    public EPackage AutoDesigner1Package() {
        return AutoDesigner1Package.eINSTANCE;
    }

    // Added by Amir
    @Bean
    public AdapterFactory AutoDesigner1AdapterFactory() {
        return new AutoDesigner1ItemProviderAdapterFactory();
    }

    @Bean
    @ConditionalOnProperty(prefix = "org.eclipse.sirius.web.features", name = "studioDefinition")
    public EPackage domainEPackage() {
        return DomainPackage.eINSTANCE;
    }

    @Bean
    @ConditionalOnProperty(prefix = "org.eclipse.sirius.web.features", name = "studioDefinition")
    public AdapterFactory domainAdapterFactory() {
        return new DomainItemProviderAdapterFactory();
    }

    @Bean
    @ConditionalOnProperty(prefix = "org.eclipse.sirius.web.features", name = "studioDefinition")
    public EPackage viewEPackage() {
        return ViewPackage.eINSTANCE;
    }

    @Bean
    @ConditionalOnProperty(prefix = "org.eclipse.sirius.web.features", name = "studioDefinition")
    public AdapterFactory viewAdapterFactory() {
        return new ViewItemProviderAdapterFactory();
    }
}

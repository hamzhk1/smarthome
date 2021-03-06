/**
 * Copyright (c) 2014 openHAB UG (haftungsbeschraenkt) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.smarthome.core.thing.link;

import org.eclipse.smarthome.core.common.registry.DefaultAbstractManagedProvider;

/**
 * 
 * {@link ManagedItemChannelLinkProvider} is responsible for managed
 * {@link ItemChannelLink}s at runtime.
 * 
 * @author Dennis Nobel - Initial contribution
 * 
 */
public class ManagedItemChannelLinkProvider extends DefaultAbstractManagedProvider<ItemChannelLink, String> implements ItemChannelLinkProvider {

    @Override
    protected String getStorageName() {
        return ItemChannelLink.class.getName();
    }

    @Override
    protected String keyToString(String key) {
        return key;
    }

    @Override
    protected String getKey(ItemChannelLink element) {
        return element.getID();
    }

}

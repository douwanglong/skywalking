/*
 * Copyright 2017, OpenSkywalking Organization All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Project repository: https://github.com/OpenSkywalking/skywalking
 */

package org.skywalking.collector.baseline.computing.provider;

import java.util.Properties;
import org.skywalking.apm.collector.baseline.computing.ComputingModule;
import org.skywalking.apm.collector.core.module.Module;
import org.skywalking.apm.collector.core.module.ModuleProvider;
import org.skywalking.apm.collector.core.module.ServiceNotProvidedException;

/**
 * The <code>ComputingProvider</code> is the default implementation of {@link ComputingModule}
 *
 * @author wu-sheng
 */
public class ComputingProvider extends ModuleProvider {
    public static final String NAME = "default";

    @Override public String name() {
        return NAME;
    }

    @Override public Class<? extends Module> module() {
        return ComputingModule.class;
    }

    @Override public void prepare(Properties config) throws ServiceNotProvidedException {

    }

    @Override public void start(Properties config) throws ServiceNotProvidedException {

    }

    @Override public void notifyAfterCompleted() throws ServiceNotProvidedException {

    }

    @Override public String[] requiredModules() {
        return new String[0];
    }
}

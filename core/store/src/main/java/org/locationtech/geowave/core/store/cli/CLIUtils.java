/**
 * Copyright (c) 2013-2020 Contributors to the Eclipse Foundation
 *
 * <p> See the NOTICE file distributed with this work for additional information regarding copyright
 * ownership. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Apache License, Version 2.0 which accompanies this distribution and is
 * available at http://www.apache.org/licenses/LICENSE-2.0.txt
 */
package org.locationtech.geowave.core.store.cli;

import java.io.File;
import java.util.Properties;
import org.locationtech.geowave.core.store.base.BaseDataStoreUtils;
import org.locationtech.geowave.core.store.cli.store.DataStorePluginOptions;
import org.locationtech.geowave.core.store.cli.store.StoreLoader;
import com.beust.jcommander.ParameterException;
import com.beust.jcommander.internal.Console;

public class CLIUtils {

  public static DataStorePluginOptions loadStore(
      final String storeName,
      final File configFile,
      final Console console) {
    final StoreLoader inputStoreLoader = new StoreLoader(storeName);
    if (!inputStoreLoader.loadFromConfig(configFile, console)) {
      throw new ParameterException("Cannot find store name: " + inputStoreLoader.getStoreName());
    }
    final DataStorePluginOptions storeOptions = inputStoreLoader.getDataStorePlugin();
    BaseDataStoreUtils.verifyCLIVersion(storeName, storeOptions);
    return storeOptions;
  }

  public static DataStorePluginOptions loadStore(
      final Properties properties,
      final String storeName,
      final File configFile,
      final Console console) {
    final StoreLoader inputStoreLoader = new StoreLoader(storeName);
    if (!inputStoreLoader.loadFromConfig(
        properties,
        DataStorePluginOptions.getStoreNamespace(storeName),
        configFile,
        console)) {
      throw new ParameterException("Cannot find store name: " + inputStoreLoader.getStoreName());
    }
    final DataStorePluginOptions storeOptions = inputStoreLoader.getDataStorePlugin();
    BaseDataStoreUtils.verifyCLIVersion(storeName, storeOptions);
    return storeOptions;
  }

}

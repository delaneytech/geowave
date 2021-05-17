/**
 * Copyright (c) 2013-2020 Contributors to the Eclipse Foundation
 *
 * <p> See the NOTICE file distributed with this work for additional information regarding copyright
 * ownership. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Apache License, Version 2.0 which accompanies this distribution and is
 * available at http://www.apache.org/licenses/LICENSE-2.0.txt
 */
package org.locationtech.geowave.core.store;

import org.locationtech.geowave.core.store.data.field.FieldReader;
import org.locationtech.geowave.core.store.data.field.FieldWriter;

/**
 * A basic property store for storing arbitrary information about a data store. The property value
 * can be any type that's supported by available {@link FieldReader} and {@link FieldWriter}
 * implementations.
 */
public interface PropertyStore {
  DataStoreProperty getProperty(String propertyKey);

  void setProperty(DataStoreProperty property);
}

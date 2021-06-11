/**
 * Copyright (c) 2013-2020 Contributors to the Eclipse Foundation
 *
 * <p> See the NOTICE file distributed with this work for additional information regarding copyright
 * ownership. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Apache License, Version 2.0 which accompanies this distribution and is
 * available at http://www.apache.org/licenses/LICENSE-2.0.txt
 */
package org.locationtech.geowave.core.store.index;

import org.locationtech.geowave.core.store.spi.DimensionalityTypeOptions;
import com.beust.jcommander.Parameter;

/**
 * Provides options for the creation of attribute indices.
 */
public class AttributeIndexOptions implements DimensionalityTypeOptions {

  @Parameter(
      names = {"--typeName"},
      required = true,
      description = "The name of the type with the attribute to index.")
  protected String typeName;

  @Parameter(
      names = {"--attritubeName"},
      required = true,
      description = "The name of the attribute to index.")
  protected String attributeName;

  public AttributeIndexOptions() {}

  public AttributeIndexOptions(final String typeName, final String attributeName) {
    this.typeName = typeName;
    this.attributeName = attributeName;
  }

  public void setTypeName(final String typeName) {
    this.typeName = typeName;
  }

  public String getTypeName() {
    return typeName;
  }

  public void setAttributeName(final String attributeName) {
    this.attributeName = attributeName;
  }

  public String getAttributeName() {
    return attributeName;
  }

}

/**
 * Copyright (c) 2013-2022 Contributors to the Eclipse Foundation
 *
 * <p> See the NOTICE file distributed with this work for additional information regarding copyright
 * ownership. All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Apache License, Version 2.0 which accompanies this distribution and is
 * available at http://www.apache.org/licenses/LICENSE-2.0.txt
 */
package org.locationtech.geowave.core.store.query.filter.expression;

/**
 * A generic implementation of literal, representing any object that can be serialized and
 * deserialized.
 */
public class GenericLiteral extends Literal<Object> implements GenericExpression {

  public GenericLiteral() {}

  public GenericLiteral(final Object literal) {
    super(literal);
  }

  public static GenericLiteral of(final Object literal) {
    return new GenericLiteral(literal);
  }

}

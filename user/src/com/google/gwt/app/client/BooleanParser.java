/*
 * Copyright 2010 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.app.client;

import com.google.gwt.text.shared.Parser;

/**
 * <span style="color:red">Experimental API: This class is still under rapid
 * development, and is very likely to be deleted. Use it at your own risk.
 * </span>
 * <p>
 * An unlocalized simple parser based on {@link Boolean#valueOf}.
 */
public class BooleanParser implements Parser<Boolean> {

  private static BooleanParser INSTANCE;

  /**
   * @return the instance of the no-op renderer
   */
  public static Parser<Boolean> instance() {
    if (INSTANCE == null) {
      INSTANCE = new BooleanParser();
    }
    return INSTANCE;
  }

  protected BooleanParser() {
  }

  public Boolean parse(CharSequence object) {
    return Boolean.valueOf(object.toString());
  }
}
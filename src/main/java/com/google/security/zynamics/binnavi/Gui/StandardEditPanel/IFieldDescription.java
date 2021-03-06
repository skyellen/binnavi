// Copyright 2011-2016 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.security.zynamics.binnavi.Gui.StandardEditPanel;

import com.google.security.zynamics.binnavi.Help.IHelpInformation;

/**
 * Interface for classes that are used to initalize text fields that have context-sensitive help.
 * 
 * @param <T> Type of the initial value.
 */
public interface IFieldDescription<T> {
  /**
   * Returns the help information of the field.
   * 
   * @return The help information of the field.
   */
  IHelpInformation getHelp();

  /**
   * Provides the initial value of the text field.
   * 
   * @return The initial value of the text field.
   */
  T getValue();
}

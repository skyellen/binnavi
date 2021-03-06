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

package com.google.security.zynamics.binnavi.Gui.Debug.BreakpointTable.Actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import com.google.security.zynamics.binnavi.Gui.Debug.BreakpointTable.Implementations.CBreakpointSetFunctions;
import com.google.security.zynamics.binnavi.debug.debugger.BackEndDebuggerProvider;



/**
 * Action class that enables breakpoints.
 */
public final class CEnableAction extends AbstractAction {
  /**
   * Used for serialization.
   */
  private static final long serialVersionUID = 8099777453985222141L;

  /**
   * Provides the debuggers where breakpoints can be set.
   */
  private final BackEndDebuggerProvider m_debuggerProvider;

  /**
   * Rows that identify the breakpoints to delete.
   */
  private final int[] m_rows;

  /**
   * Creates a new action object.
   *
   * @param debuggerProvider Provides the debuggers where breakpoints can be set.
   * @param rows Rows that identify the breakpoints to delete.
   */
  public CEnableAction(final BackEndDebuggerProvider debuggerProvider, final int[] rows) {
    super(rows.length == 1 ? "Enable Breakpoint" : "Enable Breakpoints");

    m_debuggerProvider = debuggerProvider;
    m_rows = rows.clone();
  }

  @Override
  public void actionPerformed(final ActionEvent event) {
    CBreakpointSetFunctions.enableBreakpoints(m_debuggerProvider, m_rows);
  }
}

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

package com.google.security.zynamics.reil.algorithms.mono2.common.interfaces;

import java.util.Map;

import com.google.security.zynamics.reil.algorithms.mono2.common.instructiongraph.interfaces.IInstructionGraphEdge;
import com.google.security.zynamics.zylib.disassembly.IAddress;
import com.google.security.zynamics.zylib.disassembly.IInstruction;


public interface IMonoReilSolverResult<LatticeElementType extends ILatticeElement<LatticeElementType>> {
  public Map<IAddress, LatticeElementType> generateAddressToStateMapping(
      IInstruction startInstruction, boolean trackIncoming);

  public LatticeElementType getResult(IInstructionGraphEdge edge);

  public boolean hasResult(IInstructionGraphEdge edge);
}

/*
 * Copyright 2005-2014 Red Hat, Inc.
 * Red Hat licenses this file to you under the Apache License, version
 * 2.0 (the "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *    http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */
package org.hornetq.core.server.cluster.qourum;

import org.hornetq.api.core.HornetQBuffer;
import org.hornetq.api.core.SimpleString;

/**
 * used to handle votes received by a quorum from a particular node
 */
public interface QuorumVoteHandler
{
   /**
    * @param vote
    * @return
    */
   Vote vote(Vote vote);

   /**
    * the name of the quorum vote
    *
    * @return the name
    */
   SimpleString getQuorumName();

   Vote decode(HornetQBuffer voteBuffer);
}

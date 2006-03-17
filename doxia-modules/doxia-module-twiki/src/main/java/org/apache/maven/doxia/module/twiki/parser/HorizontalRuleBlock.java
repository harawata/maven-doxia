/*
 *  Copyright 2005 Zauber <info /at/ zauber dot com dot ar>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.apache.maven.doxia.module.twiki.parser;

import org.apache.maven.doxia.sink.Sink;


/**
 * Represents an horizontal block
 *
 * @author Juan F. Codagnone
 * @since Nov 5, 2005
 */
public class HorizontalRuleBlock implements Block
{

    /**
     * @see Block#traverse(org.apache.maven.doxia.sink.Sink)
     */
    public final void traverse( final Sink sink )
    {
        sink.horizontalRule();
    }

    /**
     * @see Object#equals(Object)
     */
    
    public final boolean equals( final Object obj )
    {
        return obj == this
            || ( obj != null && getClass().equals( obj.getClass() ) );
    }

    /**
     * @see Object#hashCode()
     */
    
    public final int hashCode()
    {
        final int hashCode = 214905655;
        return hashCode;
    }
}
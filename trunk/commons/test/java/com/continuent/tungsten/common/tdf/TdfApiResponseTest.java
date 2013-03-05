/**
 * Tungsten Scale-Out Stack
 * Copyright (C) 2007-2009 Continuent Inc.
 * Contact: tungsten@continuent.org
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of version 2 of the GNU General Public License as
 * published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307, USA
 *
 * Initial developer(s): Ludovic Launer
 */

package com.continuent.tungsten.common.tdf;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import junit.framework.TestCase;

/**
 * Implements a simple unit test for APIResponse
 * 
 * @author <a href="mailto:ludovic.launer@continuent.com">Ludovic Launer</a>
 * @version 1.0
 */
public class TdfApiResponseTest extends TestCase
{
    
    /**
     * Tests that the getOutputPayloadClass is truly returning the payload type
     * 
     * @throws Exception
     */
    public void testgetOutputPayloadClass() throws Exception
    {
       TdfApiResponse apires = new TdfApiResponse();
       
       String dummyO = new String("dummy");
       
       apires.setOutputPayload(dummyO);
       
       Class<?> t = apires.getOutputPayloadClass();
       
       if (t.getName() == String.class.getName())
           assertTrue(true);
       else
           assertTrue("The returned Type is not the same as the original Object", false);
    }

    

}

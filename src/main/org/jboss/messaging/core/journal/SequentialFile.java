/*
  * JBoss, Home of Professional Open Source
  * Copyright 2005, JBoss Inc., and individual contributors as indicated
  * by the @authors tag. See the copyright.txt in the distribution for a
  * full listing of individual contributors.
  *
  * This is free software; you can redistribute it and/or modify it
  * under the terms of the GNU Lesser General Public License as
  * published by the Free Software Foundation; either version 2.1 of
  * the License, or (at your option) any later version.
  *
  * This software is distributed in the hope that it will be useful,
  * but WITHOUT ANY WARRANTY; without even the implied warranty of
  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
  * Lesser General Public License for more details.
  *
  * You should have received a copy of the GNU Lesser General Public
  * License along with this software; if not, write to the Free
  * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
  * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
  */
package org.jboss.messaging.core.journal;

import java.nio.ByteBuffer;

/**
 * 
 * A SequentialFile
 * 
 * @author <a href="mailto:tim.fox@jboss.com">Tim Fox</a>Journal
 *
 */
public interface SequentialFile
{
	/*
	 * Creates the file if it doesn't already exist, then opens it
	 */
	void open() throws Exception;
	
	String getFileName();
	
	void preAllocate(int size, byte fillCharacter) throws Exception;
	
	void delete() throws Exception;

	void write(ByteBuffer bytes) throws Exception;
	   
	void read(ByteBuffer bytes) throws Exception;
	
	void reset() throws Exception;
	
	void close() throws Exception;
}

/*
 * Copyright (C) Institute of Telematics, Lukas Ruge
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ambientdynamix.contextplugins.action.meta;

/**
 * For now this is a dummy interface that allows for actions to implement their own interface even though this interface doesn't do anything.
 * 
 * The intent is to later have IContext with some commom methods and split that up into IContextInfo and IContextActio being two interfaces that
 * entail methoids specific to Informing on Context or Acting in Context.
 * 
 * @author lukas
 *
 */
public interface IContextActio
{
	
}

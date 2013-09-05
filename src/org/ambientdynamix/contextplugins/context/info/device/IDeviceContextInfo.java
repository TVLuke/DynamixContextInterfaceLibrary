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

package org.ambientdynamix.contextplugins.context.info.device;

/**
 * DeviceContextInfo is supposed to provide basic information on connected devices. It returns an Array of objects implementing the IDevice Interface or something...
 * 
 *  ... not sure how this is going to work but its kinda relevant to have a context type that provides meta-info on the conected devices, I kinda think this 
 *  should be included on every kind of context, providing data on where the info comes from. This shouldn't even be the root, there should be a sourceInfo, which 
 *  can be the Internet or just reasoned, logical data or whatever or, as another subclass, a device. All Sensor data should have to have a source! 
 * @author lukas
 *
 */
public interface IDeviceContextInfo {

}

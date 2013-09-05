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

package org.ambientdynamix.contextplugins.info.meta;


public interface IDevice extends IContextSource
{
	public String diviceName();
	
	public String urlOfDeviceSymbol();
	
	public float energyLevel();
	
	public int hardwareVersionNumber();
	
	public int firmwareVersionNumber();
	
	public int firmwareRevisionNumber();
	
	public boolean isBatteryPowered();
	
	public boolean isRecharable();
	
	public boolean isCharging();
	
	public boolean isWireless();
	
	public boolean isConnected();
	
	public String ConnectionType();
	
	public String getMACAddress();
	
	public int remainingStorage();
}

package org.ambientdynamix.contextplugins.context.info.environment;

import java.util.Set;

public interface ILightContextInfo
{
	public abstract double[] getLuxValue();
	
	public abstract double[] getRedLevelValue();
	
	public abstract double[] getGreenLevelValue();
	
	public abstract double[] getBlueLevelValue();
}
#Dynamix Context Interfaces

This is a collection of interfaces that is supposed to be used to create a consesus on how to model context data types. 

The idea is that anything that implements the _IContextInfo_ interface from _Ambeitn Dynamix_ also implements one of the interfaces from this library, making sure that it has the same methods as other data types that represent the same information.

In addition the data type can implement interfaces from the _org.ambientdynamix.contextplugins.info.meta_ package to show that it provides further information.

This is in its VERY early stages and has absolutely no claim to being complete yet.

Several of my DynamixPlugins are using the library:

* PingPlugin
* SensordronePlugin

## Structure

The Library is structured into a set of packages. All packages are named "org.ambientdynamix.contextplugins.context[info|actions].[applicationarea]" it clearly seperates information data types from action data types.

###Information Data Types
Information data types represent sensor data. Requesting such a data type from a _Dynamix_ plug-in shall not (noticably) change the state of ones physical or virtual environment. So requesting 
a data type that represents the ambient light level would measure that light level without changing it. Since the light level is an environmental value this Interface would be found in _org.ambientdynamix.contextplugins.context.info.environment_.

###Action Data Types
Action data types do not measure they act. They exist to send back data about the action (for example if it was taken or not) back to the app. In many cases, if no feedback to the app exists, it is not actually relevant to create a data type for an action at all as the plugin can just execute the action based on the name of the context type.

As a convention it seems useful to name an action the same as an information context type if the action would change the measured value. So the Act of turning on the light would have the Interface _ILightContextAction_ and the sensor that would pic up that change would be _ILightContextInfo_.

###The Areas
This library is split into application areas as well as an area called meta.

#### Device
soon...
#### Environment
soon...
#### Body
soon...
#### Data
soon...
#### Media
soon...
#### Sample
soon...
#### Meta
The Meta Package a set of interfaces a Context data type may implement to increase the description beyond the minimal amount needed to represent a given context.
##### Localized Context
This Interface can be implemented by data types that, aside from their inherent context, contain location information that represent where in the world this context applies.
##### Sourced Context
Sourced context is an interface to use when the context data type should include information on its source. This means it includes a _parcelable_ object that represents the source of the context. this is especially usefull if the data is not generated on the phone but either by connected sensors or in the web. Providing a source for the data may allow applications to evaluate the usefulnes and trustworthynes of an information. it also alows to distinguish between data coming from diferent sources. 
##### Historical Context
If a data type provides not only the current level of some sensor or the current information from some source but also provides, in the datatype, a history of previous values of some sort, it can implement this interfacer to do so.
##### Probabilistic Context
If a context provides information on the probability that the data provided is actually correctly infered from the data it may use this interface.
##### Self Describving Context
A data type that provides a self description of some sort...

#Copyright


Copyright (C) Institute of Telematics, Lukas Ruge

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

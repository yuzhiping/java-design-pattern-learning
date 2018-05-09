/**
 * Copyright (C) 2016-2017 The hexsmith Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package com.hexsmith.design.pattern.creational.singleton;

/**
 * @Description:懒汉式单例
 * @author hexsmith
 * @date 2017年11月6日 下午6:47:10 
 * @version v1.0 
 */
public class LazyInitializedSingleton {
	
	private static LazyInitializedSingleton instance;
	
	private LazyInitializedSingleton(){}
	
	public static LazyInitializedSingleton getInstance(){
		if (instance == null){
			instance = new LazyInitializedSingleton();
		}
		return instance;
	}

}

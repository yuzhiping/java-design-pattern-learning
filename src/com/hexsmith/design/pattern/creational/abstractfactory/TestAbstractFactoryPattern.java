/**
 * Copyright (C) 2016-2018 The hexsmith Authors.
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
package com.hexsmith.design.pattern.creational.abstractfactory;

import com.hexsmith.design.pattern.creational.abstractfactory.model.Computer;

/**
 * @Description:抽象工厂设计模式的测试类
 * @author hexsmith
 * @date 2018年5月9日 下午10:40:18 
 * @version v1.0 
 */
public class TestAbstractFactoryPattern {
	
	private static void testAbstractFactory() {
		Computer pc = ComputerFactory.getComputer(new PCFactory("2GB", "500GB", "2.4G Hz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("16GB", "1TB", "2.9G Hz"));
		System.out.println("AbstractFactory PC Config: " + pc);
		System.out.println("AbstractFactory Server Config: " + server);
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testAbstractFactory();
	}

}

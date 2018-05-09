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
package com.hexsmith.design.pattern.creational.factory;

/**
 * @Description 
 * @author hexsmith
 * @date 2018年5月9日 下午5:42:53
 * @version v1.0
 */
public class FactoryTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Computer pc = ComputerFactory.getComputer("PC", "2 GB", "500 GB", "2.4G Hz");
        Computer server = ComputerFactory.getComputer("Server", "4 GB", "1024 GB", "3.1G Hz");
        System.out.println("Factory PC Config:" + pc);
        System.out.println("Factory Server Config:" + server);
    }

}

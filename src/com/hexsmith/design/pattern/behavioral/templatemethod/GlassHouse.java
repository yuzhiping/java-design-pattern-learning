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
package com.hexsmith.design.pattern.behavioral.templatemethod;

/**
 * @Description 
 * @author hexsmith
 * @date 2018年5月18日 下午2:43:20
 * @version v1.0
 */
public class GlassHouse extends HouseTemplate {

    @Override
    public void buildWalls() {

        System.out.println("Building Glass Walls");
    }

    @Override
    public void buildPillars() {

        System.out.println("Building Pillars with glass coating");
    }

}

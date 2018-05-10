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
package com.hexsmith.design.pattern.structural.composite;

/**
 * @Description 
 * @author hexsmith
 * @date 2018年5月10日 下午2:34:39
 * @version v1.0
 */
public class Triangle implements Shape {

    /* (non-Javadoc)
     * @see com.hexsmith.design.pattern.structural.composite.Shape#draw(java.lang.String)
     */
    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Triangle with color " + fillColor);

    }

}

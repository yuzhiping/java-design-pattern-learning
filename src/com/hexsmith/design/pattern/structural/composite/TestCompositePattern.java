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
 * @date 2018年5月10日 下午2:45:23
 * @version v1.0
 */
public class TestCompositePattern {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();
        Drawing drawing = new Drawing();
        drawing.add(tri1);
        drawing.add(tri1);

        drawing.add(cir);
        drawing.draw("Red");
        drawing.clear();
        drawing.add(tri);
        drawing.add(cir);
        drawing.draw("Green");

    }

}

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

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @author hexsmith
 * @date 2018年5月10日 下午2:39:05
 * @version v1.0
 */
public class Drawing implements Shape {

    // collection of Shapes
    private List<Shape> shapes = new ArrayList<>();

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.hexsmith.design.pattern.structural.composite.Shape#draw(java.lang.
     * String)
     */
    @Override
    public void draw(String fillColor) {
        for(Shape sh : shapes) {
            sh.draw(fillColor);
        }

    }
    
    public void add(Shape s) {
        this.shapes.add(s);
    }
    
    public void remove(Shape s) {
        this.shapes.remove(s);
    }
    
    public void clear() {
        System.out.println("Cleaning all the shapes from drawing");
        this.shapes.clear();
    }

}

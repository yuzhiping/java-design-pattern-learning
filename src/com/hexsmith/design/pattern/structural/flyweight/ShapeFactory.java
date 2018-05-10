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
package com.hexsmith.design.pattern.structural.flyweight;

import java.util.HashMap;

/**
 * @Description
 * @author hexsmith
 * @date 2018年5月10日 下午7:15:56
 * @version v1.0
 */
public class ShapeFactory {

    private static final HashMap<ShapeType, Shape> shapes = new HashMap<>();

    public static Shape getShape(ShapeType type) {
        Shape shapeImpl = shapes.get(type);
        if (shapeImpl == null) {
            if (type.equals(ShapeType.OVAL_FILL)) {
                shapeImpl = new Oval(true);
            } else if (type.equals(ShapeType.OVAL_NOFILL)) {
                shapeImpl = new Oval(false);
            } else if (type.equals(ShapeType.LINE)) {
                shapeImpl = new Line();
            }
            shapes.put(type, shapeImpl);
        }
        return shapeImpl;
    }

    static enum ShapeType {
        OVAL_FILL, OVAL_NOFILL, LINE;
    }

}

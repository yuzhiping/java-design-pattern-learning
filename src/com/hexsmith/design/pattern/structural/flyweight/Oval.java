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

import java.awt.Color;
import java.awt.Graphics;

/**
 * @Description
 * @author hexsmith
 * @date 2018年5月10日 下午7:13:07
 * @version v1.0
 */
public class Oval implements Shape {

    // intrinsic property
    private boolean fill;

    public Oval(boolean f) {
        this.fill = f;
        System.out.println("Creating Oval object with fill=" + f);
        // adding time delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics circle, int x, int y, int width, int height, Color color) {

        circle.setColor(color);
        circle.drawOval(x, y, width, height);
        if (fill) {
            circle.fillOval(x, y, width, height);
        }

    }

}

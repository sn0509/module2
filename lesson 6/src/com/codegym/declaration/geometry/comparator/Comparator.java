package com.codegym.declaration.geometry.comparator;

import com.codegym.declaration.geometry.Circle;
import com.codegym.declaration.geometry.Shape;

public interface Comparator<C extends Shape> {

    int compare(Circle c1, Circle c2);
}

package com.codegym.comparator;

import com.codegym.declaration.geometry.comparator.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        return 0;
    }

    @Override
    public int compare(com.codegym.declaration.geometry.Circle c1, com.codegym.declaration.geometry.Circle c2) {
        return 0;
    }
}

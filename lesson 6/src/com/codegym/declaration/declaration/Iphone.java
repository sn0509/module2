package com.codegym.declaration.declaration;

import com.codegym.declaration.declaration.Phone;

public class Iphone extends Phone {

    private boolean isVirtualHomeBtn;
    public Iphone(String colors, String model, long id, double size, double price, int quantity) {
        super(colors, model, id, size, price, quantity);


    }

    public boolean isVirtualHomeBtn() {
        return isVirtualHomeBtn;
    }

    public void setVirtualHomeBtn(boolean virtualHomeBtn) {
        isVirtualHomeBtn = virtualHomeBtn;
    }
}

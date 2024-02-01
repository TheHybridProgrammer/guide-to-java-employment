package com.guidetojavaemployment.designpatterns.creationalpattern.abstractfactory;

public class WinButton implements Button{


    @Override
    public String click() {
        return "Windows button clicked";
    }
}

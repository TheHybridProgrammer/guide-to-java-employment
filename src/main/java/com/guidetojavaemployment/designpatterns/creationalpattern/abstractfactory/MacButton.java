package com.guidetojavaemployment.designpatterns.creationalpattern.abstractfactory;

public class MacButton implements Button{
    @Override
    public String click() {
        return "Mac button clicked";
    }
}

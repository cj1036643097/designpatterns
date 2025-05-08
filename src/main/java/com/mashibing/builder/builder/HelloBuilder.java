package com.mashibing.builder.builder;

import com.mashibing.builder.product.Bike;

public class HelloBuilder extends Builder{
    @Override
    public void buildSeat() {
        System.out.println("碳纤维车架");
        mbike.setFrame("碳纤维");
    }

    @Override
    public void buildFrame() {
        System.out.println("真皮座椅");
        mbike.setSeat("真皮座椅");
    }


    @Override
    public Bike createBike() {
        return mbike;
    }
}

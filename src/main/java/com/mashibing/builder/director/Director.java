package com.mashibing.builder.director;

import com.mashibing.builder.builder.Builder;
import com.mashibing.builder.product.Bike;

public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }
    public Bike construct(){
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}

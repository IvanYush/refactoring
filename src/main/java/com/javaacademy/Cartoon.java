package com.javaacademy;

import lombok.Data;
import lombok.NonNull;

/**
 * Картон
 */
@Data
public class Cartoon {
    @NonNull
    public double weight;

//    public Cartoon(double weight) {
//        this.weight = weight;
//    }

//    public double getWeight() {
//        return weight;
//    }

//    public void setWeight(double weight) {
//        this.weight = weight;
//    }

//    @Override
//    public String toString() {
//        return "Cartoon{" +
//                "weight=" + weight +
//                '}';
//    }
}
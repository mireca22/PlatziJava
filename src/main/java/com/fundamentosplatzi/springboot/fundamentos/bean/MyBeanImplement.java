package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyBeanImplement implements Mybean {
    @Override
    public void print() {
        System.out.print("Hola desde mi implementacion del bean");
    }
}

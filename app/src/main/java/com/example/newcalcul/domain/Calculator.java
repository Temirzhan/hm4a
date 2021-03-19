package com.example.newcalcul.domain;

import android.media.VolumeShaper;
import android.widget.Switch;

public class Calculator {

    private double result;
    public void operation(double argumentOne, double argumentTwo, Operation operation){
        switch(operation){
            case ADD:
                result = argumentOne + argumentTwo;
                break;
            case DIV:
                result = argumentOne - argumentTwo;
                break;
            case DIST:
                result = argumentOne / argumentTwo;
                break;
            case MULT:
                result = argumentOne * argumentTwo;
                break;
        }
    }

    public double getResult() {
        return result;
    }
}

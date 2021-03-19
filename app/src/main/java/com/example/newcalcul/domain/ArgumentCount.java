package com.example.newcalcul.domain;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class ArgumentCount {
    private ArrayDeque<Integer> argumentOne;
    private ArrayDeque<Integer> argumentTwo;
    private Operation operation;

    public ArgumentCount() {
        this.operation = null;
        argumentTwo.add(0);
        argumentOne.add(0);
    }

    public void setArgument(int i){
        if(operation!=null)
            argumentOne.add(i);
        else
            argumentTwo.add(i);
    }



    public double getArgument() {
        if(operation!=null){
            return getArray(argumentOne);
        }else {
            return getArray(argumentTwo);
        }
    }

    public double getArgumentOne(){
        return getArray(argumentOne);
    }

    public double getArgumentTwo(){
        return getArray(argumentTwo);
    }

    public Operation getOperation() {
        return operation;
    }

    public double getArray(ArrayDeque<Integer> argument) {
        double count;
        count = argument.poll();
        for (int i = 0; i <argument.size(); i++) {
            count = (count*10) +  argument.poll();
        }
        return count;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }


}

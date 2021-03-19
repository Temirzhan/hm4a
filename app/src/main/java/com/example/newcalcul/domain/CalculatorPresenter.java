package com.example.newcalcul.domain;

import android.view.View;

import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textview.MaterialTextView;

public class CalculatorPresenter {

    private com.example.newcalcul.domain.Calculator calculator = new com.example.newcalcul.domain.Calculator();
    private com.example.newcalcul.domain.ArgumentCount argumentCount = new com.example.newcalcul.domain.ArgumentCount();
    private View button;
    private MaterialTextView text;




    public void pressButton(View button, final int num){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNumber(num);
                setText(argumentCount.getArgument());
            }
        });
    }
    public void pressButton(View button, Operation operation){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setOperation(operation);
            }
        });
    }


    private void setNumber(final int num){
        argumentCount.setArgument(num);
    }



    private void setOperation(Operation operation){
        if (operation!= Operation.EQUAL) {
            argumentCount.setOperation(operation);
        }
        else {
            calculator.operation(argumentCount.getArgumentOne(),argumentCount.getArgumentTwo(),argumentCount.getOperation());
            setText(calculator.getResult());
        }
    }

    public void setText( double result){
        text.setText(result +"");
    }
}

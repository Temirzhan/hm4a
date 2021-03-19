package com.example.newcalcul;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.newcalcul.domain.Calculator;
import com.example.newcalcul.domain.CalculatorPresenter;
import com.example.newcalcul.domain.Operation;

public class MainActivity extends AppCompatActivity {

    CalculatorPresenter calculatorPresenter = new CalculatorPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButtonChosser();

    }

    void initButtonChosser(){
        calculatorPresenter.pressButton(findViewById(R.id.button_0),0);
        calculatorPresenter.pressButton(findViewById(R.id.button_1),0);
        calculatorPresenter.pressButton(findViewById(R.id.button_2),0);
        calculatorPresenter.pressButton(findViewById(R.id.button_3),0);
        calculatorPresenter.pressButton(findViewById(R.id.button_4),0);
        calculatorPresenter.pressButton(findViewById(R.id.button_5),0);
        calculatorPresenter.pressButton(findViewById(R.id.button_6),0);
        calculatorPresenter.pressButton(findViewById(R.id.button_7),0);
        calculatorPresenter.pressButton(findViewById(R.id.button_8),0);
        calculatorPresenter.pressButton(findViewById(R.id.button_9),0);

        calculatorPresenter.pressButton(findViewById(R.id.button_plus), Operation.ADD);
        calculatorPresenter.pressButton(findViewById(R.id.button_minus),Operation.DIV);
        calculatorPresenter.pressButton(findViewById(R.id.button_multiplication),Operation.MULT);
        calculatorPresenter.pressButton(findViewById(R.id.button_division),Operation.DIST);
        calculatorPresenter.pressButton(findViewById(R.id.button_equal),Operation.EQUAL);
    }
}



package com.ashuo.netcalculator;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    private double accumulator, opr;
    private char op;
    private EditText display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        display = (EditText) findViewById(R.id.editString);
    }

    public void setModel(char c) {
        switch (c) {
            case 'C':
                opr = 0.0;
                accumulator= 0.0;
                break;
            case '+':
            case '-':
            case '*':
            case '/' :
                op = c;
                opr = accumulator;
                accumulator = 0.0;
                break;
            case '=' :
                switch (op) {
                    case '+':
                        accumulator = opr + accumulator;
                        break;
                    case '-':
                        accumulator = opr - accumulator;
                        break;
                    case '*':
                        accumulator = opr * accumulator;
                        break;
                    case '/':
                        accumulator = opr / accumulator;
                        break;
                    default:
                        break;
                }
                break;
            default:	// Assume '0'..'9' digit
                accumulator = accumulator * 10.0 + (c-'0');
                break;
        }
    }
    public void onClick0(View v) {
        setModel('0');
        display.setText(accumulator+"");
    }
    public void onClick1(View v) {
        setModel('1');
        display.setText(accumulator+"");
    }
    public void onClick2(View v) {
        setModel('2');
        display.setText(accumulator+"");
    }
    public void onClick3(View v) {
        setModel('3');
        display.setText(accumulator+"");
    }
    public void onClick4(View v) {
        setModel('4');
        display.setText(accumulator+"");
    }
    public void onClick5(View v) {
        setModel('5');
        display.setText(accumulator+"");
    }
    public void onClick6(View v) {
        setModel('6');
        display.setText(accumulator+"");
    }
    public void onClick7(View v) {
        setModel('7');
        display.setText(accumulator+"");
    }
    public void onClick8(View v) {
        setModel('8');
        display.setText(accumulator+"");
    }
    public void onClick9(View v) {
        setModel('9');
        display.setText(accumulator+"");
    }
    public void onClickPlus(View v) {
        setModel('+');
        display.setText(accumulator+"");
    }
    public void onClickMinus(View v) {
        setModel('-');
        display.setText(accumulator+"");
    }
    public void onClickTimes(View v) {
        setModel('*');
        display.setText(accumulator+"");
    }
    public void onClickDivide(View v) {
        setModel('/');
        display.setText(accumulator+"");
    }
    public void onClickC(View v) {
        setModel('C');
        display.setText(accumulator+"");
    }
    public void onClickEqual(View v) {
        setModel('=');
        display.setText(accumulator+"");
    }
}

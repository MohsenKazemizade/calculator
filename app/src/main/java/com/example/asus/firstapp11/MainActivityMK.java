package com.example.asus.firstapp11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivityMK extends AppCompatActivity {

    EditText editText;

    Button no1;
    Button no2;
    Button no3;
    Button no4;
    Button no5;
    Button no6;
    Button no7;
    Button no8;
    Button no9;
    Button no0;
    Button summation;
    Button subtraction;
    Button multiplication;
    Button division;
    Button percent;
    Button equal;
    Button decimalpoint;
    Button ac;
    Button add_sub;

    float valueNo1, valueNo2;

    boolean meSubtraction, meSummation, meDivision, meMultiplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apple_calulator);

        editText = (EditText) findViewById(R.id.edit1);
        no0 = (Button) findViewById(R.id.B0);
        no1 = (Button) findViewById(R.id.B1);
        no2 = (Button) findViewById(R.id.B2);
        no3 = (Button) findViewById(R.id.B3);
        no4 = (Button) findViewById(R.id.B4);
        no5 = (Button) findViewById(R.id.B5);
        no6 = (Button) findViewById(R.id.B6);
        no7 = (Button) findViewById(R.id.B7);
        no8 = (Button) findViewById(R.id.B8);
        no9 = (Button) findViewById(R.id.B9);
        summation = (Button) findViewById(R.id.summationButtom);
        subtraction = (Button) findViewById(R.id.subtractionButtom);
        division = (Button) findViewById(R.id.divisionButtom);
        multiplication = (Button) findViewById(R.id.multiplicationButtom);
        percent = (Button) findViewById(R.id.percentButtom);
        equal = (Button) findViewById(R.id.equalButtom);
        decimalpoint = (Button) findViewById(R.id.decimalpointButtom);
        ac = (Button) findViewById(R.id.acButtom);
        add_sub = (Button) findViewById(R.id.add_subButtom);


        no1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });
        no2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });
        no3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });
        no4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });
        no5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });
        no6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });
        no7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });
        no8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });
        no9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });
        no0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText() == null) {

                    editText.setText("");
                } else {
                    editText.setText(editText.getText() + "0");
                }
            }
        });
        decimalpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText() == null) {
                    editText.setText("");
                } else {
                    editText.setText(editText.getText() + ".");
                }
            }
        });
        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText() != null) {
                    editText.setText(null);
                }
            }
        });
        summation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null) {
                    editText.setText(null);
                } else {
                    valueNo1 = Float.parseFloat(editText.getText() + "");
                    meSummation = true;
                    editText.setText(null);
                }
            }
        });
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null) {
                    editText.setText(null);
                } else {
                    valueNo1 = Float.parseFloat(editText.getText() + "");
                    meSubtraction = true;
                    editText.setText(null);
                }
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null) {
                    editText.setText(null);
                } else {
                    valueNo1 = Float.parseFloat(editText.getText() + "");
                    meDivision = true;
                    editText.setText(null);
                }
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText == null) {
                    editText.setText(null);
                } else
//                    if (editText.contains("."))
                    {
                    valueNo1 = Float.parseFloat(editText.getText() + "");
                    meMultiplication = true;
                    editText.setText(null);
                }
//                else if (!editText.contains(".")){
//                    valueNo1 = Integer.parseInt(editText.getText() + "");
//                    meMultiplication = true;
//                    editText.setText(null);
//                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueNo2 = Float.parseFloat(editText.getText() + "");
                if (meSummation == true) {
                    editText.setText(valueNo1 + valueNo2 + "");
                    meSummation = false;
                }
                if (meSubtraction == true) {
                    editText.setText(valueNo1 - valueNo2 + "");
                    meSubtraction = false;
                }
                if (meDivision == true) {
                    editText.setText(valueNo1 / valueNo2 + "");
                    meDivision = false;
                }
                if (meMultiplication == true) {
                    editText.setText(valueNo1 * valueNo2 + "");
                    meMultiplication = false;
                }
            }
        });

    }

}

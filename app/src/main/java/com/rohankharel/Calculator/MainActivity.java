package com.rohankharel.Calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView editText;
    double input1 = 0 , input2 =0;
    boolean Addition, Subtract, Multiply, Division, decimal, Percentage;
    private Button btnPercent, btnMultiply, btnZero, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPlus, btnMinus, btnDivide, btnEqualsTo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Binding
        btnPercent = findViewById(R.id.btnPercent);
        editText = findViewById(R.id.etText);
        btnPlus = findViewById(R.id.btnPlus);
        btnDivide = findViewById(R.id.btnDivide);
        btnMinus = findViewById(R.id.btnMinus);
        btnEqualsTo = findViewById(R.id.btnEqualsTo);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnZero = findViewById(R.id.btnZero);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);



        //Setting Custom Value To Android
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editText.setText(editText.getText() + "1");

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });



        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().length() !=0){
                    input1 = Float.parseFloat(editText.getText() + "");
                    Addition = true;
                    decimal =false;
                    editText.setText(null);
                }
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().length() !=0){
                    input1 = Float.parseFloat(editText.getText() + "");
                    Subtract = true;
                    decimal = false;
                    editText.setText(null);
                }
            }
        });
        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().length() !=0){
                    input1 = Float.parseFloat(editText.getText() + "");
                    Percentage = true;
                    decimal = false;
                    editText.setText(null);


                }
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().length() !=0){
                    input1 = Float.parseFloat(editText.getText() + "");
                    Multiply = true;
                    decimal = false;
                    editText.setText(null);
                }
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText.getText().length() !=0){
                    input1 = Float.parseFloat(editText.getText() + "");
                    Division = true;
                    decimal = false;
                    editText.setText(null);

                }
            }
        });
        btnEqualsTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Addition || Subtract || Multiply || Division || Percentage ){
                    input2 = Float.parseFloat(editText.getText() + "");
                }
                if (Addition){
                    editText.setText(input1 + input2 + "");
                    Addition = false;
                }
                if (Subtract){
                    editText.setText(input1 - input2 + "");
                    Subtract = false;
                }
                if (Percentage){
                    editText.setText((input1/input2) * 100 + "");
                    Percentage = false;
                }


                if(Multiply){
                    editText.setText(input1 * input2 + "");
                    Multiply = false;
                }

                if(Division){
                    editText.setText(input1 / input2 + "");
                    Division = false;
                }
            }
        });





    }
}
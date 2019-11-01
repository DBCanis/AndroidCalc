package com.caniss.mysimplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    TextView mAnswer,mException;
    EditText mEdtFnum,mEdtSnum;
    Button mBtnAdd,mBtnSubtract,mBtnDivide,mBtnMultiply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        mAnswer = findViewById(R.id.tvAnswer);
        mException = findViewById(R.id.tvExceptions);
        mEdtFnum = findViewById(R.id.edtFnum);
        mEdtSnum = findViewById(R.id.edtSnum);
        mBtnAdd = findViewById(R.id.btnAdd);
        mBtnSubtract = findViewById(R.id.btnSubtraction);
        mBtnDivide = findViewById(R.id.btnDivision);
        mBtnMultiply = findViewById(R.id.btnMultiplication);

        //Start setting the onclick listeners
        mBtnAdd .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start bt getting the data from the user
                String FirstNumber = mEdtFnum.getText().toString().trim();
                String SecondNumber = mEdtSnum.getText().toString().trim();
                //Check if someone is trying to submit empty fields
                if (FirstNumber.isEmpty()){
                    mException.setText("Please fill the First Number field");
                }else if (SecondNumber.isEmpty()){
                    mException.setText("Please fill the Second Number field");
                }else {
                    mException.setText("");
                    //Convert the received numbers to double data type and calculate them
                    Double FirstNumberConv = Double.parseDouble(FirstNumber);
                    Double SecondNumberConv = Double.parseDouble(SecondNumber);
                    Double result = FirstNumberConv + SecondNumberConv;
                    //Convert the result to string before displaying to the user
                    String ResultConv = String.valueOf(result);
                    //Finally display the answer to the user using mAnswer edit text
                    mAnswer.setText(ResultConv);
                }
            }
        });
        mBtnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start bt getting the data from the user
                String FirstNumber = mEdtFnum.getText().toString().trim();
                String SecondNumber = mEdtSnum.getText().toString().trim();
                //Check if someone is trying to submit empty fields
                if (FirstNumber.isEmpty()){
                    mException.setText("Please fill the First Number field");
                }else if (SecondNumber.isEmpty()){
                    mException.setText("Please fill the Second Number field");
                }else {
                    mException.setText("");
                    //Convert the received numbers to double data type and calculate them
                    Double FirstNumberConv = Double.parseDouble(FirstNumber);
                    Double SecondNumberConv = Double.parseDouble(SecondNumber);
                    Double result = FirstNumberConv - SecondNumberConv;
                    //Convert the result to string before displaying to the user
                    String ResultConv = String.valueOf(result);
                    //Finally display the answer to the user using mAnswer edit text
                    mAnswer.setText(ResultConv);
                }
            }
        });
        mBtnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start bt getting the data from the user
                String FirstNumber = mEdtFnum.getText().toString().trim();
                String SecondNumber = mEdtSnum.getText().toString().trim();
                //Check if someone is trying to submit empty fields
                if (FirstNumber.isEmpty()){
                    mException.setText("Please fill the First Number field");
                }else if (SecondNumber.isEmpty()){
                    mException.setText("Please fill the Second Number field");
                }else {
                    mException.setText("");
                    //Convert the received numbers to double data type and calculate them
                    Double FirstNumberConv = Double.parseDouble(FirstNumber);
                    Double SecondNumberConv = Double.parseDouble(SecondNumber);
                    Double result = FirstNumberConv / SecondNumberConv;
                    //Convert the result to string before displaying to the user
                    String ResultConv = String.valueOf(result);
                    //Finally display the answer to the user using mAnswer edit text
                    mAnswer.setText(ResultConv);
                }
            }
        });
        mBtnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start bt getting the data from the user
                String FirstNumber = mEdtFnum.getText().toString().trim();
                String SecondNumber = mEdtSnum.getText().toString().trim();
                //Check if someone is trying to submit empty fields
                if (FirstNumber.isEmpty()){
                    mException.setText("Please fill the First Number field");
                }else if (SecondNumber.isEmpty()){
                    mException.setText("Please fill the Second Number field");
                }else {
                    mException.setText("");
                    //Convert the received numbers to double data type and calculate them
                    Double FirstNumberConv = Double.parseDouble(FirstNumber);
                    Double SecondNumberConv = Double.parseDouble(SecondNumber);
                    Double result = FirstNumberConv * SecondNumberConv;
                    //Convert the result to string before displaying to the user
                    String ResultConv = String.valueOf(result);
                    //Finally display the answer to the user using mAnswer edit text
                    mAnswer.setText(ResultConv);
                }
            }
        });
    }
}

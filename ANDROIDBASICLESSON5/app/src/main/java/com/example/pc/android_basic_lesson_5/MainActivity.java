package com.example.pc.android_basic_lesson_5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9;

    Button buttonCong, buttonTru, buttonNhan, buttonChia, buttonResult;

    Button buttonDot, buttonAc;

    TextView tvInput, tvOutput;

    float mValueOne = 0, mValueTwo = 0, mValueThree = 0;

    boolean isCong = false, isTru = false, isNhan = false, isChia = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        setEvent();
        isCong = false;
        isTru = false;
        isNhan = false;
        isChia = false;
    }


    private void initView() {
        button0 = findViewById(R.id.btn0);
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        buttonDot = findViewById(R.id.btnDot);

        tvInput = findViewById(R.id.tvinput);
        tvOutput = findViewById(R.id.tvoutput);

        buttonCong = findViewById(R.id.btncong);
        buttonTru = findViewById(R.id.btntru);
        buttonNhan = findViewById(R.id.btnnhan);
        buttonChia = findViewById(R.id.btnchia);

        buttonResult = findViewById(R.id.btnResult);

        buttonAc = findViewById(R.id.btnAC);
    }


    private void setEvent() {
        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonDot.setOnClickListener(this);

        buttonCong.setOnClickListener(this);
        buttonTru.setOnClickListener(this);
        buttonNhan.setOnClickListener(this);
        buttonChia.setOnClickListener(this);
        buttonResult.setOnClickListener(this);

        buttonAc.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn0:
                tvInput.setText(tvInput.getText() + "0");
                break;
            case R.id.btn1:
                tvInput.setText(tvInput.getText() + "1");
                break;
            case R.id.btn2:
                tvInput.setText(tvInput.getText() + "2");
                break;
            case R.id.btn3:
                tvInput.setText(tvInput.getText() + "3");
                break;
            case R.id.btn4:
                tvInput.setText(tvInput.getText() + "4");
                break;
            case R.id.btn5:
                tvInput.setText(tvInput.getText() + "5");
                break;
            case R.id.btn6:
                tvInput.setText(tvInput.getText() + "6");
                break;
            case R.id.btn7:
                tvInput.setText(tvInput.getText() + "7");
                break;
            case R.id.btn8:
                tvInput.setText(tvInput.getText() + "8");
                break;
            case R.id.btn9:
                tvInput.setText(tvInput.getText() + "9");
                break;
            case R.id.btnDot:
                tvInput.setText(tvInput.getText() + ".");
                break;
            case R.id.btncong:
                if (tvInput.equals("")) {
                    tvInput.setText("");
                } else {
                    mValueOne = Float.parseFloat(tvInput.getText() + "");
                    isCong = true;
                    tvInput.setText("");
                }
                break;
            case R.id.btntru:
                if (tvInput.equals("")) {
                    tvInput.setText("");
                } else {
                    mValueOne = Float.parseFloat(tvInput.getText() + "");
                    isTru = true;
                    tvInput.setText("");
                }
                break;
            case R.id.btnnhan:
                if (tvInput.equals("")) {
                    tvInput.setText("");
                } else {
                    Log.d("Dulieu", "onClick: " + isNhan);
                    mValueOne = Float.parseFloat(tvInput.getText() + "");
                    isNhan = true;
                    Log.d("Dulieu", "onClick: " + isNhan);
                    tvInput.setText("");
                }
                break;
            case R.id.btnchia:
                if (tvInput.equals("")) {
                    tvInput.setText("");
                } else {
                    mValueOne = Float.parseFloat(tvInput.getText() + "");
                    isChia = true;
                    tvInput.setText("");
                }
                break;
            case R.id.btnAC:
                tvInput.setText("");
                tvOutput.setText("");
                break;
            case R.id.btnResult:
                if (tvInput.equals("")) {
                    tvOutput.setText("");
                }else {
                    mValueTwo = Float.parseFloat(tvInput.getText() + "");
                    if (isCong == true) {
                        float result = mValueOne + mValueTwo;
                        tvOutput.setText(String.valueOf(result));
                        isCong = false;
                    } else if (isTru == true) {
                        tvOutput.setText(mValueOne - mValueTwo + "");
                        isTru = false;
                    } else if (isChia == true) {
                        tvOutput.setText(mValueOne / mValueTwo + "");
                        isChia = false;
                    } else if (isNhan == true) {
                        tvOutput.setText(mValueOne * mValueTwo + "");
                        isNhan = false;
                    }
                }
                break;
        }

    }

    private void Calculator() {

    }
}

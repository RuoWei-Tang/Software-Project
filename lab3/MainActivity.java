package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;
import android.graphics.Color;
import android.annotation.SuppressLint;


public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button zero,count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        zero = (Button) findViewById(R.id.button_zero);
        count = (Button) findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }

    @SuppressLint("SetTextI18n")
    public void countUp(View view) {
        mCount++;
        if (mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
            if(mCount%2==0)
                count.setBackgroundColor(Color.rgb(0,133,119));
            else
                count.setBackgroundColor(Color.rgb(2,200,200));
        }
    }
    @SuppressLint("SetTextI18n")
    public void goZero(View view) {
        mCount=0;
        if (mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
                count.setBackgroundColor(Color.rgb(2,200,200));
                zero.setBackgroundColor(Color.rgb(200,2,2));
        }
    }

}

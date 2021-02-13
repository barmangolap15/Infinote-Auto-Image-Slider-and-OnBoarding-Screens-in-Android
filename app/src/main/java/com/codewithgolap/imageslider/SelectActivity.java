package com.codewithgolap.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.codewithgolap.imageslider.onboadingOne.OnBoardingDesignOne;
import com.codewithgolap.imageslider.onboardingForth.OnBoardingForthActivity;
import com.codewithgolap.imageslider.onboardingSecond.OnBoardingTwoActivity;
import com.codewithgolap.imageslider.onboardingThird.OnBoardingActivityThree;

public class SelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        Button example1 = findViewById(R.id.example1);
        example1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), OnBoardingDesignOne.class));
            }
        });

        Button example2 = findViewById(R.id.example2);
        example2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), OnBoardingTwoActivity.class));
            }
        });

        Button example3 = findViewById(R.id.example3);
        example3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), OnBoardingActivityThree.class));
            }
        });

        Button example4 = findViewById(R.id.example4);
        example4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), OnBoardingForthActivity.class));
            }
        });
    }
}
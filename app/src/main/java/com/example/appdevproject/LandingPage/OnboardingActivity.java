package com.example.appdevproject.LandingPage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.appdevproject.Pages.RegistrationPage;
import com.example.appdevproject.R;


public class OnboardingActivity extends AppCompatActivity {
    Button getStarted;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        getStarted = findViewById(R.id.btngetStarted);
        getStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OnboardingActivity.this,
                        RegistrationPage.class));
            }
        });
    }
}
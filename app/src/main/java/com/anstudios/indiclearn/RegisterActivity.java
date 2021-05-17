package com.anstudios.indiclearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void email_login(View view) {
        startActivity(new Intent(RegisterActivity.this,EmailLogin.class));
        overridePendingTransition(R.anim.slide_next,R.anim.slide_down);
    }
}
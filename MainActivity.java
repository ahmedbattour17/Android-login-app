package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText usernameEditText;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
    }

    public void loginButtonClicked(View view) {
        String username = usernameEditText.getText().toString();
        String password = passwordEditText.getText().toString();

        // Set your custom username and password for testing
        String customUsername = "ahmed";
        String customPassword = "ahmed";

        // Compare the entered username and password with your custom values
        if (username.equals(customUsername) && password.equals(customPassword)) {
            // Successful login
            Toast.makeText(MainActivity.this, "Login successful", Toast.LENGTH_SHORT).show();
        } else {
            // Failed login
            Toast.makeText(this, "Login failed", Toast.LENGTH_SHORT).show();
        }
    }

}


package com.example.jidnyasa_today;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

/**
 * LoginActivity - First screen of the app
 * Allows parents to enter their phone number to receive OTP
 */
public class LoginActivity extends AppCompatActivity {
    
    // UI Elements - declare them here
    private EditText phoneNumberInput;
    private Button getOtpButton;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        // Initialize UI elements by finding them from XML layout
        phoneNumberInput = findViewById(R.id.phoneNumberInput);
        getOtpButton = findViewById(R.id.getOtpButton);
        
        // Set up button click listener
        getOtpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleGetOtp();
            }
        });
    }
    
    /**
     * Method to handle "Get OTP" button click
     */
    private void handleGetOtp() {
        // Get the phone number entered by user
        String phoneNumber = phoneNumberInput.getText().toString().trim();
        
        // Validate phone number
        if (TextUtils.isEmpty(phoneNumber)) {
            // Show error if empty
            Toast.makeText(this, "Please enter phone number", Toast.LENGTH_SHORT).show();
            return;
        }
        
        // Check if phone number is 10 digits
        if (phoneNumber.length() != 10) {
            Toast.makeText(this, "Please enter valid 10-digit phone number", Toast.LENGTH_SHORT).show();
            return;
        }
        
        // If validation passes, send OTP (you'll implement this later with API)
        sendOtp(phoneNumber);
    }
    
    /**
     * Method to send OTP (to be implemented with backend API)
     */
    private void sendOtp(String phoneNumber) {
        // For now, just navigate to OTP screen
        // Later, you'll add API call here
        
        Toast.makeText(this, "OTP sent to " + phoneNumber, Toast.LENGTH_SHORT).show();
        
        // Create intent to go to OTP verification screen
        Intent intent = new Intent(LoginActivity.this, OTPVerificationActivity.class);
        // Pass phone number to next screen
        intent.putExtra("PHONE_NUMBER", phoneNumber);
        startActivity(intent);
    }
}

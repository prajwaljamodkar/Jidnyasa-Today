package com.jidnyasa.app.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.jidnyasa.app.utils.SharedPrefManager;

/**
 * OTPVerificationActivity - Second screen
 * User enters the OTP received on their phone
 */
public class OTPVerificationActivity extends AppCompatActivity {
    
    // UI Elements
    private EditText otpInput;
    private Button verifyButton;
    private TextView resendOtpText;
    private TextView phoneNumberText;
    
    private String phoneNumber;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        
        // Get phone number from previous screen
        phoneNumber = getIntent().getStringExtra("PHONE_NUMBER");
        
        // Initialize UI elements
        otpInput = findViewById(R.id.otpInput);
        verifyButton = findViewById(R.id.verifyButton);
        resendOtpText = findViewById(R.id.resendOtpText);
        phoneNumberText = findViewById(R.id.phoneNumberText);
        
        // Display phone number
        if (phoneNumberText != null && phoneNumber != null) {
            phoneNumberText.setText("+91 " + phoneNumber);
        }
        
        // Set up verify button click
        verifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleVerifyOtp();
            }
        });
        
        // Set up resend OTP click
        resendOtpText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resendOtp();
            }
        });
    }
    
    /**
     * Method to handle OTP verification
     */
    private void handleVerifyOtp() {
        String otp = otpInput.getText().toString().trim();
        
        // Validate OTP
        if (TextUtils.isEmpty(otp)) {
            Toast.makeText(this, "Please enter OTP", Toast.LENGTH_SHORT).show();
            return;
        }
        
        if (otp.length() != 6) {
            Toast.makeText(this, "Please enter 6-digit OTP", Toast.LENGTH_SHORT).show();
            return;
        }
        
        // Verify OTP (implement with backend later)
        verifyOtp(otp);
    }
    
    /**
     * Method to verify OTP with backend (to be implemented)
     */
    private void verifyOtp(String otp) {
        // For now, accept any 6-digit OTP for testing
        // Later, you'll verify with backend API
        
        // Demo: Accept "123456" as valid OTP
        if (otp.equals("123456")) {
            // OTP is correct
            Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show();
            
            // Save login state using SharedPreferences
            SharedPrefManager.getInstance(this).saveLoginState(true);
            SharedPrefManager.getInstance(this).savePhoneNumber(phoneNumber);
            
            // Navigate to Dashboard
            Intent intent = new Intent(OTPVerificationActivity.this, DashboardActivity.class);
            // Clear back stack so user can't go back to login
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();
        } else {
            // Wrong OTP
            Toast.makeText(this, "Invalid OTP. Try again.", Toast.LENGTH_SHORT).show();
        }
    }
    
    /**
     * Method to resend OTP
     */
    private void resendOtp() {
        Toast.makeText(this, "OTP resent to " + phoneNumber, Toast.LENGTH_SHORT).show();
        // Implement API call to resend OTP
    }
}

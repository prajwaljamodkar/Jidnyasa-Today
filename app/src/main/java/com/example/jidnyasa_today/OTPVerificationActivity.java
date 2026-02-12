package com.example.jidnyasa_today;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OTPVerificationActivity extends AppCompatActivity {

    private EditText[] otpFields = new EditText[4];
    private Button verifyButton;
    private TextView resendOtpText, phoneNumberText;

    private String phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        // Get phone number
        phoneNumber = getIntent().getStringExtra("PHONE_NUMBER");

        // Bind views
        otpFields[0] = findViewById(R.id.otp1);
        otpFields[1] = findViewById(R.id.otp2);
        otpFields[2] = findViewById(R.id.otp3);
        otpFields[3] = findViewById(R.id.otp4);

        verifyButton = findViewById(R.id.verifyButton);
        resendOtpText = findViewById(R.id.resendOtpText);
        phoneNumberText = findViewById(R.id.phoneNumberText);

        // Show masked number
        if (phoneNumber != null && phoneNumber.length() >= 4) {
            phoneNumberText.setText("+91 •••• •• " +
                    phoneNumber.substring(phoneNumber.length() - 4));
        }

        setupOtpInputs();

        verifyButton.setOnClickListener(v -> verifyOtp());
        resendOtpText.setOnClickListener(v ->
                Toast.makeText(this, "OTP resent to " + phoneNumber, Toast.LENGTH_SHORT).show()
        );
    }

    // ---------------- OTP LOGIC ----------------

    private void setupOtpInputs() {
        for (int i = 0; i < otpFields.length; i++) {
            final int index = i;

            otpFields[i].addTextChangedListener(new TextWatcher() {
                @Override public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
                @Override public void afterTextChanged(Editable s) {}

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    if (s.length() == 1 && index < otpFields.length - 1) {
                        otpFields[index + 1].requestFocus();
                    }
                }
            });

            otpFields[i].setOnKeyListener((v, keyCode, event) -> {
                if (event.getAction() == KeyEvent.ACTION_DOWN &&
                        keyCode == KeyEvent.KEYCODE_DEL &&
                        otpFields[index].getText().length() == 0 &&
                        index > 0) {

                    otpFields[index - 1].requestFocus();
                    otpFields[index - 1].setSelection(
                            otpFields[index - 1].getText().length()
                    );
                    return true;
                }
                return false;
            });
        }
    }

    private void verifyOtp() {
        StringBuilder otp = new StringBuilder();

        for (EditText field : otpFields) {
            String digit = field.getText().toString().trim();
            if (digit.isEmpty()) {
                Toast.makeText(this, "Please enter complete OTP", Toast.LENGTH_SHORT).show();
                return;
            }
            otp.append(digit);
        }

        String finalOtp = otp.toString();

        // DEMO check
        if (finalOtp.equals("1234")) {
            Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show();

            SharedPrefManager.getInstance(this).saveLoginState(true);
            SharedPrefManager.getInstance(this).savePhoneNumber(phoneNumber);

            Intent intent = new Intent(this, DashboardActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "Invalid OTP. Try again.", Toast.LENGTH_SHORT).show();
        }
    }
}
package com.optisoft.otpviewlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   // private OTPVIEW otpview;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     /*   otpview = findViewById(R.id.otp);
        button = findViewById(R.id.submit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (otpview.isValidOtp()) {
                    Toast.makeText(MainActivity.this, otpview.getOtpVal(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "not vaild otp", Toast.LENGTH_SHORT).show();
                }
            }
        });*/

    }
}

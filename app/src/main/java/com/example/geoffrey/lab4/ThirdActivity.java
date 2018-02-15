package com.example.geoffrey.lab4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    Button smsButton;
    EditText text;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        smsButton = (Button) findViewById(R.id.smsbutton);

        text= (EditText) findViewById(R.id.message);

        smsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                message = text.getText().toString();

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage("+524421071633", null, message,null,null);

                text.setText("Sms sent");
                finish();
            }
        });
    }
}



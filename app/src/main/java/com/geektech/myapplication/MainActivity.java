package com.geektech.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText ed_email,ed_text,ed_password;
Button btn_send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed_email = findViewById(R.id.ed_email);
        ed_text = findViewById(R.id.ed_tema);
        ed_password = findViewById(R.id.text2);
        btn_send = findViewById(R.id.btn_send);
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW)
                        .setType("message/rfc822")
                        .putExtra(Intent.EXTRA_EMAIL,ed_email.getText().toString())
                        .putExtra(Intent.EXTRA_SUBJECT, ed_text.getText().toString())
                        .putExtra(Intent.EXTRA_TEXT, ed_password.getText().toString());
                startActivity(intent);
            }
        });
    }
}
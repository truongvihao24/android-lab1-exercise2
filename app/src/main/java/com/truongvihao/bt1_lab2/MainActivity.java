package com.truongvihao.bt1_lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button callButton;
    private EditText phoneNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        callButton=findViewById(R.id.callButton);
        phoneNumber=findViewById(R.id.phoneNumber);

        callButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calIntent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+phoneNumber.getText()));
                calIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(calIntent);
            }
        });
    }
}
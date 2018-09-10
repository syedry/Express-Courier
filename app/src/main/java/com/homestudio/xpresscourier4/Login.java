package com.homestudio.xpresscourier4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        Button user = (Button) findViewById(R.id.button2);
        user.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View view){
                Intent intent = new Intent(Login.this, Cust_login.class);
                startActivity(intent);
            }
        });

        Button admin = (Button) findViewById(R.id.button);
        admin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Admin_login.class);
                startActivity(intent);
            }
        });
    }
}

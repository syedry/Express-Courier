package com.homestudio.xpresscourier4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView user;
    Button b1;
    Button b2;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        user = (TextView) findViewById(R.id.textView4);
     //   sessionManager = new SessionManager(getApplicationContext());
     //   HashMap<String, String> User = sessionManager.getUserDetails();
     //   s = User.get(SessionManager.KEY_username);
        user.setText(s);
        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, com.homestudio.xpresscourier4.New_courier.class);
                startActivity(i);
            }
        });

        b2 = (Button) findViewById(R.id.button6);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, com.homestudio.xpresscourier4.TrackCourier.class);
                startActivity(i);
            }
        });
    }
}

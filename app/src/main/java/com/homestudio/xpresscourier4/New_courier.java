package com.homestudio.xpresscourier4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class New_courier extends AppCompatActivity {

    private final AppCompatActivity activity = New_courier.this;
    /*DatabaseHelper helper;
    SessionManager sessionManager;
    Courier courier;

    TextView t;
    String s;
    EditText e1;
    RadioGroup rg;
    RadioButton rb;
    EditText e2;
    Button b; */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_courier);
      /*  t = (TextView) findViewById(R.id.textView6);
        sessionManager = new SessionManager(getApplicationContext());
        HashMap<String, String> user = sessionManager.getUserDetails();
        s = user.get(SessionManager.KEY_username);
        t.setText(s);
        initObjects();
        e1 = (EditText) findViewById(R.id.editText9);
        rg = (RadioGroup) findViewById(R.id.radioGroup2);
        e2 = (EditText) findViewById(R.id.editText11);
        b = (Button) findViewById(R.id.button7);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                post(v);
            }
        });  */
    }

    /*public void post(View v) {
        if (e1.length()!=0 && e2.length()!=0){
            courier.setUname(t.getText().toString());
            courier.setPack(e1.getText().toString());
            int selected = rg.getCheckedRadioButtonId();
            rb = (RadioButton) findViewById(selected);
            courier.setHandling(rb.getText().toString());
            courier.setAddress(e2.getText().toString());
            courier.setStatus("Pending");
            boolean insertData = helper.addCourier(courier);
            if (insertData) {
                Toast.makeText(this,"Post Successfull",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(New_courier.this, MainActivity.class);
                startActivity(intent);
            } else {
                toastMessage("Something went wrong");
            }

            e1.setText(null);
            e2.setText(null);
            rb.setChecked(false);
        } else {
            toastMessage("You must put something in the text field!");
        }
        }


    private void initObjects() {
        helper = new DatabaseHelper(activity);
        courier = new Courier();
    }

    private void toastMessage(String message){
        Toast.makeText(this,message, Toast.LENGTH_SHORT).show();
    }
    */
}

package com.homestudio.xpresscourier4;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.HashMap;

public class Cust_signup extends AppCompatActivity {

    String HttpURL = "https://syedrizwan-sy.000webhostapp.com/register.php";
    HashMap<String,String> hashMap = new HashMap<>();
    HttpParse httpParse = new HttpParse();
    Boolean CheckEditText ;
    String finalResult;
    Button bt;
    EditText editText1;
    EditText editText2;
    EditText editText3;
    EditText editText4;
    RadioGroup rg;
    RadioButton rb;
    String name, email, password, phone, sex;
    private ProgressDialog pDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cust_signup);
        getSupportActionBar().hide();

        editText1 = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText6);
        editText4 = (EditText) findViewById(R.id.editText8);
        rg = (RadioGroup) findViewById(R.id.radioGroup);

        bt = (Button) findViewById(R.id.button3);
        bt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // Checking whether EditText is Empty or Not
                CheckEditTextIsEmptyOrNot();

                if(CheckEditText){

                    // If EditText is not empty and CheckEditText = True then this block will execute.

                    UserRegisterFunction(name,email,password,phone,sex);

                }
                else {

                    // If EditText is empty then this block will execute .
                    Toast.makeText(Cust_signup.this, "Please fill all fields.", Toast.LENGTH_LONG).show();

                }
            }
        });

    }

    public void CheckEditTextIsEmptyOrNot(){

        name = editText1.getText().toString();
        email = editText2.getText().toString();
        password = editText3.getText().toString();
        phone = editText4.getText().toString();
        int selected = rg.getCheckedRadioButtonId();
        rb = (RadioButton) findViewById(selected);
        sex = rb.getText().toString();


        if(TextUtils.isEmpty(name) || TextUtils.isEmpty(email) || TextUtils.isEmpty(password) || TextUtils.isEmpty(phone))
        {

            CheckEditText = false;

        }
        else {

            CheckEditText = true ;
        }

    }

    public void UserRegisterFunction(final String name, final String email, final String password, final String phone, final String sex){

        class UserRegisterFunctionClass extends AsyncTask<String,Void,String> {

            @Override
            protected void onPreExecute() {
                super.onPreExecute();

                pDialog = ProgressDialog.show(Cust_signup.this,"Loading Data",null,true,true);
            }

            @Override
            protected void onPostExecute(String httpResponseMsg) {

                super.onPostExecute(httpResponseMsg);

                pDialog.dismiss();

                Toast.makeText(Cust_signup.this,httpResponseMsg.toString(), Toast.LENGTH_LONG).show();

            }

            @Override
            protected String doInBackground(String... params) {

                hashMap.put("name",params[0]);

                hashMap.put("email",params[1]);

                hashMap.put("password",params[2]);

                hashMap.put("phone",params[3]);

                hashMap.put("sex",params[4]);

                finalResult = httpParse.postRequest(hashMap, HttpURL);

                return finalResult;
            }
        }

        UserRegisterFunctionClass userRegisterFunctionClass = new UserRegisterFunctionClass();

        userRegisterFunctionClass.execute(name,email,password,phone,sex);
    }


}

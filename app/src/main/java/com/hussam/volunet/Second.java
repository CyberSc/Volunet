package com.hussam.volunet;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.parse.Parse;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class Second extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        overridePendingTransition(R.anim.trans_left_in, R.anim.trans_left_out);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("OKmvKtmzs4nTvOBorCsTG1Jda4lgnWo5nOrr4Oby")
                .clientKey("DHgJ3kDMRYlb73lpSwjg6wr6zuik2Egepr1ZWj0Q")
                .server("https://parseapi.back4app.com/").build()
        );

        final EditText etName = (EditText) findViewById(R.id.etName);
        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final boolean isVolunteer = true;

        final ImageButton bRegister = (ImageButton) findViewById(R.id.bRegister);

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ParseUser user = new ParseUser();
                user.setUsername("User");
                user.setEmail(etEmail.getText().toString());
                user.setPassword(etPassword.getText().toString());
                user.put("Name", etName.getText().toString());
                user.put("isVolunteer", isVolunteer);
                user.signUpInBackground(new SignUpCallback() {
                    @Override
                    public void done(ParseException e) {
                        if (e == null) {
                            //Register Successful
                            //you can display sth or do sth

                        } else {
                            //Register Fail
                            //get error by calling e.getMessage()
                        }
                    }
                });
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.trans_right_in, R.anim.trans_right_out);
    }

    public void sendMessage3 (View view) {
        super.onBackPressed();
        overridePendingTransition(R.anim.trans_right_in, R.anim.trans_right_out);
    }
}

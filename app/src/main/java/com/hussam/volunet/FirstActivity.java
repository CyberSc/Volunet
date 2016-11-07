package com.hussam.volunet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


    }
    public void sendMessage3(View view) {
        Intent intent2 = new Intent (this, Third.class);
        startActivity(intent2);
    }
    public void sendMessage2(View view) {
        Intent intent = new Intent(this, Second.class);
        startActivity(intent);
    }
    public void sendMessageL (View view) {
        Intent intent5 = new Intent (this,login.class);
        startActivity(intent5);
    }

}

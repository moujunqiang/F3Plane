package com.example.lichang.plane;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Back extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        MainActivity.activityList.add(this);
    }

}


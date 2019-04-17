package com.example.lichang.plane;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button button1, button2, button3, button4;
    public static List <Activity> activityList = new LinkedList ();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        button1 = findViewById ( R.id.start );
        button2 = findViewById ( R.id.online );
        button3 = findViewById ( R.id.rank );
        button4 = findViewById ( R.id.back );
        button1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( MainActivity.this, Start.class );
                startActivity ( intent );
            }
        } );
        button2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( MainActivity.this, Online.class );
                startActivity ( intent );
            }
        } );
        button3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( MainActivity.this, Rank.class );
                startActivity ( intent );
            }
        } );
        button4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                exit ();
            }
        } );
    }

    public void exit() {
        for (Activity act : activityList) {
            act.finish ();
        }
        System.exit ( 0 );
    }
}

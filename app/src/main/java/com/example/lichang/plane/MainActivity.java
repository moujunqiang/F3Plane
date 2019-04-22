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
    private Button button1, button3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        button1 = findViewById ( R.id.start );
        button3 = findViewById ( R.id.rank );
        button1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( MainActivity.this, Start.class );
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

    }
}

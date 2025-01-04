package com.example.lirikku;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {
    Button bt_ca, bt_ag, bt_be, bt_dw, bt_ed, bt_fe, bt_gf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        bt_ca = findViewById(R.id.bt_ca);
        bt_ag = findViewById(R.id.bt_ag);
        bt_be = findViewById(R.id.bt_be);
        bt_dw = findViewById(R.id.bt_dw);
        bt_ed = findViewById(R.id.bt_ed);
        bt_fe = findViewById(R.id.bt_fe);
        bt_gf = findViewById(R.id.bt_gf);

        bt_ca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity6.this, MainActivity8.class);
                startActivity(i);
            }
        });

        bt_ag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity6.this, MainActivity9.class);
                startActivity(i);
            }
        });

        bt_be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity6.this, MainActivity10.class);
                startActivity(i);
            }
        });

        bt_dw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity6.this, MainActivity11.class);
                startActivity(i);
            }
        });

        bt_ed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity6.this, MainActivity14.class);
                startActivity(i);
            }
        });

        bt_fe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity6.this, MainActivity12.class);
                startActivity(i);
            }
        });

        bt_gf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity6.this, MainActivity13.class);
                startActivity(i);
            }
        });
    }
}
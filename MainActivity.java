package com.example.lirikku;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = findViewById(R.id.logo);
        
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
          
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
                finish(); // 
            }
        }, 1000); 
    }
}

package com.eterces.mybauet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class VarsityBooks extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_varsity_books);

        btn1 = findViewById(R.id.btn_lvl1t1Id);
        btn2 = findViewById(R.id.btn_lvl1t2Id);
        btn3 = findViewById(R.id.btn_lvl21t1Id);
        btn4 = findViewById(R.id.btn_lvl2t2Id);
        btn5 = findViewById(R.id.btn_lvl31t1Id);
        btn6 = findViewById(R.id.btn_lvl3t2Id);
        btn7 = findViewById(R.id.btn_lvl41t1Id);
        btn8 = findViewById(R.id.btn_lvl4t2Id);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((VarsityBooks.this),(AdminUploads.class));
                intent.putExtra("Key","one");
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((VarsityBooks.this),(AdminUploads.class));
                intent.putExtra("Key","two");
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((VarsityBooks.this),(AdminUploads.class));
                intent.putExtra("Key","three");
                startActivity(intent);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((VarsityBooks.this),(AdminUploads.class));
                intent.putExtra("Key","four");
                startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((VarsityBooks.this),(AdminUploads.class));
                intent.putExtra("Key","five");
                startActivity(intent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((VarsityBooks.this),(AdminUploads.class));
                intent.putExtra("Key","six");
                startActivity(intent);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((VarsityBooks.this),(AdminUploads.class));
                intent.putExtra("Key","seven");
                startActivity(intent);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((VarsityBooks.this),(AdminUploads.class));
                intent.putExtra("Key","eight");
                startActivity(intent);
            }
        });
    }
}

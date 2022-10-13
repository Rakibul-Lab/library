package com.eterces.mybauet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class OnlineShop extends AppCompatActivity {

    private Button rokomari, boibazar, eboighar, bookshopbd,boikhata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_shop);

        rokomari = findViewById(R.id.rokomariId);
        boibazar = findViewById(R.id.boibazarId);
        eboighar = findViewById(R.id.eboigharId);
        bookshopbd = findViewById(R.id.bookshopbdId);
        boikhata=findViewById(R.id.boikhataId);

        rokomari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((OnlineShop.this),(Webview.class));
                intent.putExtra("webKey","rokomari");
                startActivity(intent);
            }
        });
        boibazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((OnlineShop.this),(Webview.class));
                intent.putExtra("webKey","boibazar");
                startActivity(intent);
            }
        });
        eboighar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((OnlineShop.this),(Webview.class));
                intent.putExtra("webKey","eboighar");
                startActivity(intent);
            }
        });
        bookshopbd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((OnlineShop.this),(Webview.class));
                intent.putExtra("webKey","bookshopbd");
                startActivity(intent);
            }
        });

        boibazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((OnlineShop.this),(Webview.class));
                intent.putExtra("webKey","boikhata");
                startActivity(intent);
            }
        });

    }

}

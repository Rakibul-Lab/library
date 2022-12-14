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

public class MainActivity extends AppCompatActivity {

    private Button varsityBookButton, questionsBankButton, onlineShopButton, adminLoginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        varsityBookButton = findViewById(R.id.varsityBookId);
        questionsBankButton = findViewById(R.id.questionBankId);
        onlineShopButton = findViewById(R.id.onlineShopId);
        adminLoginButton = findViewById(R.id.AdminLoginPanelbtnId);

        varsityBookButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent((MainActivity.this) , (VarsityBooks.class));
                startActivity(intent);

            }
        });

        questionsBankButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent((MainActivity.this) , (QuestionBank.class));
                startActivity(intent);

            }
        });

        onlineShopButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent((MainActivity.this) , (OnlineShop.class));
                startActivity(intent);

            }
        });
        adminLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((MainActivity.this) , (AdminLogIn.class));
                startActivity(intent);
            }
        });

    }

}

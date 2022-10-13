package com.eterces.mybauet;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class AdminUploads extends AppCompatActivity {


    ListView listView;

    DatabaseReference mDatabaseReference;

    List<Upload> uploadList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_uploads);

        Bundle bundle = getIntent().getExtras();

        uploadList = new ArrayList<>();
        listView = findViewById(R.id.listView);

        String value = bundle.getString("Key");
        String cmp1 = "one";
        String cmp2 = "two";
        String cmp3 = "three";
        String cmp4 = "four";
        String cmp5 = "five";
        String cmp6 = "six";
        String cmp7 = "seven";
        String cmp8 = "eight";


        String cmp1Q = "oneQ";
        String cmp2Q = "twoQ";
        String cmp3Q = "threeQ";
        String cmp4Q = "fourQ";
        String cmp5Q = "fiveQ";
        String cmp6Q = "sixQ";
        String cmp7Q = "sevenQ";
        String cmp8Q = "eightQ";



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Upload upload = uploadList.get(i);

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(upload.getUrl()));
                startActivity(intent);
            }
        });


        if (value.equals(cmp1)){
            Toast.makeText(AdminUploads.this, "Please Wait!Loading Over Internet..", Toast.LENGTH_LONG).show();
            mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.DATABASE_PATH_UPLOADS1);
        }
        else if (value.equals(cmp2)){
            Toast.makeText(AdminUploads.this, "Please Wait!Loading Over Internet..", Toast.LENGTH_LONG).show();
            mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.DATABASE_PATH_UPLOADS2);
        }
        else if (value.equals(cmp3)){
            Toast.makeText(AdminUploads.this, "Please Wait!Loading Over Internet..", Toast.LENGTH_LONG).show();
            mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.DATABASE_PATH_UPLOADS3);
        }else if (value.equals(cmp4)){
            Toast.makeText(AdminUploads.this, "Please Wait!Loading Over Internet..", Toast.LENGTH_LONG).show();
            mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.DATABASE_PATH_UPLOADS4);
        }else if (value.equals(cmp5)){
            Toast.makeText(AdminUploads.this, "Please Wait!Loading Over Internet..", Toast.LENGTH_LONG).show();
            mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.DATABASE_PATH_UPLOADS5);
        }else if (value.equals(cmp6)){
            Toast.makeText(AdminUploads.this, "Please Wait!Loading Over Internet..", Toast.LENGTH_LONG).show();
            mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.DATABASE_PATH_UPLOADS6);
        }else if (value.equals(cmp7)){
            Toast.makeText(AdminUploads.this, "Please Wait!Loading Over Internet..", Toast.LENGTH_LONG).show();
            mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.DATABASE_PATH_UPLOADS7);
        }else if (value.equals(cmp8)){
            Toast.makeText(AdminUploads.this, "Please Wait!Loading Over Internet..", Toast.LENGTH_LONG).show();
            mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.DATABASE_PATH_UPLOADS8);
        }

        else if (value.equals(cmp1Q)){
            Toast.makeText(AdminUploads.this, "Please Wait!Loading Over Internet..", Toast.LENGTH_LONG).show();
            mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.qDATABASE_PATH_UPLOADS1);
        }
        else if (value.equals(cmp2Q)){
            Toast.makeText(AdminUploads.this, "Please Wait!Loading Over Internet..", Toast.LENGTH_LONG).show();
            mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.qDATABASE_PATH_UPLOADS2);
        }
        else if (value.equals(cmp3Q)){
            Toast.makeText(AdminUploads.this, "Please Wait!Loading Over Internet..", Toast.LENGTH_LONG).show();
            mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.qDATABASE_PATH_UPLOADS3);
        }else if (value.equals(cmp4Q)){
            Toast.makeText(AdminUploads.this, "Please Wait!Loading Over Internet..", Toast.LENGTH_LONG).show();
            mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.qDATABASE_PATH_UPLOADS4);
        }else if (value.equals(cmp5Q)){
            Toast.makeText(AdminUploads.this, "Please Wait!Loading Over Internet..", Toast.LENGTH_LONG).show();
            mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.qDATABASE_PATH_UPLOADS5);
        }else if (value.equals(cmp6Q)){
            Toast.makeText(AdminUploads.this, "Please Wait!Loading Over Internet..", Toast.LENGTH_LONG).show();
            mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.qDATABASE_PATH_UPLOADS6);
        }else if (value.equals(cmp7Q)){
            Toast.makeText(AdminUploads.this, "Please Wait!Loading Over Internet..", Toast.LENGTH_LONG).show();
            mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.qDATABASE_PATH_UPLOADS7);
        }else if (value.equals(cmp8Q)){
            Toast.makeText(AdminUploads.this, "Please Wait!Loading Over Internet..", Toast.LENGTH_LONG).show();
            mDatabaseReference = FirebaseDatabase.getInstance().getReference(ValueForSemester.qDATABASE_PATH_UPLOADS8);
        }

        mDatabaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                    Upload upload = postSnapshot.getValue(Upload.class);
                    uploadList.add(upload);
                }

                String[] uploads = new String[uploadList.size()];

                for (int i = 0; i < uploads.length; i++) {
                    uploads[i] = uploadList.get(i).getName();
                }

                ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, uploads);
                listView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}

package com.example.myapplication2;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.support.v7.app.AlertDialog;

public class Main2Activity extends AppCompatActivity {
    EditText name,password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name = findViewById(R.id.name);
        password = findViewById(R.id.password);

        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Main2Activity.this);
                 alertDialogBuilder.setCancelable(false)
                              .setMessage("Do you want to Login")
                                    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                        @Override
                                        public void onClick(DialogInterface dialogInterface, int i) {

                                            finish();

                                            Toast.makeText(Main2Activity.this, "Logged In", Toast.LENGTH_SHORT).show();
                                        }
                                    })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                dialogInterface.cancel();
                            }

                        });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.setTitle("Login!!!!");
                alertDialog.show();
            }
        });

    }
}

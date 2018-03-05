package com.example.intagpc.progressdialog;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button btnProgressDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initWidgets();
        buttonCallListener();
    }
    public void initWidgets(){
        btnProgressDialog=(Button)findViewById(R.id.btnProgressDialog);
    }
    public void buttonCallListener(){
        btnProgressDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showProgressDialog();
            }
        });
    }
    public void showProgressDialog(){
        ProgressDialog progressDialog=new ProgressDialog(MainActivity.this);
        progressDialog.setTitle("ProgressDialog");
        progressDialog.setMessage("Connecting to internet");
        progressDialog.show();
    }
}

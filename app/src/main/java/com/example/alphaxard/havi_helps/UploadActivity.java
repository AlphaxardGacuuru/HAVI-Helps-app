package com.example.alphaxard.havi_helps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class UploadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);
    }

    public void upload(View view) {
        Toast.makeText(this, "Not Connected", Toast.LENGTH_SHORT).show();
    }

    public void cancel_upload(View view) {
        Intent x = new Intent(this, MainActivity.class);
        startActivity(x);
    }
}

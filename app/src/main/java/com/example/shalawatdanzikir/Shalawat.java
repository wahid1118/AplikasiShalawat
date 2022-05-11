package com.example.shalawatdanzikir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import android.widget.Button;



public class Shalawat extends AppCompatActivity {
    Button btnIsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shalawat);

        btnIsi = (Button) findViewById(R.id.btnIsi);

        btnIsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ali = new Intent(Shalawat. this, isishalawat.class);
                startActivity(ali);
            }
        });
    }
}
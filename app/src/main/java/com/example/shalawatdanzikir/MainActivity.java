package com.example.shalawatdanzikir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {
    ImageView ivShalawat;
    ImageView ivZikir;
    Button btnIsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivShalawat = (ImageView) findViewById(R.id.ivShalawat);
        ivZikir = (ImageView) findViewById(R.id.ivZikir);
        btnIsi = (Button) findViewById(R.id.btnIsi);

        ivShalawat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Shalawat.class);
                startActivity(intent);
            }
        });

        ivZikir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wahid = new Intent(MainActivity.this,shalawat2.class);
                startActivity(wahid);
            }
        });

    }
}
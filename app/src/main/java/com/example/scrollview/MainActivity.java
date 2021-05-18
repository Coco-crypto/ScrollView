package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton cero, uno, dos, tres, cuatro, cinco, seis, siete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cero = findViewById(R.id.imageButton);
        uno = findViewById(R.id.imageButton2);
        dos = findViewById(R.id.imageButton3);
        tres = findViewById(R.id.imageButton4);
        cuatro = findViewById(R.id.imageButton5);
        cinco = findViewById(R.id.imageButton6);
        seis = findViewById(R.id.imageButton7);
        siete = findViewById(R.id.imageButton8);


        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "estes es un icono",
                Toast.LENGTH_SHORT).show();
            }
        });
    }
}
package com.example.animaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    //Atributos -> views

    private Button btnMover;
    private ImageView ivImagen;

    private Animation leftRight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVistas();
        inicializarAnimaciones();
        btnMover.setOnClickListener(view -> {
            leftRight.setDuration(5000);
            ivImagen.setAnimation(leftRight);
        });
    }

    private void inicializarAnimaciones() {
        leftRight = AnimationUtils.loadAnimation(this,R.anim.left_right);
    }

    private void inicializarVistas() {
        btnMover = findViewById(R.id.btnMover);
        ivImagen = findViewById(R.id.ivImagen);
    }
}
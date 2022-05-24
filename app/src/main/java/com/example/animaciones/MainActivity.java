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

    //Animación
    private Animation leftRight, escalado, transparencia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarVistas();
        inicializarAnimaciones();
        btnMover.setOnClickListener(view -> {
            ejecutarAnimacionTransparencia();
        });
    }

    private void ejecutarAnimacionMovimiento() {
        //La duración de la animación
        //ese tiempo se mide en milisegundos...
        leftRight.setDuration(5000);
        //La vista en cuestión debe arrancar la animación
        ivImagen.startAnimation(leftRight);
    }

    private void ejecutarAnimacionEscalado(){
        escalado.setDuration(5000);
        //A parte de us duración, se puede configurar también
        //1) un modo de reptición -> repito la animación tal cuel de tamaño real a más
        //                        -> efecto inverso, aplico la animación que has
        //configurar el nýmero de repeticieones si quierne que la animación se repita más de una vez
        escalado.setRepeatMode(Animation.REVERSE);
        escalado.setRepeatCount(Animation.INFINITE);
        ivImagen.startAnimation(escalado);
    }

    private void ejecutarAnimacionTransparencia(){
        transparencia.setDuration(7000);
        ivImagen.startAnimation(transparencia);
    }

    private void inicializarAnimaciones() {
        leftRight = AnimationUtils.loadAnimation(this,R.anim.left_right);
        escalado = AnimationUtils.loadAnimation(this,R.anim.escalado);
        transparencia = AnimationUtils.loadAnimation(this,R.anim.transparencia);
    }

    private void inicializarVistas() {
        btnMover = findViewById(R.id.btnMover);
        ivImagen = findViewById(R.id.ivImagen);
    }
}
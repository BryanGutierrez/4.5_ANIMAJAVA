package com.example.bryan.animajava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView face;
    private Button alpha,rotate,transalte,zoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        face = findViewById(R.id.imageView_face);

        alpha = findViewById(R.id.button_alpha);
        rotate = findViewById(R.id.button_rotate);
        transalte = findViewById(R.id.button_translate);
        zoom = findViewById(R.id.button_zoom);

        alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                face.animate()
                        .setDuration(1000)
                        .alpha(0.2f);
            }
        });

        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                face.animate()
                        .setDuration(1000)
                        .rotation(180);
            }
        });

        transalte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                face.animate()
                        .setDuration(1000)
                        .translationX(100)
                        .translationY(100);
            }
        });

        zoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                face.animate()
                        .setDuration(1000)
                        .scaleX(10)
                        .scaleY(10);
            }
        });

    }
}

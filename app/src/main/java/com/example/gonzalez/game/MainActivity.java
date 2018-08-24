package com.example.gonzalez.game;

import android.app.Application;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

import static com.example.gonzalez.game.R.styleable.View;

public class MainActivity extends AppCompatActivity {
    Button asqar ;
    private ImageView img1;
    private View view;
    Random random = new Random();
    private int Angel = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        asqar = (Button) findViewById(R.id.asqar1);
        img1 = (ImageView) findViewById(R.id.img1);
        asqar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spinTheBottle();
                Toast.makeText(getApplicationContext(), "Git!", Toast.LENGTH_SHORT).show();
            }
        });




    }

    private void spinTheBottle() {
        int angele2 = random.nextInt(3600 - 360) + 360;
        float pivoX = img1.getWidth() / 2;
        float pivoY = img1.getHeight() / 2;

        final Animation rotateAnimation = new RotateAnimation(Angel ==-1 ? 0 : Angel ,angele2,pivoX,pivoY);
        Angel = angele2;
        rotateAnimation.setDuration(2500);
        rotateAnimation.setFillAfter(true);

        img1.startAnimation(rotateAnimation);

    }
}

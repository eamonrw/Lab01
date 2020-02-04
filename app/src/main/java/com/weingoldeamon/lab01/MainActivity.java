package com.weingoldeamon.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button incrementButton, bgColorButton, colorButton;
    TextView textBox;
    View mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        incrementButton = findViewById(R.id.increment_button);
        bgColorButton = findViewById(R.id.bg_color_button);
        colorButton = findViewById(R.id.color_button);
        textBox = findViewById(R.id.text_box);
        mainLayout = findViewById(R.id.main_layout);

        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Button Test", "Button Click Detected.");
                textBox.setText(""+(Integer.parseInt(textBox.getText().toString())+1));
            }
        });
    }

    public void onBGColorButtonClick(View view) {
        Random random = new Random();
        int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        mainLayout.setBackgroundColor(color);
    }

    public void onColorButtonClick(View view) {
        Random random = new Random();
        int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        incrementButton.setBackgroundColor(color);
        bgColorButton.setBackgroundColor(color);
        colorButton.setBackgroundColor(color);
    }
}

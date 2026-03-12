package com.example.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private int progresR=255;
    private int progresG=255;
    private int progresB=255;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        SeekBar czerwony=findViewById(R.id.seekBar);
        TextView textCzerwony=findViewById(R.id.textView);

        SeekBar zielony=findViewById(R.id.seekBar2);
        TextView textZielony=findViewById(R.id.textView2);

        SeekBar niebieski=findViewById(R.id.seekBar3);
        TextView textNiebieski=findViewById(R.id.textView3);

        TextView textRGB=findViewById(R.id.textView4);


        czerwony.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textCzerwony.setBackgroundColor(Color.rgb(progress,0,0));
                progresR=progress;
                textRGB.setBackgroundColor(Color.rgb(progresR,progresG,progresB));
                textCzerwony.setText("Czerwony - "+progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        zielony.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textZielony.setBackgroundColor(Color.rgb(0,progress,0));
                progresG=progress;
                textRGB.setBackgroundColor(Color.rgb(progresR,progresG,progresB));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


            }
        });

        niebieski.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textNiebieski.setBackgroundColor(Color.rgb(0,0,progress));
                progresB=progress;
                textRGB.setBackgroundColor(Color.rgb(progresR,progresG,progresB));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
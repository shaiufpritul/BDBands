package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.myapplication.R.layout.activity_inter_activity;

public class inter_activity extends AppCompatActivity implements View.OnClickListener {
    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10;
    private Intent intent;
    MediaPlayer player;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inter_activity);
        {
            player = MediaPlayer.create(this, R.raw.song3);
            player.start();
        }


        button1 = (Button) findViewById(R.id.artcell_button);
        button2 = (Button) findViewById(R.id.black_button);
        button3 = (Button) findViewById(R.id.aurthohin_button);
        button4 = (Button) findViewById(R.id.warfaze_button);
        button5 = (Button) findViewById(R.id.lrb_button);
        button6 = (Button) findViewById(R.id.miles_button);
        button7 = (Button) findViewById(R.id.nemesis_button);
        button8 = (Button) findViewById(R.id.crypticfate_button);
        button9 = (Button) findViewById(R.id.arbovirus_button);
        button10 = (Button) findViewById(R.id.shunno_button);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.artcell_button) {
            intent = new Intent(inter_activity.this, Artcell.class);
            startActivity(intent);
            player.pause();


        }
        if (v.getId() == R.id.black_button) {
            intent = new Intent(inter_activity.this, Black.class);
            startActivity(intent);
            player.pause();
        }
        if (v.getId() == R.id.aurthohin_button) {
            intent = new Intent(inter_activity.this, Aurthohin.class);
            startActivity(intent);
            player.pause();

        }
        if (v.getId() == R.id.warfaze_button) {
            intent = new Intent(inter_activity.this, Warfaze.class);
            startActivity(intent);
            player.pause();
        }
        if (v.getId() == R.id.lrb_button) {
            intent = new Intent(inter_activity.this, Lrb.class);
            startActivity(intent);
            player.pause();
        }
        if (v.getId() == R.id.miles_button) {
            intent = new Intent(inter_activity.this, Miles.class);
            startActivity(intent);
            player.pause();
        }
        if (v.getId() == R.id.nemesis_button) {
            intent = new Intent(inter_activity.this, Nemesis.class);
            startActivity(intent);
            player.pause();

        }
        if (v.getId() == R.id.crypticfate_button) {
            intent = new Intent(inter_activity.this, Crypticfate.class);
            startActivity(intent);
            player.pause();

        }
        if (v.getId() == R.id.arbovirus_button) {
            intent = new Intent(inter_activity.this, Arbovirus.class);
            startActivity(intent);
            player.pause();

        }
        if (v.getId() == R.id.shunno_button) {
            intent = new Intent(inter_activity.this, Shunno.class);
            startActivity(intent);
            player.pause();

        }

    }
}




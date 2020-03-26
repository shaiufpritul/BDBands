package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Miles extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miles);
        player=MediaPlayer.create(this,R.raw.song8);
        player.start();

        Spinner spinner=findViewById(R.id.miles_spin);
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this,R.array.spin_miles,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }
    public void stop(View v) {
        player.stop();
    }
    protected void onStop() {
        super.onStop();
        player.stop();

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

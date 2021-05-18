package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
    }

    public void actividad2(View view) {
        startActivity(new Intent(this,MainActivity2.class));
    }

    public void actividad_frag(View view) {
        startActivity(new Intent(this,Frag.class));
    }

    public void actividad_mepc(View view) {startActivity(new Intent(this,MEPC.class));
    }

    public void actividad_recycler(View view) {startActivity(new Intent(this,Recycler.class));
    }
}
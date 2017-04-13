package com.example.professor.duastelascomintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.R.attr.name;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonAbreTela2Click (View v) {

        Intent segundaTela = new Intent(this, SecondaryActivity.class);

        segundaTela.putExtra("parametro", "teste de parâmetro!!!");

        startActivity(segundaTela);
    }
}

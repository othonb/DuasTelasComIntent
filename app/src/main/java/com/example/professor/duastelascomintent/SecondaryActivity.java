package com.example.professor.duastelascomintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        Bundle bundleDaAtividadeQueChamou = new Bundle();
        bundleDaAtividadeQueChamou = getIntent().getExtras();
        String parametro = bundleDaAtividadeQueChamou.getString("parametro");

        TextView textViewParametro = (TextView) findViewById(R.id.textViewParametro);

        textViewParametro.setText(parametro);
    }

    public void buttonFechaTela (View v) {
        finish();

    }

    public void buttonAbreSegundaTelaClick (View v) {
        Intent terceiraTela = new Intent(this, Main2Activity.class);

        startActivity (terceiraTela);
    }
}

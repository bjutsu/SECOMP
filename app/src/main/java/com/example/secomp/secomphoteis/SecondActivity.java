package com.example.secomp.secomphoteis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView txt_recebe_valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txt_recebe_valor = (TextView) findViewById(R.id.txt_recebe_valor);

        Intent it = getIntent();
        if (it.hasExtra("somaDosNumeros")) {
            try {
                Double soma = it.getDoubleExtra("somaDosNumeros",0);
                txt_recebe_valor.setText("o resultado é " + soma);
            }
            catch (Exception e) {

            }
        }
        else {
            txt_recebe_valor.setText("Não houve valor de soma");
        }
    }
}

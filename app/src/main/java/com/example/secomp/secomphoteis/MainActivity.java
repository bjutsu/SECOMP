package com.example.secomp.secomphoteis;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Double2;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView txt_main;
    EditText edt_num1, edt_num2;
    Button btn_calcular, btn_second,btn_cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        btn_second = (Button) findViewById(R.id.btn_second);
        btn_calcular = (Button) findViewById(R.id.btn_calcular);
        txt_main = (TextView) findViewById(R.id.txt_main);
        edt_num1 = (EditText) findViewById(R.id.edt_num1);
        edt_num2 = (EditText) findViewById(R.id.edt_num2);
        btn_cont = (Button) findViewById(R.id.btn_cont);

        btn_second.setOnClickListener(this);
        btn_calcular.setOnClickListener(this);
        btn_cont.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        Double num1 = Double.parseDouble(edt_num1.getText().toString());
        Double num2 = Double.parseDouble(edt_num2.getText().toString());
        Double soma = num1+num2;
        if (view.getId() == R.id.btn_calcular) {
            Toast.makeText(this, "a soma eh "+ soma, Toast.LENGTH_SHORT).show();
        }
        else if (view.getId() == R.id.btn_second) {
            Intent it = new Intent(this, SecondActivity.class);
            if (soma > 50) {
                it.putExtra("somaDosNumeros",soma);
            }
            startActivity(it);
        }
        else if (view.getId() == R.id.btn_cont) {
            Intent it = new Intent(this, AdapterTestActivity.class);
            startActivity(it);
        }
    }
}

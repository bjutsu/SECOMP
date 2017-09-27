package com.example.secomp.secomphoteis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class AdapterTestActivity extends AppCompatActivity {

    ListView cont_list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_test);

        ArrayList<String> listavalores = new ArrayList<>();
        listavalores.add("Someone");
        listavalores.add("Jordao");
        listavalores.add("Junji");
        listavalores.add("Bruno");
        listavalores.add("Noone");
        listavalores.add("Anyone");
        listavalores.add("AnotherOne");
        listavalores.add("Alguem");
        listavalores.add("MaisAlguem");

        cont_list = (ListView) findViewById(R.id.cont_list);

        ArrayAdapter<String> intensAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listavalores);

        cont_list.setAdapter(intensAdapter);
        cont_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(AdapterTestActivity.this, "Clicou " + listavalores.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}

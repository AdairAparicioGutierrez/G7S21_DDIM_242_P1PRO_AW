package com.example.g7s21_ddim_242_p1pro_aw;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

import kotlin.text.UStringsKt;

public class PrincipalActivity extends AppCompatActivity {

    list<String> lista = new ArrayList<>(Array.asList("Estado de México", "Puebla","Veracruz", "Durango"));
    Spinner spestado1;
    ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_principal);

        spestado1 = findViewById(R.id.spestados1);
        adaptador = new ArrayAdapter<?>(this, android.R.layout.simple_list_item_1,lista);
        spestado1.setAdapter(adaptador);


        spestado1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                String cadena =spestado1.getSelectedItem().toString();
                Toast.makeText(PrincipalActivity.this, "Usted ha seleccionado " + cadena, Toast.LENGTH_LONG)
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spestado1.setOnClick(AdapterView<?> parent, View view, int position, long id);
            String seleccion = spestado1.getSelectedItem().toString();

    }
}
package com.proyecto.bdd.seguridadcdmx;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;
import java.util.ArrayList;

public class ResultadosActivity extends AppCompatActivity {

    private TextView txtdelegacion;
    private TableLayout tablaResultado;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        txtdelegacion = (TextView) findViewById(R.id.textViewDelegacion);
        tablaResultado = (TableLayout) findViewById(R.id.tablaResultado);
        boton = (Button) findViewById(R.id.button);

        Bundle bundle = getIntent().getExtras();
        txtdelegacion.setText(bundle.getString("consulta"));

        //consulta por delegacion devuelve resultados
        final ArrayList<String> resultados = new ArrayList<String>();
        resultados.add("fecha");
        resultados.add("tipo");
        resultados.add("delegacion");
        resultados.add("calle");
        resultados.add("descripcion");

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultados.size() != 0) {
                    for(int i = 0; i < resultados.size(); i++) {
                        TextView fecha = new TextView(getBaseContext());
                        fecha.setGravity(Gravity.CENTER_VERTICAL);
                        fecha.setTextColor(Color.BLACK);
                        fecha.setText("Fecha: " + resultados.get(i));

                        TextView tipo = new TextView(getBaseContext());
                        tipo.setGravity(Gravity.CENTER_VERTICAL);
                        tipo.setTextColor(Color.BLACK);
                        tipo.setText("Delito: " + resultados.get(++i));

                        TextView delegacion = new TextView(getBaseContext());
                        delegacion.setGravity(Gravity.CENTER_VERTICAL);
                        delegacion.setTextColor(Color.BLACK);
                        delegacion.setText("Delegación: " + resultados.get(++i));

                        TextView calle = new TextView(getBaseContext());
                        calle.setGravity(Gravity.CENTER_VERTICAL);
                        calle.setTextColor(Color.BLACK);
                        calle.setText("Calle: " + resultados.get(++i));

                        TextView descripcion = new TextView(getBaseContext());
                        descripcion.setGravity(Gravity.CENTER_VERTICAL);
                        descripcion.setTextColor(Color.BLACK);
                        descripcion.setText("Decripción: " + resultados.get(++i));

                        TextView espacio = new TextView(getBaseContext());
                        espacio.setGravity(Gravity.CENTER_VERTICAL);
                        espacio.setTextColor(Color.BLACK);
                        espacio.setText("");

                        tablaResultado.addView(fecha);
                        tablaResultado.addView(tipo);
                        tablaResultado.addView(delegacion);
                        tablaResultado.addView(calle);
                        tablaResultado.addView(descripcion);
                        tablaResultado.addView(espacio);
                    }

                } else {

                }
            }
        });
    }
}

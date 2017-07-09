package com.proyecto.bdd.seguridadcdmx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class ConsultarActivity extends AppCompatActivity {

    private Button btnDelegacion;
    private Button btnTipoDelito;
    private Button btnPerfil;
    private Spinner spinner_delegacion;
    private RadioButton secuestro, extorsion, homicidio, robo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar);

        btnDelegacion = (Button) findViewById(R.id.buttonDelegacion);
        btnTipoDelito = (Button) findViewById(R.id.buttonTipoDelito);
        btnPerfil = (Button) findViewById(R.id.buttonPerfil);
        spinner_delegacion = (Spinner) findViewById(R.id.spinnerDelegacion);
        secuestro = (RadioButton) findViewById(R.id.radioButtonSecuestro);
        extorsion = (RadioButton) findViewById(R.id.radioButtonExtorsion);
        homicidio = (RadioButton) findViewById(R.id.radioButtonHomicidio);
        robo = (RadioButton) findViewById(R.id.radioButtonRobo);

        btnDelegacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int opcion = spinner_delegacion.getSelectedItemPosition();
                if (opcion != 0) {
                    Intent i = new Intent(ConsultarActivity.this, DelegacionActivity.class);
                    i.putExtra("delegacion", spinner_delegacion.getSelectedItem().toString());
                    startActivity(i);
                }
                else {
                    Toast t = Toast.makeText(getApplicationContext(), "Selecciona una delegación", Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });

        btnTipoDelito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (secuestro.isChecked() || extorsion.isChecked() || homicidio.isChecked() || robo.isChecked()) {
                    Intent i = new Intent(ConsultarActivity.this, TipoActivity.class);
                    if (secuestro.isChecked())
                        i.putExtra("delito", secuestro.getText());
                    if (extorsion.isChecked())
                        i.putExtra("delito", extorsion.getText());
                    if (homicidio.isChecked())
                        i.putExtra("delito", homicidio.getText());
                    if (robo.isChecked())
                        i.putExtra("delito", robo.getText());
                    startActivity(i);
                } else {
                    Toast t = Toast.makeText(getApplicationContext(), "Selecciona un delito", Toast.LENGTH_LONG);
                    t.show();
                }
            }
        });

        btnPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        final String [] delegaciones = {"Seleccionar Delegación", "Álvaro Obregón", "Azcapotzalco", "Benito Juárez", "Coyoacán",
                "Cuajimalpa", "Cuauhtémoc", "Gustavo A. Madero", "Iztacalco", "Iztapalapa", "Magdalena Contreras",
                "Miguel Hidalgo", "Milpa Alta", "Tláhuac", "Tlalpan", "Venustiano Carranza", "Xochimilco"};
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, delegaciones);
        spinner_delegacion.setAdapter(adaptador);
        spinner_delegacion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:
                        Toast t1 = Toast.makeText(getApplicationContext(), delegaciones[position], Toast.LENGTH_LONG);
                        t1.show();
                        break;
                    case 2:
                        Toast t2 = Toast.makeText(getApplicationContext(), delegaciones[position], Toast.LENGTH_LONG);
                        t2.show();
                        break;
                    case 3:
                        Toast t3 = Toast.makeText(getApplicationContext(), delegaciones[position], Toast.LENGTH_LONG);
                        t3.show();
                        break;
                    case 4:
                        Toast t4 = Toast.makeText(getApplicationContext(), delegaciones[position], Toast.LENGTH_LONG);
                        t4.show();
                        break;
                    case 5:
                        Toast t5 = Toast.makeText(getApplicationContext(), delegaciones[position], Toast.LENGTH_LONG);
                        t5.show();
                        break;
                    case 6:
                        Toast t6 = Toast.makeText(getApplicationContext(), delegaciones[position], Toast.LENGTH_LONG);
                        t6.show();
                        break;
                    case 7:
                        Toast t7 = Toast.makeText(getApplicationContext(), delegaciones[position], Toast.LENGTH_LONG);
                        t7.show();
                        break;
                    case 8:
                        Toast t8 = Toast.makeText(getApplicationContext(), delegaciones[position], Toast.LENGTH_LONG);
                        t8.show();
                        break;
                    case 9:
                        Toast t9 = Toast.makeText(getApplicationContext(), delegaciones[position], Toast.LENGTH_LONG);
                        t9.show();
                        break;
                    case 10:
                        Toast t10 = Toast.makeText(getApplicationContext(), delegaciones[position], Toast.LENGTH_LONG);
                        t10.show();
                        break;
                    case 11:
                        Toast t11 = Toast.makeText(getApplicationContext(), delegaciones[position], Toast.LENGTH_LONG);
                        t11.show();
                        break;
                    case 12:
                        Toast t12 = Toast.makeText(getApplicationContext(), delegaciones[position], Toast.LENGTH_LONG);
                        t12.show();
                        break;
                    case 13:
                        Toast t13 = Toast.makeText(getApplicationContext(), delegaciones[position], Toast.LENGTH_LONG);
                        t13.show();
                        break;
                    case 14:
                        Toast t14 = Toast.makeText(getApplicationContext(), delegaciones[position], Toast.LENGTH_LONG);
                        t14.show();
                        break;
                    case 15:
                        Toast t15 = Toast.makeText(getApplicationContext(), delegaciones[position], Toast.LENGTH_LONG);
                        t15.show();
                        break;
                    case 16:
                        Toast t16 = Toast.makeText(getApplicationContext(), delegaciones[position], Toast.LENGTH_LONG);
                        t16.show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        secuestro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                extorsion.setChecked(false);
                homicidio.setChecked(false);
                robo.setChecked(false);
            }
        });

        extorsion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secuestro.setChecked(false);
                homicidio.setChecked(false);
                robo.setChecked(false);
            }
        });

        homicidio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secuestro.setChecked(false);
                extorsion.setChecked(false);
                robo.setChecked(false);
            }
        });

        robo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secuestro.setChecked(false);
                extorsion.setChecked(false);
                homicidio.setChecked(false);
            }
        });
    }
}

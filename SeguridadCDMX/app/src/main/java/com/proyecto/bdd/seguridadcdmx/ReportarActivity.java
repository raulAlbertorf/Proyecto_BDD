package com.proyecto.bdd.seguridadcdmx;

import android.app.DatePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class ReportarActivity extends AppCompatActivity {

    private Button btnFecha;
    private TextView fecha;
    private int dia, mes = 7, ano = 2017;
    private RadioGroup delitos;
    private RadioButton secuestro, extorsion, homicidio, robo;
    private EditText descripcion;
    private EditText calle;
    private Spinner spinnerDelegacion;
    private Button btnReportar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportar);

        btnFecha = (Button) findViewById(R.id.buttonFecha);
        fecha = (TextView) findViewById(R.id.fecha);
        delitos = (RadioGroup) findViewById(R.id.radioGroupDelitos);
        secuestro = (RadioButton) findViewById(R.id.radioButtonSecuestro);
        extorsion = (RadioButton) findViewById(R.id.radioButtonExtorsion);
        homicidio = (RadioButton) findViewById(R.id.radioButtonHomicidio);
        robo = (RadioButton) findViewById(R.id.radioButtonRobo);
        descripcion = (EditText) findViewById(R.id.descripcion);
        calle = (EditText) findViewById(R.id.calle);
        spinnerDelegacion = (Spinner) findViewById(R.id.delegacion);
        btnReportar = (Button) findViewById(R.id.buttonReportar);


        btnFecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog calendario = new DatePickerDialog(ReportarActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        ano = year;
                        mes = month;
                        dia = dayOfMonth;
                        fecha.setText(new StringBuilder().append(dia) + "/"
                                + new StringBuilder().append(mes + 1) + "/"
                                + new StringBuilder().append(ano));
                    }
                }, ano, mes, dia);
                calendario.show();
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

        final String [] delegaciones = {"Seleccionar Delegación", "Álvaro Obregón", "Azcapotzalco", "Benito Juárez", "Coyoacán",
                "Cuajimalpa", "Cuauhtémoc", "Gustavo A. Madero", "Iztacalco", "Iztapalapa", "Magdalena Contreras",
                "Miguel Hidalgo", "Milpa Alta", "Tláhuac", "Tlalpan", "Venustiano Carranza", "Xochimilco"};
        ArrayAdapter <String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, delegaciones);
        spinnerDelegacion.setAdapter(adaptador);
        spinnerDelegacion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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

        btnReportar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //validar datos de entrada
                if (descripcion.length() < 10) {
                    descripcion.setError("Descripcion muy corta");
                    descripcion.requestFocus();
                } else if (calle.length() < 3) {
                    calle.setError("Calle invalida");
                    calle.requestFocus();
                } else if (delitos.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Selecciona un delito", Toast.LENGTH_LONG).show();
                }
                    else if (spinnerDelegacion.getSelectedItemPosition() == 0) {
                    Toast.makeText(getApplicationContext(), "Selecciona una delegación", Toast.LENGTH_LONG).show();
                } else {
                    //create reporte en bd
                    if (true) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(ReportarActivity.this);
                        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(ReportarActivity.this, MenuActivity.class);
                                startActivity(i);
                            }
                        });
                        builder.setTitle("Exito");
                        builder.setMessage("Tu reporte se ha creado");
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                    } else {
                        AlertDialog alertDialog = new AlertDialog.Builder(ReportarActivity.this).create();
                        alertDialog.setTitle("Error");
                        alertDialog.setMessage("Intenta de nuevo");
                        alertDialog.show();
                    }
                }
            }
        });
    }
}

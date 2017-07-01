package com.proyecto.bdd.seguridadcdmx;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class ReportarActivity extends AppCompatActivity {

    private Button btn_fecha;
    private TextView txt_fecha;
    private int dia, mes = 7, ano = 2017;
    private RadioGroup radioGroup;
    private RadioButton delito1, delito2, delito3, delito4;
    private TextView txt_descripcion;
    private TextView txt_calle;
    private Spinner spinner_delegacion;
    private Button btn_reportar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportar);

        btn_fecha = (Button) findViewById(R.id.buttonFecha);
        txt_fecha = (TextView) findViewById(R.id.fecha);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroupDelitos);
        delito1 = (RadioButton) findViewById(R.id.radioButtonDelito1);
        delito2 = (RadioButton) findViewById(R.id.radioButtonDelito2);
        delito3 = (RadioButton) findViewById(R.id.radioButtonDelito3);
        delito4 = (RadioButton) findViewById(R.id.radioButtonDelito4);
        txt_descripcion = (TextView) findViewById(R.id.descripcion);
        txt_calle = (TextView) findViewById(R.id.calle);
        spinner_delegacion = (Spinner) findViewById(R.id.delegacion);
        btn_reportar = (Button) findViewById(R.id.buttonReportar);


        btn_fecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePickerDialog calendario = new DatePickerDialog(ReportarActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        ano = year;
                        mes = month;
                        dia = dayOfMonth;
                        txt_fecha.setText(new StringBuilder().append(dia) + "/"
                                + new StringBuilder().append(mes + 1) + "/"
                                + new StringBuilder().append(ano));
                    }
                }, ano, mes, dia);
                calendario.show();
            }
        });

        delito1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delito2.setChecked(false);
                delito3.setChecked(false);
                delito4.setChecked(false);
            }
        });

        delito2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delito1.setChecked(false);
                delito3.setChecked(false);
                delito4.setChecked(false);
            }
        });

        delito3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delito1.setChecked(false);
                delito2.setChecked(false);
                delito4.setChecked(false);
            }
        });

        delito4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                delito1.setChecked(false);
                delito2.setChecked(false);
                delito3.setChecked(false);
            }
        });

        final String [] delegaciones = {"Seleccionar Delegación", "Álvaro Obregón", "Azcapotzalco", "Benito Juárez", "Coyoacán",
                "Cuajimalpa", "Cuauhtémoc", "Gustavo A. Madero", "Iztacalco", "Iztapalapa", "Magdalena Contreras",
                "Miguel Hidalgo", "Milpa Alta", "Tláhuac", "Tlalpan", "Venustiano Carranza", "Xochimilco"};
        ArrayAdapter <String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, delegaciones);
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

        btn_reportar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ReportarActivity.this, MenuActivity.class);
                startActivity(i);
            }
        });
    }
}

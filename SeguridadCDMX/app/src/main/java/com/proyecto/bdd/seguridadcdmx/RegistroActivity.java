package com.proyecto.bdd.seguridadcdmx;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistroActivity extends AppCompatActivity {

    private EditText usuario, password, email, edad;
    private RadioGroup sexo;
    private RadioButton mujer, hombre;
    private Button registrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        usuario = (EditText) findViewById(R.id.usuario);
        password = (EditText) findViewById(R.id.password);
        email = (EditText) findViewById(R.id.email);
        edad = (EditText) findViewById(R.id.edad);
        sexo = (RadioGroup) findViewById(R.id.sexo);
        mujer = (RadioButton) findViewById(R.id.mujer);
        hombre = (RadioButton) findViewById(R.id.hombre);
        registrarse = (Button) findViewById(R.id.buttonRegistrarse);

        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
                Pattern pattern = Pattern.compile(emailPattern);
                Matcher matcher = pattern.matcher(email.getText().toString());

                if (usuario.length() < 3) {
                    usuario.setError("Usuario invalido");
                    usuario.requestFocus();
                } else if (password.length() < 3) {
                    password.setError("Password invalido");
                    password.requestFocus();
                } else if (!matcher.matches()) {
                    email.setError("Email invalido");
                    email.requestFocus();
                } else if (sexo.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(getApplicationContext(), "Selecciona tu sexo", Toast.LENGTH_LONG).show();
                } else if (edad.getText().toString().equals("")) {
                    edad.setError("Ingresa tu edad");
                    edad.requestFocus();
                } else {
                    //create perfil en bd
                    if (true) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(RegistroActivity.this);
                        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent i = new Intent(RegistroActivity.this, LoginActivity.class);
                                i.putExtra("email", email.getText().toString());
                                i.putExtra("password", password.getText().toString());
                                startActivity(i);
                            }
                        });
                        builder.setTitle("Exito");
                        builder.setMessage("Tu perfil se ha creado");
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                    } else {
                        AlertDialog alertDialog = new AlertDialog.Builder(RegistroActivity.this).create();
                        alertDialog.setTitle("Error");
                        alertDialog.setMessage("Intenta de nuevo");
                        alertDialog.show();
                    }
                }
            }
        });
    }
}

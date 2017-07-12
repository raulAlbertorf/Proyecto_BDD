package com.proyecto.bdd.seguridadcdmx;

import android.content.Intent;
import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {

    private EditText email;
    private EditText password;
    private Button registrarse;
    private Button iniciarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        registrarse = (Button) findViewById(R.id.buttonRegistrarse);
        iniciarSesion = (Button) findViewById(R.id.buttonIniciarSesion);

        Bundle bundle = getIntent().getExtras();
        email.setText(bundle.getString("email"));
        password.setText(bundle.getString("password"));

        registrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, RegistroActivity.class);
                startActivity(i);
            }
        });

        iniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailPattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
                Pattern pattern = Pattern.compile(emailPattern);
                Matcher matcher = pattern.matcher(email.getText().toString());

                if(!matcher.matches()) {
                    email.setError("Email invalido");
                    email.requestFocus();
                } else if (password.length() < 3) {
                    password.setError("Password invalido");
                    password.requestFocus();
                } else {
                    //read login en base de datos
                    if(true) {
                        Intent i = new Intent(LoginActivity.this, MenuActivity.class);
                        startActivity(i);
                    } else {
                        AlertDialog alertDialog = new AlertDialog.Builder(LoginActivity.this).create();
                        alertDialog.setTitle("Error");
                        alertDialog.setMessage("Intenta de nuevo");
                        alertDialog.show();
                    }
                }
            }
        });
    }
}

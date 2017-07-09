package com.proyecto.bdd.seguridadcdmx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TipoActivity extends AppCompatActivity {

    TextView txtdelito;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo);

        txtdelito = (TextView) findViewById(R.id.textViewDelito);

        Bundle bundle = getIntent().getExtras();
        txtdelito.setText(bundle.getString("delito"));
    }
}

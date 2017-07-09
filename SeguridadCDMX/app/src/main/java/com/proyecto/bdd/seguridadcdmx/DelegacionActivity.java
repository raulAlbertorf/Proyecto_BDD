package com.proyecto.bdd.seguridadcdmx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DelegacionActivity extends AppCompatActivity {

    private TextView txtdelegacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delegacion);

        txtdelegacion = (TextView) findViewById(R.id.textViewDelegacion);

        Bundle bundle = getIntent().getExtras();
        txtdelegacion.setText(bundle.getString("delegacion"));
    }
}

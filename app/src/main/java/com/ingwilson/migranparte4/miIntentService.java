package com.ingwilson.migranparte4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class miIntentService extends AppCompatActivity {
    private EditText entrada;
    public static TextView salida;
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_intent_service);
        entrada = (EditText) findViewById(R.id.entrada);
        salida = (TextView) findViewById(R.id.salida);
    }
    public void calcularOperacion(View view) {
        double n = Double.parseDouble(entrada.getText().toString());
        salida.append(n +"^2 = ");
       // Intent i = new Intent(this, ServicioOperacion.class);
        Intent i = new Intent(this, IntentServiceOperacion.class);
        i.putExtra("numero", n);
        startService(i);
    }
}

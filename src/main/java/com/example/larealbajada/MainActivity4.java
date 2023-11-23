package com.example.larealbajada;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import Prom.Promos;

public class MainActivity4 extends AppCompatActivity {
    TextView salida;
    EditText nombre, cantidad;
    Button calcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        salida = (TextView) findViewById(R.id.txvSalida);
        nombre = findViewById(R.id.edtNombre);
        cantidad = findViewById(R.id.edtCant);
        calcular = findViewById(R.id.btnCalcular);
        final Promos objpromos = new Promos();

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name;
                int canti;
                name = nombre.getText().toString();
                canti = Integer.parseInt(cantidad.getText().toString());

                objpromos.setCant(canti);
                objpromos.setNombre(name);
                salida.setText(objpromos.PrecioFinal());


            }
        });
    }
}

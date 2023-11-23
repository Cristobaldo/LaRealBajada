package com.example.larealbajada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button ingresa, registra;
    EditText user, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registra=(Button)findViewById(R.id.btnRegister);
        ingresa=(Button)findViewById(R.id.btnIngresa);
        user=(EditText)findViewById(R.id.edtUser);
        password=(EditText)findViewById(R.id.edtPassword);
        ingresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usuario = user.getText().toString();
                String contrasena = password.getText().toString();
                if(usuario.toUpperCase().equals("STUDENT") && contrasena.equals("123")){
                    startActivity(new Intent(MainActivity.this, MainActivity2.class));
                }
                else Toast.makeText(MainActivity.this, "USUARIO Y/O CONTRASEÑA INCORRECTA", Toast.LENGTH_LONG).show();
            }
        });
        registra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity3.class));
            }
        });
    }
}
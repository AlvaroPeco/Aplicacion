package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {
     EditText numero1;
     EditText numero2;
     TextView resultado;
     int resultado1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        numero1=findViewById(R.id.numero1);
        numero2=findViewById(R.id.numero2);
        resultado=findViewById(R.id.resultado);
    }

    public void sumar (View view){

        resultado1=(Integer.parseInt(numero1.getText().toString())+Integer.parseInt(numero2.getText().toString()));
        resultado.setText(String.valueOf(resultado1));
    }

    public void restar (View view){

        resultado1=(Integer.parseInt(numero1.getText().toString())-Integer.parseInt(numero2.getText().toString()));
        resultado.setText(String.valueOf(resultado1));
    }

    public void multiplicar (View view){

        resultado1=(Integer.parseInt(numero1.getText().toString())*Integer.parseInt(numero2.getText().toString()));
        resultado.setText(String.valueOf(resultado1));
    }

    public void dividir (View view){

        resultado1=(Integer.parseInt(numero1.getText().toString())/Integer.parseInt(numero2.getText().toString()));
        resultado.setText(String.valueOf(resultado1));
    }
}
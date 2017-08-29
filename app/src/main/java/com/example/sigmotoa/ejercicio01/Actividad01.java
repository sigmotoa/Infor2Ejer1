package com.example.sigmotoa.ejercicio01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class Actividad01 extends AppCompatActivity {

    private TextView textosalida;
    private Button boton1;
    private RadioButton radio01;
    private ImageView imagen;
    private EditText textoentrada;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad01);
        textosalida = (TextView) findViewById(R.id.textView);
        boton1 = (Button) findViewById(R.id.button);
        imagen = (ImageView) findViewById(R.id.imageView);
        radio01 = (RadioButton) findViewById(R.id.radioButton);
        textoentrada = (EditText) findViewById(R.id.editText);

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textosalida.setText("Hola Sergio");
            }
        });
    }


    public void bienvenido(View v) {
        textosalida.setText("Hola...." + textoentrada.getText().toString());
    }
    public void ejecuta(View v)
    {
        if(radio01.isChecked()) {

            imagen.setVisibility(View.VISIBLE);

        }
        else
        {
            imagen.setVisibility(View.INVISIBLE);
        }


    }
}
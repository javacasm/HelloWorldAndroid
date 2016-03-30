package com.elcacharreo.android.myapplication;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void botonSaludo(View v)
    {
        Toast.makeText(this,"hola Mundo",Toast.LENGTH_LONG).show();
    }

    public void cambioFondo(View v)
    {

        v.setBackground(new ColorDrawable(Color.BLUE));


        View viewBoton=findViewById(R.id.button);   // Encontramos el control

        viewBoton.setBackground(new ColorDrawable(Color.DKGRAY));

        Button boton=(Button)viewBoton;    // Necesitamos tipo Button para cambiar texto
        boton.setText("Hola");
    }
}

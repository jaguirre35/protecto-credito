package com.example.credito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuActivity2 extends AppCompatActivity {

    TextView jtvusuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
        //Ocultar la barra de menu y voy a mostrar en textView el usuario de la actividad pasada
        getSupportActionBar().hide();
        jtvusuario=findViewById(R.id.tvususario);
        String usuario;
        usuario=getIntent().getStringExtra("datos");
        jtvusuario.setText(usuario);
    }

    public void creditos(View view){
        Intent intcredito=new Intent(this,CreditoActivity.class);
        startActivity(intcredito);
    }

    public void Usuarios(View view){
        Intent intususarios=new Intent(this,usuarioactivity.class);
        startActivity(intususarios);
    }

    public void salir(View view){
        Intent intmain=new Intent(this,MainActivity.class);
        startActivity(intmain);
    }
}

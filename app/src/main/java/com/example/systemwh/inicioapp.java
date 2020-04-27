package com.example.systemwh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class inicioapp extends AppCompatActivity {


    Button ir_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicioapp);

        ir_login=findViewById(R.id.btn_ir_crearCuenta);
        ir_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(inicioapp.this,MainActivity.class));
                finish();
            }
        });
    }
}


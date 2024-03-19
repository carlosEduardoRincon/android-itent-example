package com.ifsp.edu.br.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Imc extends Activity {

    private EditText peso;
    private EditText altura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imc);

        peso = findViewById(R.id.peso);
        altura = findViewById(R.id.altura);
    }

    public void calculaIMC(View view) {
        double peso = Double.parseDouble(this.peso.getText().toString());
        double altura = Double.parseDouble(this.altura.getText().toString())/100;

        double imcResult = peso / (altura * altura);
        Toast.makeText(this, "IMC: " + imcResult, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onBackPressed() {
        Intent it = new Intent();
        it.putExtra("msg", "Clicou em voltar!");
        setResult(3, it);
        finish();
    }
}
package com.ifsp.edu.br.intent;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ActivityResultLauncher<Intent> mStartForResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(),
            result -> {
                Bundle params = result.getData() != null ? result.getData().getExtras() : null;

                if (params != null) {
                    String msg = params.getString("msg");

                    if (result.getResultCode() == 1) {
                        Toast.makeText(getApplicationContext(), "Calculator:" + msg, Toast.LENGTH_LONG).show();
                    } else if (result.getResultCode() == 2) {
                        Toast.makeText(getApplicationContext(), "Fuel Validator:" + msg, Toast.LENGTH_LONG).show();
                    } else if (result.getResultCode() == 3) {
                        Toast.makeText(getApplicationContext(), "Imc:" + msg, Toast.LENGTH_LONG).show();
                    } else if (result.getResultCode() == 4) {
                        Toast.makeText(getApplicationContext(), "School Aprovation:" + msg, Toast.LENGTH_LONG).show();
                    } else if (result.getResultCode() == 5) {
                        Toast.makeText(getApplicationContext(), "Triangle Area:" + msg, Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Não definido:" + msg, Toast.LENGTH_LONG).show();
                    }
                }
            });

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Abrir Tela Calculator
        Button abrirCalculator = findViewById(R.id.btCalculator);
        abrirCalculator.setText("Calculator");
        abrirCalculator.setOnClickListener(arg0 -> {
            Intent it = new Intent(getApplicationContext(), Calculator.class);
            mStartForResult .launch(it);
        });

        // Abrir Tela FuelValidator
        Button abrirFuelValidator = findViewById(R.id.btFuelValidator);
        abrirFuelValidator.setText("Fuel Validator");
        abrirFuelValidator.setOnClickListener(arg0 -> {
            Intent it = new Intent(getApplicationContext(), FuelValidator.class);
            mStartForResult .launch(it);
        });

        // Abrir Tela Imc
        Button abrirImc = findViewById(R.id.btImc);
        abrirImc.setText("Imc");
        abrirImc.setOnClickListener(arg0 -> {
            Intent it = new Intent(getApplicationContext(), Imc.class);
            mStartForResult .launch(it);
        });

        // Abrir Tela btSchoolAprovation
        Button abrirSchoolAprovation = findViewById(R.id.btSchoolAprovation);
        abrirSchoolAprovation.setText("School Aprovation");
        abrirSchoolAprovation.setOnClickListener(arg0 -> {
            Intent it = new Intent(getApplicationContext(), SchoolAprovation.class);
            mStartForResult .launch(it);
        });

        // Abrir Tela TriangleArea
        Button abrirTriangleArea = findViewById(R.id.btTriangleArea);
        abrirTriangleArea.setText("Triangle Area");
        abrirTriangleArea.setOnClickListener(arg0 -> {
            Intent it = new Intent(getApplicationContext(), TriangleArea.class);
            mStartForResult .launch(it);
        });
    }
}
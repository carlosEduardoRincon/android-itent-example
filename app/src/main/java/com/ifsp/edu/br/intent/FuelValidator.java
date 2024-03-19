package com.ifsp.edu.br.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class FuelValidator extends Activity {

    private EditText priceGasoline;
    private EditText priceEthanol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fuel_validator);

        priceGasoline = this.findViewById(R.id.priceGasoline);
        priceEthanol = this.findViewById(R.id.priceEthanol);
    }

    public void calculateWorthFuel(View view) {
        double priceGasoline = Double.parseDouble(this.priceGasoline.getText().toString());
        double priceEthanol = Double.parseDouble(this.priceEthanol.getText().toString());

        double percentage = ((priceEthanol * 100)/ (priceGasoline * 70));
        DecimalFormat format = new DecimalFormat("#.##");
        String resultText = null;
        if (percentage < 1) {
            resultText = "Buy Ethanol. Percentage diff: " + format.format((1 - percentage) * 100) + "%";
        } else if (percentage >= 1) {
            resultText = "Buy Gasoline. Percentage diff: " + format.format((percentage - 1) * 100) + "%";
        }

        Toast.makeText(this, resultText, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onBackPressed() {
        Intent it = new Intent();
        it.putExtra("msg", "Clicou em voltar!");
        setResult(3, it);
        finish();
    }
}
package com.ifsp.edu.br.intent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Calculator extends Activity {

    private EditText number01;
    private EditText number02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);

        number01 = findViewById(R.id.number01);
        number02 = findViewById(R.id.number02);
    }

    public void sum(View view) {

        int num01 = Integer.parseInt(this.number01.getText().toString());
        int num02 = Integer.parseInt(this.number02.getText().toString());
        int result = num01 + num02;

        Toast.makeText(this, "Result: " + result, Toast.LENGTH_LONG).show();
    }

    public void subtract(View view) {

        int num01 = Integer.parseInt(this.number01.getText().toString());
        int num02 = Integer.parseInt(this.number02.getText().toString());
        int result = num01 - num02;

        Toast.makeText(this, "Result: " + result, Toast.LENGTH_LONG).show();
    }

    public void multiply(View view) {

        int num01 = Integer.parseInt(this.number01.getText().toString());
        int num02 = Integer.parseInt(this.number02.getText().toString());
        int result = num01 * num02;

        Toast.makeText(this, "Result: " + result, Toast.LENGTH_LONG).show();
    }

    public void divide(View view) {

        int num01 = Integer.parseInt(this.number01.getText().toString());
        int num02 = Integer.parseInt(this.number02.getText().toString());
        int result = num01 / num02;

        Toast.makeText(this, "Result: " + result, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onBackPressed() {
        Intent it = new Intent();
        it.putExtra("msg", "Clicou em voltar!");
        setResult(1, it);
        finish();
    }
}
package com.ifsp.edu.br.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class TriangleArea extends Activity {

    private EditText base;
    private EditText height;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.triangle_area);

        base = findViewById(R.id.base);
        height = findViewById(R.id.height);
    }

    public void calculateArea(View view) {
        int base = Integer.parseInt(this.base.getText().toString());
        int height = Integer.parseInt(this.height.getText().toString());

        int result = (base * height)/2;
        Toast.makeText(this, "Triangle Area is: " + result + " un.", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onBackPressed() {
        Intent it = new Intent();
        it.putExtra("msg", "Clicou em voltar!");
        setResult(5, it);
        finish();
    }
}
package com.ifsp.edu.br.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SchoolAprovation extends Activity {

    private EditText note01;
    private EditText note02;
    private EditText note03;
    private EditText note04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.school_aprovation);

        note01 = findViewById(R.id.note01);
        note02 = findViewById(R.id.note02);
        note03 = findViewById(R.id.note03);
        note04 = findViewById(R.id.note04);
    }

    public void calculateApprovation(View view) {

        double note01 = Double.parseDouble(this.note01.getText().toString());
        double note02 = Double.parseDouble(this.note02.getText().toString());
        double note03 = Double.parseDouble(this.note03.getText().toString());
        double note04 = Double.parseDouble(this.note04.getText().toString());

        double approvationResult = (note01 + note02 + note03 + note04) / 4;
        String resultText;
        if (approvationResult > 6) {
            resultText = "Approved! :)";
        } else if (approvationResult == 6) {
            resultText = "Exam! :|";
        } else {
            resultText = "Disapproved! :(";
        }
        Toast.makeText(this, resultText + " Your note is:  " + approvationResult, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onBackPressed() {
        Intent it = new Intent();
        it.putExtra("msg", "Clicou em voltar!");
        setResult(4, it);
        finish();
    }
}
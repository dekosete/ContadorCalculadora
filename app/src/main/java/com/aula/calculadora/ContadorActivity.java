package com.aula.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ContadorActivity extends AppCompatActivity {

    private Button btnIncremento, btnDecremento, btnZerar;
    private TextView txtvContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador);

        txtvContador = findViewById(R.id.txtvContador);
        btnZerar = findViewById(R.id.btnZerar);
        btnDecremento = findViewById(R.id.btnDecremento);
        btnIncremento = findViewById(R.id.btnIncremento);

    }

    //Métodos desta classe a partir daqui...
    public void zerar(View v) {
        txtvContador.setText("0");
        Toast.makeText(this, "Contador zerado!", Toast.LENGTH_SHORT).show();
    }

    public void incrementa(View v) {
        int num = Integer.parseInt(txtvContador.getText().toString());
        num++;
        txtvContador.setText(num+"");
    }

    public void decrementa(View v) {
        int num = Integer.parseInt(txtvContador.getText().toString());
        num--;
        txtvContador.setText(num+"");
    }

}
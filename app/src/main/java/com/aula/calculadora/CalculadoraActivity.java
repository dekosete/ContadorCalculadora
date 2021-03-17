package com.aula.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.aula.calculadora.model.Calculadora;

public class CalculadoraActivity extends AppCompatActivity {

    private EditText edtNumero1, edtNumero2;
    private Button btnSoma, btnSubtrai, btnMultiplica, btnDivide;
    private TextView txtvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        txtvResultado = findViewById(R.id.txtvResultado);
        btnDivide = findViewById(R.id.btnDivide);
        btnMultiplica = findViewById(R.id.btnMultiplica);
        btnSubtrai = findViewById(R.id.btnSubtrai);
        btnSoma = findViewById(R.id.btnSoma);
        edtNumero2 = findViewById(R.id.edtNumero2);
        edtNumero1 = findViewById(R.id.edtNumero1);
    }

    public void soma(View v) {
        try {
            txtvResultado.setText(calcula().soma(calcula().getNum1(), calcula().getNum2()) + "");
        } catch (Exception erro) {
            alerta();
        }
    }

    public void subtrai(View v) {
        try {
            txtvResultado.setText(calcula().subtrai(calcula().getNum1(), calcula().getNum2()) + "");
        } catch (Exception erro) {
            alerta();
        }
    }

    public void multiplica(View v) {
        try {
            txtvResultado.setText(calcula().multiplica(calcula().getNum1(), calcula().getNum2()) + "");
        } catch (Exception erro) {
            alerta();
        }
    }

    public void divide(View v) {
        try {
            txtvResultado.setText(calcula().divide(calcula().getNum1(), calcula().getNum2()) + "");
            if(calcula().divide(calcula().getNum1(), calcula().getNum2()) == 0) {
                Toast.makeText(this, "Impossível dividir por '0'!", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception erro) {
            alerta();
        }
    }

    private Calculadora calcula() {
        float num1 = Float.parseFloat(edtNumero1.getText().toString());
        float num2 = Float.parseFloat(edtNumero2.getText().toString());
        Calculadora calc = new Calculadora(num1, num2);
        return calc;
    }

    private void alerta() {
        Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show();
    }
}
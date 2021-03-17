package com.aula.calculadora.model;

import android.widget.Toast;

import com.aula.calculadora.CalculadoraActivity;
import com.aula.calculadora.ContadorActivity;

public class Calculadora {

    private float num1, num2;

    public Calculadora(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float soma(float n1, float n2) {
        float resultado = n1 + n2;
        return resultado;
    }

    public float subtrai(float n1, float n2) {
        float resultado = n1 - n2;
        return resultado;
    }

    public float multiplica(float n1, float n2) {
        float resultado = n1 * n2;
        return resultado;
    }

    public float divide(float n1, float n2) {
        if(n2 == 0) {
            return 0;
        } else {
            float resultado = n1 / n2;
            return resultado;
        }
    }

    public float getNum1() {
        return this.num1;
    }

    public float getNum2() {
        return this.num2;
    }

}

package com.distrito55.silva.holamundoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EJEMPLO_hola_mundo extends AppCompatActivity {
    EditText float operando1,operando2;
    Button sumar,restar,convertit;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejemplo_hola_mundo);

        operando1= (EditText) findViewById(R.id.);
    }
    public class calculadora{
        public double operando1;
        public double operando2;

        public double sumar() {
            double r;
            r = operando1 + operando2;
            return r;
        }

        public double restar() {
            double r;
            r = operando1 - operando2;
            return r;
        }

       //conversor
       public double Convertir() {
           double r;
          r = (operando1 * 1.8) + 32;
           return r ;
       }

        }

    }
}

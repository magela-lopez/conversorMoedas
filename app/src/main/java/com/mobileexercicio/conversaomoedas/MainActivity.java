package com.mobileexercicio.conversaomoedas;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView lblResultadoCotacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*ActionBar actionToolbarConversor = getSupportActionBar();
        assert actionToolbarConversor != null;
        actionToolbarConversor.setTitle("Conversor de Moedas");*/


        EditText txtCotacao = findViewById(R.id.txtChave);
        EditText txtValorIngresado = findViewById(R.id.txtValor);
        Button btnConverterDolar = findViewById(R.id.btnDolar);
        Button btnConverterPeso = findViewById(R.id.btnPeso);
        Button btnConverterReal = findViewById(R.id.btnReal);
        Button btnLimparValores = findViewById(R.id.btnLimpa);
        lblResultadoCotacao = findViewById(R.id.txtResultado);

        double cotacaoDolar=5.18D;
        double cotacaoReal = 8.90D;
        double cotacaoPeso = 8.20D;
        double cotacaoDolarPeso = 42.50D;

        btnConverterPeso.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                try {
                    double valor = Double.parseDouble(txtValorIngresado.getText().toString());
                    double cotacao = Double.parseDouble(txtCotacao.getText().toString());
                    double resultado = valor * cotacao;
                    String resultadoFinal = Double.toString(resultado);
                    lblResultadoCotacao.setText("$"+ resultadoFinal);
                }catch (Exception e){
                    System.out.println(e);
                }
            }
        });

        btnConverterReal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                try {
                    double valor = Double.parseDouble(txtValorIngresado.getText().toString());
                    double cotacao = Double.parseDouble(txtCotacao.getText().toString());
                    double resultado = valor / cotacao;
                    String resultadoFinal = Double.toString(resultado);
                    lblResultadoCotacao.setText("R$"+ resultadoFinal);
                }catch (Exception e){
                    System.out.println(e);
                }
            }
        });

        btnConverterDolar.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                try {
                    double valor = Double.parseDouble(txtValorIngresado.getText().toString());
                    double cotacao = Double.parseDouble(txtCotacao.getText().toString());
                    double resultado = valor * cotacao;
                    String resultadoFinal = Double.toString(resultado);
                    lblResultadoCotacao.setText("USD"+ resultadoFinal);
                }catch (Exception e){
                    System.out.println(e);
                }
            }
        });

        btnLimparValores.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                try {
                    txtCotacao.setText("");
                    txtValorIngresado.setText("");
                    lblResultadoCotacao.setText("");
                }catch (Exception e){
                    System.out.println(e);
                }
            }
        });


    }
}
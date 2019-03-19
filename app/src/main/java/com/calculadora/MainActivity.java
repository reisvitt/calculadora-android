package com.calculadora;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.nfunk.jep.JEP;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity{

    TextView tela, resultado;
    int qtd_ponto = 0;
    float numero;

    // QUANDO FOR COLOCAR ALGUM OPERANDO, DEVE ZERAR A VARIÁVEL qtd_ponto

    Button num1, num2, num3, num4, num5, num6,num7, num8, num9, barra, mult, sub, soma, igual, limpar, zero, ponto, negativo, del;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = findViewById(R.id.resultado);
        num1 = findViewById(R.id.button1);
        num2 = findViewById(R.id.button2);
        num3 = findViewById(R.id.button3);
        num4 = findViewById(R.id.button5);
        num5 = findViewById(R.id.button6);
        num6 = findViewById(R.id.button7);
        num7 = findViewById(R.id.button9);
        num8 = findViewById(R.id.button10);
        num9 = findViewById(R.id.button11);
        zero = findViewById(R.id.button13);
        barra = findViewById(R.id.button4);
        mult = findViewById(R.id.button8);
        sub = findViewById(R.id.button12);
        soma = findViewById(R.id.button15);
        igual = findViewById(R.id.button17);
        limpar = findViewById(R.id.button16);
        ponto = findViewById(R.id.button14);
        tela = findViewById(R.id.textView);
        negativo = findViewById(R.id.button20);
        del = findViewById(R.id.button21);

        soma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tam = tela.getText().length();

                if(tam != 0){
                    switch ("" + tela.getText().charAt(tam-1)){
                        case "+":
                        case "-":
                        case "*":
                        case "/":
                            Toast.makeText(MainActivity.this, "Não é possível realizar esta ação", Toast.LENGTH_SHORT).show();
                            break;
                        default:
                            tela.setText(tela.getText() + "+");
                    }

                }else{
                    Toast.makeText(MainActivity.this, "Não é possível realizar esta ação", Toast.LENGTH_SHORT).show();
                }
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tam = tela.getText().length();

                if(tam != 0){
                    switch ("" + tela.getText().charAt(tam-1)){
                        case "+":
                        case "-":
                        case "*":
                        case "/":
                            Toast.makeText(MainActivity.this, "Não é possível realizar esta ação", Toast.LENGTH_SHORT).show();
                            break;
                        default:
                            tela.setText(tela.getText() + "*");
                    }

                }else{
                    Toast.makeText(MainActivity.this, "Não é possível realizar esta ação", Toast.LENGTH_SHORT).show();
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tam = tela.getText().length();

                if(tam != 0){
                    switch ("" + tela.getText().charAt(tam-1)){
                        case "+":
                        case "-":
                        case "*":
                        case "/":
                            Toast.makeText(MainActivity.this, "Não é possível realizar esta ação", Toast.LENGTH_SHORT).show();
                            break;
                        default:
                            tela.setText(tela.getText() + "-");
                    }

                }else{
                    Toast.makeText(MainActivity.this, "Não é possível realizar esta ação", Toast.LENGTH_SHORT).show();
                }
            }
        });

        barra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tam = tela.getText().length();

                if(tam != 0){
                    switch ("" + tela.getText().charAt(tam-1)){
                        case "+":
                        case "-":
                        case "*":
                        case "/":
                            Toast.makeText(MainActivity.this, "Não é possível realizar esta ação", Toast.LENGTH_SHORT).show();
                            break;
                        default:
                            tela.setText(tela.getText() + "/");
                    }

                }else{
                    Toast.makeText(MainActivity.this, "Não é possível realizar esta ação", Toast.LENGTH_SHORT).show();
                }
            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText() + "1");
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText() + "2");
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText() + "3");
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText() + "4");
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText() + "5");
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText() + "6");
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText() + "7");
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText() + "8");
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText() + "9");
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tela.setText(tela.getText() + "0");
            }
        });

        ponto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((tela.getText().equals("")) || (qtd_ponto > 0) ){
                    Toast.makeText(MainActivity.this, "Não é possível realizar esta ação", Toast.LENGTH_SHORT).show();
                }else{
                    tela.setText(tela.getText() + ".");
                    qtd_ponto++;
                }
            }
        });

        limpar.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    limpar.setTextColor(Color.BLACK);
                    tela.setText("");
                    qtd_ponto = 0;
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    limpar.setTextColor(Color.WHITE);
                }
                return false;
            }
        });

        limpar.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                resultado.setText("");

                return false;
            }
        });



        igual.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    igual.setTextColor(Color.BLACK);
                    int tam = tela.getText().length();
                    if(tam != 0){
                        JEP jep = new JEP();
                        jep.addStandardConstants();
                        jep.addStandardFunctions();
                        jep.parseExpression((String) tela.getText());
                        DecimalFormat df = new DecimalFormat();
                        df.setMaximumFractionDigits(5);

                        resultado.setText(df.format(jep.getValue()));

                    }

                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    igual.setTextColor(Color.WHITE);
                }

                return false;
            }
        });


        negativo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String valor = (String) tela.getText();
                String menos = "-";
                int tam = tela.getText().length();

                if(tam != 0){
                    if(valor.charAt(0) != menos.charAt(0)){
                        tela.setText("-" + valor);
                    }else{
                        tela.setText("");
                        for(int i = 1; i < tam; i++){
                            tela.setText((String)tela.getText() + valor.charAt(i));
                        }
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Não é possível realizar esta ação", Toast.LENGTH_SHORT).show();
                }
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int tam = tela.getText().length();
                if(tam != 0){
                    String valor = (String) tela.getText();
                    tela.setText("");
                    for(int i = 0; i < tam - 1; i++){
                        tela.setText((String)tela.getText() + valor.charAt(i));
                    }
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);


        return super.onCreateOptionsMenu(menu);
    }

}

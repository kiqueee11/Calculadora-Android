package com.kiqueee11.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainActivity extends AppCompatActivity {

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button button0 = findViewById(R.id.button0);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button buttonMasMenos = findViewById(R.id.buttonMasMenos);
        Button buttonPunto = findViewById(R.id.buttonPunto);
        Button buttonSuma = findViewById(R.id.buttonSuma);
        Button buttonResta = findViewById(R.id.buttonResta);
        Button buttonDividir = findViewById(R.id.buttonDividir);
        Button buttonMultiplicar = findViewById(R.id.buttonMultiplicar);
        Button buttonCalcular = findViewById(R.id.buttonCacular);
        Button buttonLimpiar = findViewById(R.id.buttonLimpiar);
        Button buttonBorrar = findViewById(R.id.buttonBorrar);

        TextView pantalla = findViewById(R.id.pantalla);
        pantalla.setText("0");

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoPantalla = (String) pantalla.getText();
                textoPantalla += "0";
                pantalla.setText(textoPantalla);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoPantalla = (String) pantalla.getText();
                textoPantalla += "1";
                pantalla.setText(textoPantalla);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoPantalla = (String) pantalla.getText();
                textoPantalla += "2";
                pantalla.setText(textoPantalla);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoPantalla = (String) pantalla.getText();
                textoPantalla += "3";
                pantalla.setText(textoPantalla);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoPantalla = (String) pantalla.getText();
                textoPantalla += "4";
                pantalla.setText(textoPantalla);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoPantalla = (String) pantalla.getText();
                textoPantalla += "5";
                pantalla.setText(textoPantalla);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoPantalla = (String) pantalla.getText();
                textoPantalla += "6";
                pantalla.setText(textoPantalla);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoPantalla = (String) pantalla.getText();
                textoPantalla += "7";
                pantalla.setText(textoPantalla);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoPantalla = (String) pantalla.getText();
                textoPantalla += "8";
                pantalla.setText(textoPantalla);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoPantalla = (String) pantalla.getText();
                textoPantalla += "9";
                pantalla.setText(textoPantalla);
            }
        });

        buttonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                comprobar((String) pantalla.getText());
                String textoPantalla = (String) pantalla.getText();
                textoPantalla += " + ";
                pantalla.setText(textoPantalla);
            }
        });

        buttonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                comprobar((String) pantalla.getText());
                String textoPantalla = (String) pantalla.getText();
                textoPantalla += " - ";
                pantalla.setText(textoPantalla);
            }
        });
        buttonMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                comprobar((String) pantalla.getText());
                String textoPantalla = (String) pantalla.getText();
                textoPantalla += " x ";
                pantalla.setText(textoPantalla);
            }
        });
        buttonDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                comprobar((String) pantalla.getText());
                String textoPantalla = (String) pantalla.getText();
                textoPantalla += " / ";
                pantalla.setText(textoPantalla);
            }
        });
        buttonPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoPantalla = (String) pantalla.getText();
                textoPantalla += ".";
                pantalla.setText(textoPantalla);
            }
        });
        buttonMasMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoPantallaAux = (String) pantalla.getText().toString();

                try {

                    String[] numeros=textoPantallaAux.split(" ");
                    double num1 = Double.parseDouble(numeros[0]);
                    double num2;
                    if(numeros.length<3){
                         num2 = 0;
                    }else{
                         num2 = Double.parseDouble(numeros[2]);
                    }

                    if (num1 == 0){

                        num2=num2*-1;

                    } else if (num2==0) {

                        num1=num1*-1;
                        String res = String.valueOf(num1);
                        pantalla.setText(res);

                    } else {

                        num2=num2*-1;

                    }
                    calcular( num1,  num2);

                }catch (Exception e){

                    System.out.println("error"+e);

                }
            }
        });
        buttonLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoPantalla = (String) pantalla.getText();
                textoPantalla = "0";
                pantalla.setText(textoPantalla);
            }
        });
        buttonBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoPantalla = (String) pantalla.getText();
                String[] numeros=textoPantalla.split(" ");
                numeros[numeros.length-1]="";
                String total = "";
                for (int i = 0; i < numeros.length; i++) {
                    total=total+" "+numeros[i];
                }
                pantalla.setText(total);
            }
        });
        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textoPantallaAux = (String) pantalla.getText().toString();
                String[] numeros=textoPantallaAux.split(" ");
                double num1 = Double.parseDouble(numeros[0]);
                double num2;
                if(numeros.length<3){
                    num2 = 0;
                }else{
                    num2 = Double.parseDouble(numeros[2]);
                }
                if(num2==0){
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }else {
                    calcularResultado(num1,num2);
                }


            }
        });

    }
    public void calcular(double num1, double num2){
        TextView pantalla = findViewById(R.id.pantalla);
        String textoPantallaAux = (String) pantalla.getText().toString();
        String[] numeros=textoPantallaAux.split(" ");


        if(numeros[1].equals("+")){
            try {

                String resultado= num1+" + "+num2;

                pantalla.setText(resultado);
            } catch (Exception e) {
                System.out.println("error");
            }

        }
        if(numeros[1].equals("-")){
            try {

                String resultado=num1+" - "+num2;

                pantalla.setText(resultado);
            } catch (Exception e) {
                System.out.println("error");
            }

        }
        if(numeros[1].equals("/")){
            try {

                String resultado=num1+" / "+num2;

                pantalla.setText(resultado);
            } catch (Exception e) {
                System.out.println("error");
            }

        }
        if(numeros[1].equals("x")){
            try {

                String resultado=num1+" * "+num2;

                pantalla.setText(resultado);
            } catch (Exception e) {
                System.out.println("error");
            }

        }

    }

    public void comprobar(String texto){
        TextView pantalla = findViewById(R.id.pantalla);
        String textoPantallaAux = (String) pantalla.getText().toString();
        String[] numeros=textoPantallaAux.split(" ");
        double num1 = Double.parseDouble(numeros[0]);
        double num2;
        if(numeros.length<3){
            num2 = 0;
        }else{
            num2 = Double.parseDouble(numeros[2]);
        }
        try{
            if (numeros[1].equals("+")){

                calcularResultado(num1,num2);

            }
            if (numeros[1].equals("-")){

                calcularResultado(num1,num2);

            }
            if (numeros[1].equals("x")){

                calcularResultado(num1,num2);

            }
            if (numeros[1].equals("/")){

                calcularResultado(num1,num2);

            }

        }catch (Exception e){
            System.out.println(e);
        }


    }

    public void calcularResultado(double num1, double num2){

        TextView pantalla = findViewById(R.id.pantalla);
        String textoPantallaAux = (String) pantalla.getText().toString();
        String[] numeros=textoPantallaAux.split(" ");


            if(numeros[1].equals("+")){
                try {

                    double resultado= num1 + num2;
                    String result = String.valueOf(resultado);
                    pantalla.setText(result);
                } catch (Exception e) {
                    System.out.println("error");
                }

            }
            if(numeros[1].equals("-")){
                try {

                    double resultado= num1 - num2;
                    String result = String.valueOf(resultado);
                    pantalla.setText(result);
                } catch (Exception e) {
                    System.out.println("error");
                }

            }
            if(numeros[1].equals("/")){
                try {

                    double resultado= num1 / num2;
                    String result = String.valueOf(resultado);
                    pantalla.setText(result);
                } catch (Exception e) {
                    System.out.println("error");
                }

            }
            if(numeros[1].equals("x")){
                try {

                    double resultado= num1 * num2;
                    String result = String.valueOf(resultado);
                    pantalla.setText(result);
                } catch (Exception e) {
                    System.out.println("error");
                }

            }


        }
    }

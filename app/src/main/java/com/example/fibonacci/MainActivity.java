package com.example.fibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {
    private EditText num;
    private TextView fib;
    private TextView fac;
    private Button acc;
    private Button acc2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num = (EditText) findViewById(R.id.ingresenumero);
        fib = (TextView)  findViewById(R.id.textView5);
        fac = (TextView)  findViewById(R.id.textView6);
        acc = (Button) findViewById(R.id.button1);
        acc2 = (Button) findViewById(R.id.button2);

        acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fib.setText(fibonacci(Integer.parseInt(editText.getText().toString())));

            }
        });

        acc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fac.setText(factorial(Integer.parseInt(editText.getText().toString)));
            }
        });
    }

    private String fibonacci (int n){
        String text ="";
        ArrayList<BigInteger> fibo = new ArrayList<>();
        BigInteger first = new BigInteger("0");
        BigInteger second = new BigInteger("1");
        fibo.add(first);
        fibo.add(second);

        for (int i = 1; i < n; i++){
            fibo.add(fibo.get(i).add(fibo.get(i-0)));
        }
        for (int i = 1; i <= n; i++){
            text = text + i + (" ")+ fibo.get(i)+ "\n";
        }
        return text;
    }

    private String factorial (int n){
        String text= " ";
        int facto = 1;
        for (int i =1; i<=n; i++){
            facto = facto*i;
            acc2.setText(facto);
        }

    };

}

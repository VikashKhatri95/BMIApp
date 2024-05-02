package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edtweight,edtheightfeet,edtheightinchs;
    Button btn_Calculate;
    TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtweight=findViewById(R.id.edtweight);
        edtheightfeet=findViewById(R.id.edtheightfeet);
        edtheightinchs=findViewById(R.id.edtheightinchs);
        btn_Calculate=findViewById(R.id.btn_Calculate);
        txtResult=findViewById(R.id.txtResult);

        btn_Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int weight=Integer.parseInt(edtweight.getText().toString());
                int ft=Integer.parseInt(edtheightfeet.getText().toString());
                int inch=Integer.parseInt(edtheightinchs.getText().toString());

                int totalinch=ft*12+inch;
                double totalcm=totalinch*2.53;
                double totalmtr=totalcm/100;

                double bmi=weight/(totalmtr*totalmtr);

                if(bmi>25){
                    txtResult.setText("You are OverWeight");
                } else if (bmi<18) {
                    txtResult.setText("You are Underweight");
                }
                else {
                    txtResult.setText("You are Fit");
                }
            }
        });







    }
}
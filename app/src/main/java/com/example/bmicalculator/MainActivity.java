package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText weight,heightft,heightin;
        Button btn;
        TextView result;

        weight=findViewById(R.id.weight);
        heightft=findViewById(R.id.heightft);
        heightin=findViewById(R.id.heightin);
        btn=findViewById(R.id.btn);
        result=findViewById(R.id.result);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              int wt= Integer.parseInt( weight.getText().toString());
              int htft=Integer.parseInt(heightft.getText().toString());
              int htin=Integer.parseInt(heightin.getText().toString());

              int totalin=htft*12+htin;
              double totalcm=totalin*2.53;
              double totalmetre=totalcm/100;
              double bmi=wt/(totalmetre*totalmetre);

              if(bmi>25)
              {
                  result.setText("You Are Over Weight");
              }
              else if(bmi<18)
              {
                  result.setText("You Are Under Weight");
              }
              else
              {
                  result.setText("You Are Healthy");
              }

            }
        });

    }
}
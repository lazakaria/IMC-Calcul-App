package com.example.monappandroidl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText taille= null;
    private EditText poids= null;
    private TextView resultat=null;
    private Button btn= null;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        taille = (EditText) findViewById(R.id.taille);
        poids = (EditText) findViewById(R.id.poid);
        btn = (Button) findViewById(R.id.btn);
        resultat = (TextView) findViewById(R.id.resultat);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double t = Double.parseDouble(taille.getText().toString());
                double p = Double.parseDouble(poids.getText().toString());

                double r = t/ (p*p);

                String res = "";

                if (r >= 40) {
                    res = "Obésité massive";

                }
                else if (r <= 40 && r >= 35) {
                    res = "Obésité sévere";

                }
                else if (r <= 35 && r >= 30)  {
                    res = "Obésité modéré";
                 }
                else if (r <= 23 && r >= 25) {
                    res = "Surpoids";
                }
                else if (r <= 25 && r >= 15.5) {
                    res = "Normale";
                }
                else if (r <= 15.5 && r >= 16.5){
                    res = "Maigre";
                }
                else {
                    res = "Famine";
                }


                resultat.setText(res);


                }
                });
    }
}

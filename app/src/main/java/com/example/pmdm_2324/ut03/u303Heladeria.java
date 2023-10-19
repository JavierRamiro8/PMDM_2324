package com.example.pmdm_2324.ut03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.pmdm_2324.R;

public class u303Heladeria extends AppCompatActivity {

    EditText numVainilla,numChocolate,numFresa;
    Button aceptar;

    Spinner tipos;

    public static final String VAINILLA="VAINILLA";
    public static final String CHOCOLATE="CHOCOLATE";
    public static final String FRESA="FRESA";
    public static final String TIPOTARRINA="TIPOTARRINA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_u303_heladeria);
        numVainilla= findViewById(R.id.ut303numVainilla);
        numFresa= findViewById(R.id.ut303numFresa);
        numChocolate= findViewById(R.id.ut303numChocolate);
        aceptar=findViewById(R.id.u303btAceptar);
        tipos=findViewById(R.id.u303TiposHelados);
    }
}
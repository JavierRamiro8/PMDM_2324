package com.example.pmdm_2324.ut03;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import com.example.pmdm_2324.R;

public class ut307MetalSlugMain extends AppCompatActivity {

    ImageButton ut307ImgPersonajeOcultoP1,ut307ImgPersonajeOcultoP2,ut307ImgArmaOcultaP1,ut307ImgArmaOcultaP2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ut307_metal_slug_main);
        ut307ImgPersonajeOcultoP1=findViewById(R.id.ut307ImgPersonajeOcultoP1);
        ut307ImgPersonajeOcultoP2=findViewById(R.id.ut307ImgPersonajeOcultoP2);
        ut307ImgArmaOcultaP1=findViewById(R.id.ut307ImgArmaOcultaP1);
        ut307ImgArmaOcultaP2=findViewById(R.id.ut307ImgArmaOcultaP2);


        ut307ImgPersonajeOcultoP1.setOnClickListener(View ->{
            Intent i=new Intent(this,ut307SelectorPersonajes.class);
            lanzadorPersonajes1.launch(i);
        });
        ut307ImgPersonajeOcultoP2.setOnClickListener(View ->{
            Intent i=new Intent(this,ut307SelectorPersonajes.class);
            lanzadorPersonajes2.launch(i);
        });
        ut307ImgArmaOcultaP1.setOnClickListener(View ->{
            Intent i=new Intent(this,ut307SelectorArmas.class);
            lanzadorArmas1.launch(i);
        });
        ut307ImgArmaOcultaP2.setOnClickListener(View ->{
            Intent i=new Intent(this,ut307SelectorArmas.class);
            lanzadorArmas2.launch(i);
        });

    }
    ActivityResultLauncher<Intent> lanzadorPersonajes1 = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    Intent data = result.getData();
                    int imagenEscogida=0;
                    if(result.getResultCode() == Activity.RESULT_OK && result.getData().hasExtra("PERSONAJE1") ){
                        imagenEscogida= data.getIntExtra("PERSONAJE1", 0);
                        ut307ImgPersonajeOcultoP1.setImageResource(imagenEscogida);
                    }else if(result.getResultCode() == Activity.RESULT_OK && result.getData().hasExtra("PERSONAJE2") ){
                        imagenEscogida= data.getIntExtra("PERSONAJE2", 0);
                        ut307ImgPersonajeOcultoP1.setImageResource(imagenEscogida);
                    }else if(result.getResultCode() == Activity.RESULT_OK && result.getData().hasExtra("PERSONAJE3") ){
                        imagenEscogida= data.getIntExtra("PERSONAJE3", 0);
                        ut307ImgPersonajeOcultoP1.setImageResource(imagenEscogida);

                    }else if(result.getResultCode() == Activity.RESULT_FIRST_USER){

                        ut307ImgPersonajeOcultoP1.setImageResource(R.drawable.personajeoculto);
                    }
                }
            }
    );
    ActivityResultLauncher<Intent> lanzadorPersonajes2 = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    Intent data = result.getData();
                    int imagenEscogida=0;
                    if(result.getResultCode() == Activity.RESULT_OK && result.getData().hasExtra("PERSONAJE1") ){
                        imagenEscogida= data.getIntExtra("PERSONAJE1", 0);
                        ut307ImgPersonajeOcultoP2.setImageResource(imagenEscogida);
                    }else if(result.getResultCode() == Activity.RESULT_OK && result.getData().hasExtra("PERSONAJE2") ){
                        imagenEscogida= data.getIntExtra("PERSONAJE2", 0);
                        ut307ImgPersonajeOcultoP2.setImageResource(imagenEscogida);
                    }else if(result.getResultCode() == Activity.RESULT_OK && result.getData().hasExtra("PERSONAJE3") ){
                        imagenEscogida= data.getIntExtra("PERSONAJE3", 0);
                        ut307ImgPersonajeOcultoP2.setImageResource(imagenEscogida);

                    }else if(result.getResultCode() == Activity.RESULT_FIRST_USER){

                        ut307ImgPersonajeOcultoP2.setImageResource(R.drawable.personajeoculto);
                    }
                }
            }
    );
    ActivityResultLauncher<Intent> lanzadorArmas1 = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    Intent data = result.getData();
                    int imagenEscogida=0;
                    if(result.getResultCode() == Activity.RESULT_OK && result.getData().hasExtra("ARMA1") ){
                        imagenEscogida= data.getIntExtra("ARMA1", 0);
                        ut307ImgArmaOcultaP1.setImageResource(imagenEscogida);
                    }else if(result.getResultCode() == Activity.RESULT_OK && result.getData().hasExtra("ARMA2") ){
                        imagenEscogida= data.getIntExtra("ARMA2", 0);
                        ut307ImgArmaOcultaP1.setImageResource(imagenEscogida);
                    }else if(result.getResultCode() == Activity.RESULT_OK && result.getData().hasExtra("ARMA3") ){
                        imagenEscogida= data.getIntExtra("ARMA3", 0);
                        ut307ImgArmaOcultaP1.setImageResource(imagenEscogida);

                    }else if(result.getResultCode() == Activity.RESULT_FIRST_USER){

                        ut307ImgArmaOcultaP1.setImageResource(R.drawable.siluetapistola);
                    }
                }
            }
    );
    ActivityResultLauncher<Intent> lanzadorArmas2 = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    Intent data = result.getData();
                    int imagenEscogida=0;
                    if(result.getResultCode() == Activity.RESULT_OK && result.getData().hasExtra("ARMA1") ){
                        imagenEscogida= data.getIntExtra("ARMA1", 0);
                        ut307ImgArmaOcultaP2.setImageResource(imagenEscogida);
                    }else if(result.getResultCode() == Activity.RESULT_OK && result.getData().hasExtra("ARMA2") ){
                        imagenEscogida= data.getIntExtra("ARMA2", 0);
                        ut307ImgArmaOcultaP2.setImageResource(imagenEscogida);
                    }else if(result.getResultCode() == Activity.RESULT_OK && result.getData().hasExtra("ARMA3") ){
                        imagenEscogida= data.getIntExtra("ARMA3", 0);
                        ut307ImgArmaOcultaP2.setImageResource(imagenEscogida);

                    }else if(result.getResultCode() == Activity.RESULT_FIRST_USER){

                        ut307ImgArmaOcultaP2.setImageResource(R.drawable.siluetapistola);
                    }
                }
            }
    );
}
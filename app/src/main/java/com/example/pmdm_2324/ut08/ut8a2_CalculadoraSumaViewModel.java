package com.example.pmdm_2324.ut08;

import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Random;

public class ut8a2_CalculadoraSumaViewModel extends ViewModel {
    private MutableLiveData<Integer> misDatos;
    private final int DELAY=1000;

    public LiveData<Integer> getNumeroSuma(){
        if(misDatos==null){
            misDatos=new MutableLiveData<Integer>();
            cargaNumero();
        }
        return misDatos;
    }

    public void cargaNumero() {
        Random random = new Random();
        new Thread(()->{
            try {
                Thread.sleep((long)(Math.random()*DELAY)+DELAY);
                int resultado=ut8a2_CalculadoraSuma.getNumero1()+ut8a2_CalculadoraSuma.getNumero2();
                misDatos.postValue(resultado);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();
    }

}

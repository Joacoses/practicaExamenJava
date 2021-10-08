package com.example.joacoses.practicaexamenjava;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.util.ArraySet;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RequiresApi(api = Build.VERSION_CODES.M)
public class MainActivity extends AppCompatActivity {

    static int PROGRAMACION[]={6, 10, 12, 15, 17, 20, 22, 24 };
    static String TIPO[] = {"NOTICIAS", "MAGAZINE", "MUSICA", "NOTICIAS",
            "MAGAZINE", "NOTICIAS", "MAGAZINE", "MUSICA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Programa nuevo=new Programa();

        totalProgramas(cuantos);
        Log.d("Tipos de progrma",main().toString());
        Log.d("Programas", String.valueOf(crearProgramas(PROGRAMACION,TIPO)));

    }

    Set<String> tiposPrograma = new ArraySet<>();
    List<Programa> prog = new ArrayList<Programa>();
    List<String> tipo = new ArrayList<>();




    private Set<String> main() {
        tiposPrograma.add(TIPO[0]);
        for (int i=0; i< TIPO.length;i++){
            if (!tiposPrograma.contains(TIPO[i])){
                tiposPrograma.add(TIPO[i]);
            }

        }
        return tiposPrograma;

    }

    private List<Programa> crearProgramas(int[] horas, String[] tipos){
        horas=PROGRAMACION;
        tipos=TIPO;
        for (int i=0;i<TIPO.length;i++){
            int horaFin;
            if (i < TIPO.length - 1) horaFin = horas[i + 1];
            else horaFin = horas[0];
            prog.add(new Programa(horas[i], horaFin, tipos[i]));
        }
        return prog;
    }


    //sumar contador de numeros que hay de cada categoria
    Map<String, Integer> cuantos = new HashMap<>();
    public Map<String, Integer> totalProgramas(Map<String, Integer> contador)
    {
        for (int i = 0; i<tiposPrograma.size(); i++)
        {
            contador.put(tiposPrograma.toArray()[i].toString(), 0);
            Log.d("Debug  ContadorSetUp", contador.toString());
        }

        for(int i = 0; i<prog.size(); i++)
        {
            if(contador.containsKey(prog.get(i).getTipo()))
            {
                contador.put(prog.get(i).getTipo(), contador.get(prog.get(i).getTipo()) + 1);;

            }

        }
        Log.d("Debug  ContadorProg", contador.toString());

        return contador;
    }

/*
    private String cuantos(){
        Map<String, Integer> tiposDeProgramasMap = new HashMap<String, Integer>();
        for (int i = 0; i<TIPO.length; i++){
            tiposDeProgramasMap.put(tipo.get(i),0);

        }
        for (int i = 0; i<TIPO.length; i++){
            if (tiposPrograma.contains("MAGAZINE")){
                tiposDeProgramasMap.put("MAGAZINE",+1);
            }
            if (tiposPrograma.contains("MUSICA")){
                tiposDeProgramasMap.put("MUSICA",+1);
            }
            if (tiposPrograma.contains("NOTICIAS")){
                tiposDeProgramasMap.put("MUSICA",+1);
            }
        }
        return String.valueOf(tiposDeProgramasMap);
        
    }*/


}
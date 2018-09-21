package JugoDelAhorcado;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Palabras { 
    //ATRIBUTOS
    Scanner entrada = new Scanner(System.in);
    char cadena[];
    char cadenajuego[];
    char intento;
    
    

public void Mensaje(){
    System.out.println("Tienes 8 intentos para adivinar la palabra"); 
   
}   

//OPERACION PARA INGRESAR PALABRAS
public void PalabraAleatoria(){
      
       Random r = new Random(); //ESTRUCTURA PARA HACER EL RANDOM, (ELEGIR ALEATORIAMENTE).
       
       String[] palabras = {"casa","ropa","gato","auto", "calle", "correr", "escuela", "flecha","rojo"}; //Arreglo de palabras.
     
        int n_azar = r.nextInt(palabras.length); 
         
        //METODO PARA COMVERTIR UNA PALABRA STRING A UNA CHAR  (TOMAR UNA LETRA) 
        cadena = palabras[n_azar].toCharArray();
        cadenajuego = palabras[n_azar].toCharArray();
     
        for(int i = 0; i< cadenajuego.length; i++){ //CAMBIO DE LOS CARACTERES DE LA PALABRA POR UN ASTERISCO  .
            cadenajuego[i] = '*';
    } 
       System.out.println("Adivina la palabra: " + Arrays.toString(cadenajuego));
    }

//ESTRUCTURA PARA LOS NUMERO DE INTENTOS
public void Intentos(){
    
    for(int i = 1; i <= 8; i++){ //NUMERO DE INTENTOS DEL JUGADOR
            
            System.out.print("Intento "+i+": ");
             intento = entrada.next().charAt(0);
      
                for(int x = 0; x < cadena.length; x++){ //VEREFICACION DEL ENTRADA CON LA PALABRA ESCONDIDA 
                    if(cadena[x]==intento){
                        cadenajuego[x] = intento;
                    }
                } 
                
                if(Arrays.equals(cadena, cadenajuego)){
                    System.out.println("\nFelicidades completaste la palabra");
                    i = 8; //FIN DEL JUEGO.
                }else if(i==8){
                    System.out.println("\nLo siento eres un perdedor");
                    System.exit(0); //FIN DEL PROGRAMA
                }  
            System.out.println(cadenajuego); 
        }
}    
    
}

 
        
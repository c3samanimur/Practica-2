package ProblemaArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjercicioArrays {
    
    public static void main(String[] args) {
        int numAlumnos = 40;
        //vector con las notas generadas
        int[] control = new int[numAlumnos];
        int maxNota = 0;
        int minNota = 0;
        float[] calificaciones = new float[numAlumnos];
        
        //Genera notas random entre 1 y 10
        for(int i=0; i < control.length; i++){
            control[i] = (int)(Math.random()*11);
        }
        
        buscarMayorMenor(maxNota, minNota, control);
        
        listaNotas(calificaciones);
       

      
         
        //Empezamos el uso de listas para facilitar la tarea de índices.
        List notas = Arrays.asList(control);
         int indMinNota = notas.indexOf(minNota) + 1;
         int indMaxNota = notas.indexOf(maxNota) + 1;

        //Comprobamos el resultado del ejercicio   
        System.out.println("Mínimo es: " + minNota);
        System.out.println("Máximo es: " + maxNota);
        System.out.println("Indice del mínimo es : " + indMinNota);
        System.out.println("Indice del máximo es : " + indMaxNota);
        System.out.println("Array de Notas :" + notas);
        
        //creamos el array de notas "practicas"
       int[] practicas = new int[numAlumnos];
        for(int i=0; i < practicas.length; i++){
            practicas[i] = (int)(Math.random()*11);
        }
        //Creamos el vector calificaciones
        calificaciones = new float[numAlumnos];
        for(int i = 0; i<control.length; i++){
            calificaciones[i] = 
                    (((float) control[i] 
                    + (float) practicas[i]) 
                    / 2);
        }
        System.out.println("Prácticas      :" + Arrays.toString(practicas));
        System.out.println("Calificaciones :" + Arrays.toString(calificaciones));
        
        //Sacamos la estadística de calificaciones
        //hacemos un array de 10 para la estadística.
        float [] estadistica = new float[10];
      
        for (int i=0; i<10; i++){
            float count = 0;
            float sum = 0;
            for (int j=0; j<control.length; j++){
                if ((i < calificaciones[j]) && ((i+1) >= calificaciones[j] )) {
                    sum += calificaciones[j];
                    count += 1;
                }
            }
            if (count != 0){
                estadistica[i] = ( (float)count / numAlumnos);
            }else{ estadistica[i] = 0;}
            double sol = (Math.round(estadistica[i] * 10000.0)) / 100.0;
            System.out.println("Estadística nota tramo <=" 
                + (i+1) + " = " 
                + sol + "%");
        }
        
        /*6. Suponer un vector de Calificaciones de tamaño 40 
        (máximo de alumnos por clase), pero que solo almacena las
        notas de 31 alumnos. Realizar un programa que permita insertar en
        la posición 4 del vector la calificación de un nuevo 
        alumno en clase al que supuestamente le corresponde como nota un 6.*/
        double[] calif = new double[40];
        for (int j=0; j<31; j++){
            calif[j] = (int)(Math.random()*11);
        }
        System.out.println("Nota antigua alumno nº4: " + calif[3]); 
        calif[3] = 6;
        System.out.println("Nota nueva   alumno nº4: " + calif[3]);
    }
    
    public static void buscarMayorMenor(int maxNota, int minNota, int[] control) {
    	minNota = control[0];
    	maxNota = control[0];
    	
    	for(int i = 0; i < control.length; i++) {
    		
    	}
    }
    public static void listaNotas(float[] calificaciones) {
    	ArrayList<Integer> listaApro = new ArrayList<>();
        ArrayList<Integer> listaSusp = new ArrayList<>();
        
        for (int j = 0; j < calificaciones.length; j++) {
            
            if (calificaciones[j] >= 5) {
                listaApro.add(j + 1); 
            } else {
                listaSusp.add(j + 1);
            }
        }
        System.out.println("Aprobados (nº lista): " + listaApro);
        System.out.println("Suspensos (nº lista): " + listaSusp);
        
    }
}

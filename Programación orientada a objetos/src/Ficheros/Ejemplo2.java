package Ficheros;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class

public class Ejemplo2 {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("./assets/texto.txt", true);
      myWriter.write("\nPaconi dame mis 5 euros");
      myWriter.close();  // must close manually
      System.out.println("Mensaje escrito con éxito");
    } catch (IOException e) {
      System.out.println("Ha ocurrido un error");
      e.printStackTrace();
    }
  }
}

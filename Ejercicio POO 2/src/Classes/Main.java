package Classes;
import Classes.Coordenada;
import java.io.File;                  
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Coordenada> cords = generarCords();
		
		double distanciaTotal = 0;
		for(int i = 0; i < cords.size() - 1; i++) {
			System.out.println(cords.get(i) + " y "+ cords.get(i+1) + ": "  + distancia(cords.get(i), cords.get(i+1)));
			distanciaTotal += distancia(cords.get(i), cords.get(i+1));
		}
		
		System.out.println("\nDISTANCIA TOTAL -- > " + distanciaTotal);
		
		System.out.println("Creando html con toda la información...");
		
		generarHTML(cords);
	}
	
	private static ArrayList<Coordenada> generarCords() {
		ArrayList<Coordenada> cords = new ArrayList();
		File file = new File("Assets/File/coordenadas.txt");

	    try (Scanner reader = new Scanner(file)) {
	      while (reader.hasNextLine()) {
	        String linea = reader.nextLine();
	        String[] data = linea.split(",");
	        
	        double ejeX = Double.parseDouble(data[0]);
	        double ejeY = Double.parseDouble(data[1]);
	        
	        Coordenada newCord = new Coordenada(ejeX, ejeY);
	      
	        cords.add(newCord);
	      
	      }
	    } catch (FileNotFoundException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
		
		return cords;
	}
	
	public static double distancia(Coordenada c1, Coordenada c2) {
		double a = c2.getX() - c1.getX();
		double b = c2.getY() - c1.getY();
		double dist = Math.sqrt(a*a + b*b);
		return dist;
	}
	
	public static void generarHTML(ArrayList<Coordenada> cords) {
		String html = "";
	
		html += "<!DOCTYPE html><html><head><title>Calculo de coordenadas</title><link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"></head><body><h1><b>CALCULO DE COORDENADAS</b></h1>"
				+ "<hr>";
		
		html += "<table class=\"table\">";
		html += "<tr>"
				+ "<th>Coordenada A</th>"
				+ "<th>Coordenada B</th>"	
				+ "</tr>";
		
		double distanciaTotal = 0;
		for(int i = 0; i < cords.size()-1; i++) {
			html += "<tr>"
					+ "<td>" + cords.get(i) + "</td>"
					+ "<td>" + cords.get(i+1) + "</td>"
					+ "</tr>";
			distanciaTotal += distancia(cords.get(i), cords.get(i+1));
		}
		html += "</table>"
				+ "<h2>DISTANCIA TOTAL</h2>"
				+ distanciaTotal 
				+ "</body></html>";
		
		try {
		      FileWriter writer = new FileWriter("Assets/File/pagina.html");
		      writer.write(html);
		      writer.close();
		      System.out.println("HMTL creado con éxito");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

	
	
	
				
	
	
}

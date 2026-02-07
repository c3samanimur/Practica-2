import java.util.ArrayList;
import java.io.File;                  // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; 

public class Main {
	public static void main(String[] args) {
		ArrayList<Coordenada> cords = ingresarCords();
		
		double distTotal = 0;
		for(int i = 0; i < cords.size() - 1	; i++) {
			System.out.println(cords.get(i) + " y " + cords.get(i+1) + ": " + calcularDist(cords.get(i), cords.get(i+1)));
			distTotal += calcularDist(cords.get(i), cords.get(i+1));
			
		}
		System.out.println("DISTANCIA TOTAL: " + distTotal);
		
		generarHtml(cords);
		
	}
	
	public static ArrayList<Coordenada> ingresarCords(){
		ArrayList<Coordenada> cords = new ArrayList<Coordenada>();
		File file = new File("Assets/coordenadas.txt");
		try {
			Scanner reader = new Scanner(file);
			while(reader.hasNextLine()) {
				String linea = reader.nextLine();
				String datos[] = linea.split(",");
				
				double x = Double.parseDouble(datos[0]);
				double y = Double.parseDouble(datos[1]);
				
				Coordenada newCord = new Coordenada(x,y);
				cords.add(newCord);			
				}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return cords;
 	}
	
	public static double calcularDist(Coordenada c1, Coordenada c2) {
		double a = c2.getX() - c1.getX(); 
		double b = c2.getY() - c1.getY();
		double dist = Math.sqrt(a*a + b*b);
		
		return dist;
	}
	
	public static void generarHtml(ArrayList<Coordenada> cords) {
		String html = "";
		
		html += "<!DOCTYPE html><html><head><title>Coordenadas</title><link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n"
				+ "  <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"></script><body>"
				+ "<h1>Coordenadas</h1>";
		
		html += "<table>"
				+ "<tr>"
				+ "<th>COORDENADA 1</th>"
				+ "<th>COORDENADA 2</th>"
				+ "<th>Distancia entre ambas</th>"
				+ "</tr>";
		double distTotal = 0;
		for(int i = 0; i < cords.size()- 1;i++ ) {
			html += "<tr>"
					+ "<td>" + cords.get(i) + "</td>"
					+ "<td>" + cords.get(i+1) + "</td>"
					+ "<td>" + calcularDist(cords.get(i), cords.get(i+1))
					+ "</tr>";
			distTotal += calcularDist(cords.get(i), cords.get(i+1));
		}
		html += "<th>DISTANCIA TOTAL: " + distTotal + "</th>";
		html += "</table></body></html>";
		
		
		
		  try {
			  FileWriter writer = new FileWriter("Assets/web.html");
		      writer.write(html);
		      writer.close();  // must close manually
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		    }
		
	}
	
}



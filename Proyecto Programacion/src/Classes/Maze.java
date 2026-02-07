package Classes;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Maze {
	private char[][] map;
	private String filename;
	private boolean loaded;
	private int startI;
	private int startJ;
	private int endI;
	private int endJ;
	
	
	
	public Maze() {
		this.map = null;
		this.filename = "";
		this.loaded = false;
		this.startI = -1;
		this.startJ = -1;
		this.endI = -1;
		this.endJ = -1;
		
		
	}
	
	public void loadMaze() {
		File folder = new File("assets/mazes");
		File[] files = folder.listFiles();
		
		ArrayList<File> newFile = new ArrayList<>();
		
		if(files != null) {
			for(File f : files) {
				if(f.isFile() && f.getName().toLowerCase().endsWith(".txt")){
					newFile.add(f);
				}
			}
		}
		
		System.out.println("----------LABERINTOS----------\n");
		for(int i = 0; i < newFile.size(); i++) {
			System.out.println((i+1) + "- " + newFile.get(i).getName());
		}
		System.out.println("0- SALIR");
		int opcion = Input.getInt("Escoge una opción: ");
		
		if(opcion == 0) {
			return;
		}
		if(opcion > 0 && opcion <= newFile.size()) {
			File useFile = newFile.get(opcion - 1);
			readMaze(useFile);
			
		}
		
	}
	
	private void readMaze(File file) {
		try {
			int rows = 0;
			int cols = 0;
			Scanner reader = new Scanner(file);
			while(reader.hasNextLine()) {
				String linea = reader.nextLine();
				rows++;
				if(linea.length() > cols) {
					cols = linea.length();
				}
			}
			reader.close();
			this.map = new char[rows][cols];
			this.filename = file.getName();
			
			reader = new Scanner(file);
			for(int i = 0; i < rows; i++) {
				if(reader.hasNextLine()) {
					String linea = reader.nextLine();
					for(int j = 0; j < cols; j++) {
						this.map[i][j] = linea.charAt(j);
					}
				}
			}
			reader.close();
			
			this.loaded = true;
			
			this.startI = -1;
			this.startJ = -1;
			this.endI = -1;
			this.endJ = -1;
			
			System.out.println("El archivo " + this.filename + " se ha cargado directamente");
		} catch(Exception e) {
			System.out.println("Ha ocurrido un error al leer el fichero");
			this.loaded = false;
		}
	}
	public void showMaze() {
		if(!this.loaded || this.map == null) {
			System.out.println("No hay ningun laberinto cargado");
			return;
		}
		int rows = this.map.length;
		int cols = this.map[0].length;
		
		System.out.print("   ");
		for(int i = 0; i < cols; i++) {
			if(i < 10) {
				System.out.print("  ");
			} else{
				System.out.print(" " + i/10);
			}
		}
		System.out.println();
		System.out.print("   ");
		for(int j = 0; j < cols; j++) {
			System.out.print(" " + j%10);
		}
		System.out.println();
		
		for(int i = 0; i < rows; i++) {
			if(i < 10) {
				System.out.print(" " + i + " ");
			} else {
				System.out.print(i + " ");
			}
			for(int j = 0; j < cols; j++) {
				if(i == this.startI && j == this.startJ ) {
					System.out.print(" I");
				} else if(i == this.endI && j == this.endJ) {
					System.out.print(" F");
				} else {
					System.out.print(" " + this.map[i][j]);
				}
			}
			System.out.println();
		}
	}
	public void setStartEnd() {
		
		if(this.loaded) {
			while(true) {
				this.startI = Input.getInt("Introduce la coordenada de INICIO (I): ");
				this.startJ = Input.getInt("Introduce la coordenada de INICIO (J): ");
				if(this.map[startI][startJ] == '#') {
					System.out.println("Esa coordenada coincide con un muro!!!");
				} else {
					break;
				}
				
			}
			
			while(true) {
				this.endI = Input.getInt("Introduce la coordenada de FINAL (I): ");
				this.endJ = Input.getInt("Introduce la coordenada de FINAL (J): ");
				if(this.map[endI][endJ] == '#') {
					System.out.println("Esa coordenada coincide con un muro!!!\n");
				} else {
					break;
				}
			}
		} else {
			System.out.println("No hay ningún laberinto cargado");
		}
		
		
		
	}
	
}

import Classes.Config;
import java.util.Scanner;
import Classes.Config;
import Classes.Input;
import Classes.Session;
import Classes.User;
import Classes.Maze;


/**
 * Main.java Programa principal del sistema para resolver un laberinto DMS -
 * 2023.12.20 version 0.1.0
 */

public class Main {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		Session session = new Session();
		Maze maze = new Maze();
		int option = 0;

		do {
			if (!session.isLogged()) {
				System.out.println(Config.UNLOGGED_MENU);
				option = Input.getInt("SELECCIONE UNA OPCIÓN: ");
				if (option == 1) {
					login(session);
				} else if (option == 2) {
					signup(session);
				}
			} else {
				System.out.println(Config.LOGGED_MENU);
				option = Input.getInt("SELECCIONE UNA OPCIÓN: ");
				if (option == 4) {
					System.out.println("Próximamente...\n\n");
				} else if (option == 5) {
					session.showUser();
				} else if (option == 6) {
					session.logout();
					maze = new Maze();
				} else if(option == 1) {
					maze.loadMaze();
				} else if(option == 2) {
					maze.showMaze();
				} else if(option == 3) {
					maze.setStartEnd();
				}

			}
		} while (option != 0);
		System.out.println(Config.GOODBYE);

	}

	private static void login(Session session) {
		System.out.println("--- INICIAR SESIÓN ---");
		String u = Input.getString("Introduzca su nombre de usuario: ");
		String p = Input.getString("Introduzca su contraseña: ");
		boolean comprobation = session.login(u, p);

		if (comprobation == true) {
			String username = session.getUser().getUsername();
			System.out.println("user: [" + username + "]\n");
			System.out.println("¡Sesión iniciada con éxito!\n");
		} else {
			System.out.println("Nombre o/y contraseña incorrectos\n");
		}
	}

	private static void signup(Session session) {
		System.out.println("--- REGISTRO ---");
		session.signup();
	}
}

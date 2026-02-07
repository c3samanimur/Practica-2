package Classes;

public class User {
	private String username;
	private String name;
	private String nif;
	private String email;
	private String address;
	private String birthdate;
	private String role;
	private String password;

	public User(String username, String name, String nif, String email, String address, String birthdate, String role,
			String password) {
		this.setUsername(username);
		this.setName(name);
		this.setNif(nif);
		this.setEmail(email);
		this.setAddress(address);
		this.setBirthdate(birthdate);
		this.setRole(role);
		this.setPassword(password);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		if (username.length() < 5) {
			System.out.println("ERROR. Minimo 5 caracteres");
		} else {
			this.username = username;
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() < 3) {
			System.out.println("ERROR. Minimo 3 caracteres");
		} else {
			this.name = name;
		}

	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		if (nif.length() != 9) {
			System.out.println("ERROR: El DNI tiene 9 caracteres");
		} else {
			this.nif = nif;
		}

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password.length() < 6) {
			System.out.println("ERROR. La contraseña debe de tener 6 caracteres como mínimo");
		} else {
			this.password = password;
		}

	}

}

package personman.model;

import java.time.LocalDate;

public class Person {
	
	private String name,
				   email,
				   telephone,
				   cpf,
				   city;
	
	private LocalDate birthday;
	
	public Person(String name, String email, String telephone, String cpf, String city, LocalDate birthday) {
		this.name = name;
		this.email = email;
		this.telephone = telephone;
		this.cpf = cpf;
		this.city = city;
		this.birthday = birthday;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getTelephone() {
		return telephone;
	}

	public String getCpf() {
		return cpf;
	}

	public String getCity() {
		return city;
	}

	public LocalDate getBirthday() {
		return birthday;
	}
	
	

}

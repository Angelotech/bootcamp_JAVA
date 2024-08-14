package Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "user_id") /*nome da coluna id*/
	private Integer id;
	
	@Column(length = 50, nullable = false) /*definição do tamanho e impedindo que fique nulo*/
	private String name;
	@Column(length = 50, nullable = false)
	private String Username;
	@Column(length = 100, nullable = false)
	private String passaword;
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", Username=" + Username + ", passaword=" + passaword + "]";
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassaword() {
		return passaword;
	}
	public void setPassaword(String passaword) {
		this.passaword = passaword;
	}
	
	
	
	

}

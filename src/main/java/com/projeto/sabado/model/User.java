package com.projeto.sabado.model;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class User {
	
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	private String email;
	private String celular;
	private String cpf;
	private String endereco;
	private String bairro;
	private String cidade;
	private String senha;
}
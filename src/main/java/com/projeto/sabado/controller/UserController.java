package com.projeto.sabado.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.projeto.sabado.model.User;
import com.projeto.sabado.repo.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepo;

	@GetMapping("/")
	public String home() {
		return "index";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/clientes")
	public String cliente() {
		return "clientes";
	}

	@GetMapping("/contato")
	public String contato() {
		return "contato";
	}

	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("user", new User());
		return "form";
	}

	@PostMapping("/cadastrar")
	public String cadastrar(@RequestParam("nome") String nome, @RequestParam("email") String email,
			@RequestParam("celular") String celular, @RequestParam("cpf") String cpf,
			@RequestParam("endereco") String endereco, @RequestParam("bairro") String bairro,
			@RequestParam("cidade") String cidade, @RequestParam("senha") String senha) {
		
		User user = new User();
		user.setNome(nome);
		user.setEmail(email);
		user.setCelular(celular);
		user.setCpf(cpf);
		user.setEndereco(endereco);
		user.setBairro(bairro);
		user.setCidade(cidade);
		user.setSenha(senha);
		
		userRepo.save(user);
		
		return "redirect:login";
	}

	@GetMapping("/produtos")
	public String produtos() {
		return "produtos";
	}

	@GetMapping("/servicos")
	public String servicos() {
		return "servicos";
	}

	@GetMapping("/sobre")
	public String sobre() {
		return "sobre";
	}

}

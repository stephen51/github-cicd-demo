package com.example.githubcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdApplication {

	@GetMapping("/welcome")
	public String welcome(){
		return "welcome to spring boot";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubCicdApplication.class, args);
	}

}

/*echo "# github-cicd-demo" >> README.md
		git init
		git add README.md
		git commit -m "first commit"
		git branch -M main
		git remote add origin https://github.com/stephen51/github-cicd-demo.git
		git push -u origin main*/

package com.bezahive.symplifica;

import com.bezahive.symplifica.repository.PatientRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.bezahive.symplifica")
@EnableJpaAuditing
//@EnableJpaRepositories(basePackageClasses = PatientRepository.class)

public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

}

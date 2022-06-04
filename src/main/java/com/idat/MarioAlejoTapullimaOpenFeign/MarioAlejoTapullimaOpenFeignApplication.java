package com.idat.MarioAlejoTapullimaOpenFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MarioAlejoTapullimaOpenFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarioAlejoTapullimaOpenFeignApplication.class, args);
	}

}

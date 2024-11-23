package com.SoftForAll.Planify;

import org.springframework.boot.SpringApplication;

public class TestPlanifyApplication {

	public static void main(String[] args) {
		SpringApplication.from(PlanifyApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}

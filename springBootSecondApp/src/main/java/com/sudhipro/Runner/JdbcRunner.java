package com.sudhipro.Runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
//@Order(1)
public class JdbcRunner implements CommandLineRunner,Ordered{

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Jdbc Runner by sudhhakar order 1 and ordered 10");
	}
	
	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 10;
	}
	
}

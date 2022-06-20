package com;

			import org.springframework.boot.SpringApplication;
			import org.springframework.boot.autoconfigure.SpringBootApplication;
			import org.springframework.context.ApplicationContext;

			import com.entity.Coder;

			@SpringBootApplication
			public class FristSpringBootApplication {

				public static void main(String[] args) {
					ApplicationContext ctx= SpringApplication.run(FristSpringBootApplication.class, args);
					System.out.println("Welcome to Spring Boot");
					
					Coder c1=(Coder) ctx.getBean("coder");
					c1.setCid(102);
					c1.setCname("Mina");
					c1.setTech("Java");
					
					System.out.println(c1);
					System.out.println(c1.hashCode());
					
					Coder c2=(Coder) ctx.getBean("coder");
					c2.setCid(103);
					c2.setCname("Pia");
					c2.setTech("JavaFS");
					
					System.out.println(c2);
					System.out.println(c2.hashCode());	
			
	}

}

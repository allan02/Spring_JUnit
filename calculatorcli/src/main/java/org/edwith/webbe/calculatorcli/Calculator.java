package org.edwith.webbe.calculatorcli;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Calculator {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		CalculatorServiceAnnotation calculatorService = applicationContext.getBean(CalculatorServiceAnnotation.class);
		System.out.println(calculatorService.plus(10, 50));
		((ConfigurableApplicationContext)applicationContext).close();
	}

}

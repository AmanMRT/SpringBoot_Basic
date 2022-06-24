package com.aman.Annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Exynos implements Processor {

	public void processor() {
		System.out.println("Samsung CPU");
	}

}
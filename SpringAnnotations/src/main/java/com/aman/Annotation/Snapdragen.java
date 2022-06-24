package com.aman.Annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Snapdragen implements Processor {

	public void processor() {
		System.out.println("BEST CPU");
	}

}

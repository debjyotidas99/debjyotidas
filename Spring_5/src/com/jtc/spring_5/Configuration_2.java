package com.jtc.spring_5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Configuration_2 {

	@Bean("ParentA")
	public ParentA createParentA(A aobj, B bobj) {
		ParentA pa = new ParentA(aobj, bobj);
		return pa;
	}
}

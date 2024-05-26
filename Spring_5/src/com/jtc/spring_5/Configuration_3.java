package com.jtc.spring_5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Configuration_3 {
	@Bean("ParentB")
	public ParentB createParentB(A aobj, B bobj) {
		ParentB pb = new ParentB();
		pb.setAobj(aobj);
		pb.setBobj(bobj);
		return pb;
		
	}
}

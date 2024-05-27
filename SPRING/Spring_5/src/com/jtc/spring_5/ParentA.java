package com.jtc.spring_5;

public class ParentA {
	A aobj;
	B bobj;

	public ParentA() {
		super();
	}

	public ParentA(A aobj, B bobj) {
		super();
		this.aobj = aobj;
		this.bobj = bobj;
	}

	public void showParentA() {
		System.out.println("showParentA in ParentA");
		System.out.println(aobj);
		System.out.println(bobj);
	}
}
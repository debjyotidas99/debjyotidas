package com.jtc.spring_5;

public class ParentB {
	A aobj;
	B bobj;

	public ParentB() {
		super();
	}

	public void setAobj(A aobj) {
		this.aobj = aobj;
	}

	public void setBobj(B bobj) {
		this.bobj = bobj;
	}

	public void showParentB() {
		System.out.println("showParentB in ParentB");
		System.out.println(aobj);
		System.out.println(bobj);
	}

}

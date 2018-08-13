package com.ooad.create.builder;

public class ManBuilder implements PersonBuilder {
	private Person person;

	public ManBuilder() {
		person = new Man();
	}

	public void buildBody() {
		person.setBody("建造男人的身体");
	}

	public void buildFoot() {
		person.setFoot("建造男人的脚");
	}

	public void buildHead() {
		person.setHead("建造男人的头");
	}

	public Person buildPerson() {
		return person;
	}

}

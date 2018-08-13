package com.ooad.create.builder;

public class PersonDirector extends Person {
	public Person constructPerson(PersonBuilder pb) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }

}

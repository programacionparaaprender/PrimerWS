package com.people.management;

public class PeopleImpl implements People {
	private String name = null;
	private int age;
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setAge(int age) {
		this.age = age;

	}

	@Override
	public int getAge() {
		return this.age;
	}

}

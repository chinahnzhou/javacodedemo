package cn.java.demo.data_cassandra.entity;

import javax.persistence.Table;

import org.springframework.data.cassandra.mapping.PrimaryKey;

@Table
public class Person {

	@PrimaryKey
	private final String id;

	private final String name;
	private final int age;

	public Person(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return String.format("{ @type = %1$s, id = %2$s, name = %3$s, age = %4$d }", getClass().getName(), getId(),
				getName(), getAge());
	}
}
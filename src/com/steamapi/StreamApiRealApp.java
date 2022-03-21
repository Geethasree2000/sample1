package com.steamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
	private int id;
	private String name;
	private double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class StreamApiRealApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(101,"gita",43453.54));
		l.add(new Employee(104,"rita",43443.54));
		l.add(new Employee(102,"nita",34553.54));
		l.add(new Employee(108,"sita",54443.54));
		
		Stream<Employee> st = l.stream();
		//l.stream().forEach(a -> System.out.println(a));
		List<Employee> ls2 = l.stream()
				.filter(a->a.getSalary() > 35000.00)
				.collect(Collectors.toList()); 
		ls2.forEach(System.out::println);
	}

}

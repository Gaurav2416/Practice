package oop;

public class Person {
String name;
int age;
Person(String name,int age){
	this.name = name;
	this.age = age;
}
public String toString() {
	return this.name + "\t" + this.age +"\t";
}
}

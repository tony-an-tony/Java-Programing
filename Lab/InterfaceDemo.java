package oopj24lab71;
import java.util.Scanner;
abstract class Animal{
	int leg;
	Animal(int leg){
		this.leg=leg;
	}
	void walk() {
		if (leg==0) {
			System.out.println("the Animal has no legs");
		}
		else{
			System.out.println("the Animal walks by "+leg+" legs");
		}
	}
}
class Spider extends Animal{
	int leg;
	Spider(int leg) {
		super(leg);
	}
	void eat() {
		System.out.println("\nSPIDER");
		System.out.println("spider eats insects");
	}
}
interface Pet{
	void getName();
	void setName(String name);
	void play();
}
class Cat extends Animal implements Pet {
	String name;
	Cat(String name,int leg){
		super(leg);
		this.name=name;
	}
	public void getName(){
		System.out.println("the name of the cat is "+name);
	}
	public void setName(String name) {
		this.name=name;
	}
	public void play() {
		System.out.println("Cat play with rats");
	}
	void eat(){
		System.out.println("Cat eats fish");
	}
}
class Fish extends Animal implements Pet{
	String name;
	Fish(String name){
		super(0);
		this.name=name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void getName() {
		System.out.println("the name of the fish is "+name);
	}
	public void play() {
	}
	void eat() {
		System.out.println("Fish eat plants");
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Fish fs=new Fish("mimi");
		System.out.println("FISH");
		fs.getName();
		fs.walk();
		fs.play();
		fs.eat();
		fs.setName("momo");
		fs.getName();
		Cat ct=new Cat("fluffy",4);
		System.out.println("\nCAT");
		ct.getName();
		ct.walk();
		ct.play();
		ct.eat();
		ct.setName("moose");
		ct.getName();
		Spider sp=new Spider(8);
		sp.eat();
		sp.walk();
	}
}

package labprojects;

public class Lab5 {
	public static void main(String[]args){
		Person a = new Person();
		System.out.println("a is " + a.getName());
		
		Person b = new Person("John Smith", 'm');
		System.out.println("b is " + b.getName());
		System.out.println("b's gender is " + b.getGender());
		
		Person c = new Person("Anne Smith", "1987-12-01",'f');
		System.out.println("c " + c.getName());
		
		int[] intarray = new int[25];
		Person[] people = new Person[25];//create an array of person objects
		
		people[0] = new Person();//make a new person object
		
		for(int i = 0; i<25; i++){
			people[i]=new Person();
		}
		
		System.out.println(Person.getPeople());
		System.out.println(a.getPeople());
		System.out.println(a);
	}
}

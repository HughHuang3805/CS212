package labprojects;


	public class Lab6 {

		public static void main(String[] args) {
			Person a = new Person();
			Person b = new Person("John Smith", 'm');
			Person c = new Person("Anne Smith", "1987-12-01", 'f');
			Person d = new Person("Jane Smith", "1990-10-01", 'f', "122930191");
			Person e = new Person("Jane Smith", "1992-10-01", 'f', "100811212");
			LinkedList listA = new LinkedList(a);
			listA.append(b);
			listA.append(c);
			listA.append(d);
			listA.append(e);
			System.out.println("Appended List: \n" + listA);
			
			LinkedList listB = new LinkedList(a);
			listB.insert(b);
			listB.insert(c);
			listB.insert(d);
			listB.insert(e);
			System.out.println("Inserted List: \n" + listB);
			
			if (listB.find(b)) {
				System.out.println(b + "is on the list");
			}
			listB.delete(b);
			if (listB.find(b)) {
				System.out.println(b + "is on the list");
			}
			
			

		}

	}


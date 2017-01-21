public class Ex2{
	
	public static void main(String[]args){
		
		int [] i = { 97, 84, 72, 5,};//initialize the array
		int [] i = new int[5];//contructor with array size 5
		
		char[]i = new char[5];//char array with size 5
		i[0] = 'h';
		i[1] = 'e';
		i[2] = 'l';
		i[3] = 'l';
		i[4] = 'o';
		
		for(int j=0; j<5; j++){
			System.out.println(i[j]; // print out the array using a for loop
		}
	
		for(int j=4; j>=0; j--){
			System.out.println(i[j]; //print out the array using a for loop from the last digits
		}
		
		for(int j=0; j<i.length; j++){//find out the size of the array
			System.out.println(i[j]; 
		}
		/*line 23 is not calling the method, it is accessing it directly
		  line 31 is using the method length() of the String class
		*/
		String s = "hello";
		
		for(int i =0; i<s.length(); i++){
			System.out.println(s.charAt(i));
		}
		
		s = s+s; // can concatenate strings
		         // cannot add character to the size of the array
		
		int []a=new int[8]; // an array of integers
		int []b={9,3,17,2,8,12,6,4};
		for(int i =0; i<a.length(); i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		selection(a);
		for(int i=0; i<a.lenght;i++){
			System.out.print(a[i]+" ");
		}
		
		
		
	}
	
	public static selevtion(int []x){//selection sort
		for(int i =0; i<x.length-1;i++){
			int min=x[i];
			int minindex=i;
			for(int j=i+1;j<x.length-1;j++){
				if(x[j]<min){
					min=x[j];
					minindex=j;
				}//if
			}// for j
			int temp = x[i];
			x[i]=min;
			x[minindex]= temp;
		}//for i 
	}
	//big O notation
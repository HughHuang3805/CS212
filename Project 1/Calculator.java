import javax.swing.*;
import java.lang.Math;

public class Calculator {
	
	//checks if every character of an input is valid
	public static boolean isNumber(String x){
		for(int i =0; i<(x.length()); i++){
			if(!Character.isDigit(x.charAt(i))){
				return false;
			}
		}
		return true;
	}
	
	//checks if the proper operator is input
	public static boolean isOperator(String x){
		if(x.equals("+")||x.equals("-")||x.equals("/")||x.equals("*")||x.equals("^")){
			return true;
		}
		return false;
	}
	
	//addition
	public static int add(int x, int y){
		return (x+y); 
	}
	
	//subtraction
	public static int sub(int x, int y){
		return (x-y); 
	}
	
	//multiplication
	public static int mult(int x, int y){
		return (x*y); 
	}
	
	//division
	public static int div(int x, int y){
		if(y==0) JOptionPane.showMessageDialog(null, "Cannot perform division with zero. ");
		return (x/y); 
	}
	
	//exponential
	public static int exp(int x, int y){
		double num1 = (double) x;
		double num2 = (double) y;
		return (int) Math.pow(num1, num2); 
	}
	
	public static void main(String[] args){
		boolean work=true;
		String operator, num1, num2;
		int result=0;
		while(work){
			num1 = JOptionPane.showInputDialog(null, "Please enter the first integer: ");
			while(!isNumber(num1)){ //checks if the first input is an integer
				num1 = JOptionPane.showInputDialog(null, "It is not an integer. Try again: ");
			}
			
			num2 = JOptionPane.showInputDialog(null, "Please enter the second integer: ");
			while(!isNumber(num2)){ //checks if the second input is an integer
				num2 = JOptionPane.showInputDialog(null, "It is not an integer. Try again: ");
			}
			
			operator = JOptionPane.showInputDialog(null, "Please enter the operator: ");
			while(!isOperator(operator)){ //checks if it is a valid operator
				operator = JOptionPane.showInputDialog(null, "It is not an operator. Try again: ");
			}
			
			int x = Integer.parseInt(num1);//change the string into an integer
			int y = Integer.parseInt(num2);//change the string into an integer
			
			switch (operator) {//setting different cases for calculation
			case "+":
				result = add(x, y);
				break;
			case "-":
				result = sub(x, y);
				break;
			case "/":
				result = div(x, y);
				break;
			case "*":
				result = mult(x, y);
				break;
			case "^":
				result = exp(x, y);
				break;
			}
			
			JOptionPane.showMessageDialog(null, "The result is: " + result);
			String ans1 = JOptionPane.showInputDialog(null, "Press 'Stop' to exist the calculator.").toLowerCase();
			
			//program exists if 'stop' is input
			if(ans1.equals("stop")){
				work = false;
			}
		}//while
		System.exit(0);
	}//main
}
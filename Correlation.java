/*
        +----------------------------------------------------------------------------+
        |            Monmouth University Spring 2013 SE 403-01		             |


        +----------------------------------------------------------------------------+
        | Program Name:  Correlation                                         		 |
        | Author:        Joey Gudzak                                                 |
        | Version:        1.0                                                        |
        | Date:           2/13/17                                                    |
        | Synopsis:                                                                  |
        |                This program will calculate the correlation between         |
        |				a pairs of numbers x and y.                                  |
        | References:                                                                |
        +----------------------------------------------------------------------------+
*/
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Correlation {
 
	public nodeClass firstNode;
	
	 Correlation(){
		 firstNode = null;
	 			}
	public boolean isEmpty() {
		return (firstNode == null);
	}
	
	public void insertFirstNode(double numbers) {
		nodeClass newNode = new nodeClass(numbers, firstNode);	
		firstNode = newNode;		
	}
	
	public void displayList() {
		nodeClass node = firstNode;
		while(node != null) {
			node.display();
			System.out.println("Next number is: " + node.next);
			node = node.next;
			System.out.println();
		}
	}
	
	  public nodeClass find(double numbers){
	 
		     nodeClass theLink = firstNode;
		
		       for(double i = 0; i < numbers; i++){
		    	   theLink = theLink.next;
		       }
		         return theLink;
		
		     }
	  
  /*
  * Main method 
  * Gets the text files
  * Then calculates the calculation
  */
	public static void main(String args[]) throws IOException {
	
	//get files 
	Scanner textfile1 = new Scanner(new File("numbers1"));
	Scanner textfile2 = new Scanner(new File("numbers2"));  
		 
	
	// variables to calculate correlation
	double xsum = 0;
	double xsquaredsum = 0;
	double ysum = 0;
	double ysquaredsum = 0;
	double sumOfXY=0;
	
	double corrCalc;
	double top=0;
	double calc1=0;
	double calc2=0;
	double calc3=0;
	double bottom=0;
	double rSquared=0;
	int c1=0;
	int c2=0;
	double t1 = 0;
	double std = 0;
	double sum1 = 0;
	
	

	
	
		Correlation numbers1 = new Correlation(); 
		Correlation numbers2 = new Correlation();
		
		//Displays list 1
		System.out.println("SetNumbers1: ");
	
		while(textfile1.hasNextDouble()) {	
			numbers1.insertFirstNode(textfile1.nextDouble());
			c1++;
		}
		numbers1.displayList();
	
		
		//Displays list 2
		System.out.println("SetNumbers2:");
	
		while(textfile2.hasNextDouble())
		{
				numbers2.insertFirstNode(textfile2.nextDouble());
				c2++;
		}
		numbers2.displayList();
		 
		 
		   double xsum2 = 0;
		   double ysum2 = 0;
		for (double numbers = 0; numbers < c1; numbers++)
		    {
			   xsum2= numbers1.find(numbers).getNum();
		
		    xsum += numbers1.find(numbers).getNum(); //finds x
		    xsquaredsum += (numbers1.find(numbers).getNum() * numbers1.find(numbers).getNum()); // finds x^2
		    sumOfXY+= (numbers2.find(numbers).getNum() * numbers1.find(numbers).getNum());// finds x+y
		    
		    }
		    
	
		    
			for (double numbers = 0; numbers < c2;numbers++){
		    	//ysum2 = numbers2.find(numbers).getNum();
		    	ysum = ysum + numbers2.find(numbers).getNum(); //finds y
		    	ysquaredsum = ysquaredsum + (numbers2.find(numbers).getNum() * numbers2.find(numbers).getNum()); //finds y^2
		    }
	
		    
//Correlation formula
	top = ((c1 * sumOfXY) - (xsum * ysum));
	calc1 = (c1* xsquaredsum) - (xsum * xsum);
	calc2 = (c2 * ysquaredsum) - (ysum * ysum);
	calc3 = calc1 * calc2;
	bottom = Math.sqrt(calc3);
	corrCalc = (top/bottom);
	rSquared = corrCalc * corrCalc;
	
	t1 = xsum / c1;
	double sum = Math.pow(xsum2 - t1, 2);
	sum1 = Math.sqrt((sum) / (c1));
	
	ysum2 =   xsum2 - xsum / std;
	
	
	//prints out r and r^2
	// System.out.println("R x,y= "+ corrCalc);
	// System.out.println("R squared= "+ rSquared );
	System.out.println(sum1);
	
	
	
	
	double n = 1;
	double b = 1.1;
	double e = .00001;
	double x = 1;
	double i = 0;
	
	double r = Math.sqrt(2 * 3.14);
	double r1 = n / r;
	double r3= (-1/2) * x * Math.pow(i,2);
	double r2 = r1 * Math.exp(r3);
	
	double formula = ((2 * n) - 1) / 2;
	double formula1 = formula * b;
	double formula2 = 1.1 / 4;
	double formula23 = formula * formula2;
	double for2 = formula23 * r2;
	System.out.println(for2);
	
	
	
	
	
 
	}
}
	

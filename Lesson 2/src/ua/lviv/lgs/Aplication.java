package ua.lviv.lgs;

import java.util.Iterator;

public class Aplication {
	
	static int getSum(int n)
    {    
        int sum = 0;
          
        while (n != 0)
        {
            sum = sum + n % 10;
            n = n/10;
        }
      
    return sum;
    }
		
		public static void main(String[] args) {
			
			 int n = 687;
			  
		        System.out.println(getSum(n));
			
//			ax2+bx+c=0
			
			int a = 1;
			
			int b = 12;
			 
			int c = 36;
			
			int D ;
			
			D=(b*b-4*a*c);
			
			double x1 = ((-b+Math.sqrt(D))/2*a);
			
			double x2 = ((-b-Math.sqrt(D))/2*a);
			
				System.out.println("Дискримінант = " + D);
			
			if (D<0) {
				System.out.println("Отже рівняння коренів не має");
			}
			else if (D>0) {
				System.out.println("x1 =" + x1 + ", x2 = " + x2);
			}
			else {
				System.out.println("x1 =" + x1);
			}
			
			
			String args1 [] = {"1", "2", "34", "21", "15"};
			
			int sum = 0;
			
			for (int i = 0; i < args1.length; i++) {
				sum = sum + Integer.parseInt(args1[i]);
			}
			
			System.out.print(sum);
			
//			

			int num1 = 55, num2 = 121;

	        while (num1 != num2) {
	        	if(num1 > num2)
	                num1 = num1 - num2;
	            else
	                num2 = num2 - num1;
	        }

	        System.out.print("GCD of given numbers is: " + num2);
			
			
			
			
		}
}

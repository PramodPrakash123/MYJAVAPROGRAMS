
import java.util.Scanner;
public class Assignment {

Scanner sc = new Scanner(System.in);

 

           

       public void checkPalindrome()  {
      
    	   int n,digit,temp,num=0;
    	   System.out.println("entera number");
    	   n=sc.nextInt();
    	   temp=n;
    	   while(n!=0) {
    		   digit=n%10;
    		   num=num*10+digit;
    		   n=n/10;
    	   }
    	   if(num==temp) {
    		   System.out.println(temp+" is a Plindrome number");
    	   }else {
    		   System.out.println(temp+" is not a Plindrome number");
    	   }
      }

 

            //function to printPattern

       public void printPattern() {
    	   int i,n, j;
			System.out.println("enter a number");
			n=sc.nextInt();
			for(i=n;i>=1;i--) {
				for(j=i;j>=1;j--) {
					System.out.print("*"+" ");
					
				}
				System.out.println("");
			}

      }

 

          //function to check no is prime or not

        public void checkPrimeNumber() {
        	int i,count=0,n;
        	System.out.println("ente a number");
        	n=sc.nextInt();
        	for(i=2;i<n;i++) {
        		if(n%i==0) {
        			count++;
        		}
        	}if(count==0) {
        		System.out.println(n+" is  a prime number");
        	}else {
        		System.out.println(n+" is not  a prime number");
        	}
        	

        }

         

    
        
          public void printFibonacciSeries() {

                //initialize the first and second value as 0,1 respectively.

           int first = 0, second = 1,n,i,sum;
           
   		System.out.println(" enter  a  number");
           
           n=sc.nextInt();
           for(i=1;i<=n;i++) {
        	   System.out.println(first);
        	   sum=first+second;
        	   first=second;
        	   second=sum;
        	
           }

          }

 


      public static void main(String[] args) {

                Assignment obj = new Assignment();

                int choice;
                

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

 

case 3: {

obj.checkPrimeNumber();

}

break;

 

case 4: {

 

obj.printFibonacciSeries();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}



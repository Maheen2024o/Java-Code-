package Test;

public class loops {

	public static void main(String[] args) {
		
		
		 for(int i=1; i<10; ++i)
	        {
	        	for(int j=1 ; j<i; ++j)
	        	{
	        		System.out.print("* ");
	        	}
	        	System.out.print("\n");
	        }
		 
		 //adding two arrays using loops
		 
		 int a[]= {1,2,1,2,3};
		 int b[]= {1,8,2,9,2};
		 int c[]= new int[5];;
		 System.out.print("Adding two arrays using loops");
		 
		for(int i=0; i<5 ;i++)
		 {
			 
			 c[i]= a[i] + b[i];
		 }
		
		 for(int i=0; i<5 ;i++)
		 {
			 
			 System.out.print("\n"+c[i]);
			 
		 }
		System.out.print("\nMultiplying two arrays using loops");
		 
		for(int i=0; i<5 ;i++)
		 {
			 
			 c[i]= a[i] * b[i];
		 }
		 
		 for(int i=0; i<5 ;i++)
		 {
			 
			 System.out.print("\n"+c[i]);
			 
		 }
		 
		 System.out.print("\n----------------------------------------------------");
		 int in =1;
		 while (in <=20)
		 {
			 if(in ==3)
			 {
				 in +=2;
				 continue;
			 }
			 
			 System.out.print("\n"+ in);
			 in++;
			 
			 if((in % 2)== 0)
			 {
				 in++;
			 }
			 if(in >10)
			 {
				 break;
			 }
		 }
		 
		 System.out.print("\n----------------------------------------------------");
		 int k=1000;
		 do 
		 {
			 System.out.println(k);
			 k++;
		 }while(k < 10);
		 

		 
		 

	}

}

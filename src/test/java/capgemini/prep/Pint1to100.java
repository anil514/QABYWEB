package capgemini.prep;

public class Pint1to100 {
	
	  static void PrintNumber(int num)
	   {
	      System.out.println(num);	
	      num=num+1;     
	      if(num<=100)
	      {
	    	  PrintNumber(num);
	      }
	      }

	public static void main(String[] args) {
		PrintNumber(1); 
	}

	}



class StaerPattern2
{

      public static void main(String[] args)
	  {
	     for(int i=1;i<=3;i++)
		 {
		   for(j=1;j<=i;j++)
		   {
		     System.out.print("*");
		   }
		   System.out.println();
	     } 
	     
		 for(int i=1;i<=3;i++)
		 {
		   for(int j=3;j>=i;j--)
		   {
		     System.out.print("*");
		   }
		   System.out.println();
		 }
		 
	  }
	  
}


/*

      *
	  * *
	  * * *
	  * *
	  *



*/
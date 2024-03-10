
/*
01 02 03 04 05 
06 07 08 09 10 
11 12 13 14 15 
16 17 18 19 20 
21 22 23 24 25
*/

public class Main
{
	public static void main(String[] args) {
	    int n=5;
	    int count =0;
    for(int i=1;i<=n;i++)
        {
           
            for(int j=1;j<=n;j++)
                {
                   if(count<9)
                   {
                       System.out.print("0" + ++count + " ");
                   }
                   else{
                       System.out.print(++count + " ");
                   }
                 
                }
                System.out.println();
        }
    
    	}
}

/*
1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5 

*/


public class Main
{
	public static void main(String[] args) {
	    int n=5;
	    
    for(int i=1;i<=n;i++)
        {
           
            for(int j=1;j<=n;j++)
                {
                   System.out.print(i + " ");
                 
                }
                System.out.println();
        }
    
    	}
}



/* 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 
1 2 3 4 5 

*/


public class Main
{
	public static void main(String[] args) {
	    int n=5;
	    
    for(int i=1;i<=n;i++)
        {
           
            for(int j=1;j<=n;j++)
                {
                   System.out.print(j + " ");
                 
                }
                System.out.println();
        }
    
    	}
}

/*
12345
23456
34567
45678
56789
*/


public class Main
{
	public static void main(String[] args) {
	    int n=5;
	    
    for(int i=1;i<=n;i++)
        {
           int count = i;
            for(int j=1;j<=n;j++)
                {
                   System.out.print(count++);
                 
                }
                System.out.println();
        }
    
    	}
}

/*
1234
234
34
4

*/


public class Main
{
	public static void main(String[] args) {
	    int n=5;
	    
    for(int i=1;i<=n;i++)
        {
           int count = i;
            for(int j=1;j<=n-i;j++)
                {
                   System.out.print(count++);
                 
                }
                System.out.println();
        }
    
    	}
}

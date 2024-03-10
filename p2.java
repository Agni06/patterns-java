/*
  12345
1   5
1   5
1   5
12345
  */






public class Main
{
	public static void main(String[] args) {
	    int n=5;
    for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
                {
                    if(i==1 || j ==n  || j==1 || i==n)
                    {
                        System.out.print(j);
                    }
                    else{
                        System.out.print(" ");
                    }

                }
                System.out.println();
        }
    
    	}
}

/*
11111
2   2
3   3
4   4
55555


*/

public class Main
{
	public static void main(String[] args) {
	    int n=5;
    for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
                {
                    if(i==1 || j ==n  || j==1 || i==n)
                    {
                        System.out.print(i);
                    }
                    else{
                        System.out.print(" ");
                    }

                }
                System.out.println();
        }
    
    	}
}


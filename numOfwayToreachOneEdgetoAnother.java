/*
 *  program to calculate total number of ways to reach from top left cornar to 
 *  bottom right corner in n*m metrix
 */

public class numOfwayToreachOneEdgetoAnother {
    public static void main(String[] args) {
        System.out.println(fun(2, 2));
    }   
    public static int fun(int n,int m)
    {
        if(n==1 || m==1)
         return 1;
        else 
         return fun(n, m-1)+fun(n-1,m);
    }
}

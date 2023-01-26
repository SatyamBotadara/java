public class josephus{


    // josephus problem using recursion 
    // 
    //

    public static void main(String[] args) 
    {
        System.out.println(fun(5,3));
    }
    public static int fun(int n,int k){
        if(n==1)
         return 0;
        else
        {
            return (fun(n-1,k)+k)%n;
        }
    }
}
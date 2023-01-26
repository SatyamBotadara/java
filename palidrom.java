public class palidrom {
    public static void main(String[] args) {
        System.out.println(fun("satyam",0,2));
    }
    public static boolean fun(String str,int left,int right)
    {
        if(left==right)
         return true;
        
        if(left>right)
         return false;

        if(str.charAt(left)!=str.charAt(right))
         return false;

        return fun(str,left+1,right-1);

    }
}

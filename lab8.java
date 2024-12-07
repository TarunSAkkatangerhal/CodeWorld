import java.util.*;
class maza extends Exception{
    public maza(String m){
        super(m);
    }
}
public class lab8 {
    static double divide(int Num,int Deno) throws maza{
        if(Deno==0){
            throw new maza("cannot divide by zero");
        }
        return (double)Num/Deno;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Num and Deno");
        int Num=sc.nextInt();
        int Deno=sc.nextInt();
        try {
            double res=divide(Num,Deno);
            System.out.println("result :"+res);
        } catch (maza e) {
            System.out.println("caught msg : "+e.getMessage());
        }
    }
}

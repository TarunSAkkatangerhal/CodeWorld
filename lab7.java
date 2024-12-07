import java.util.*;
interface resizeable{
    void rw(int w);
    void rh(int h);
}
class rect implements resizeable{
    private int w;
    private int h;
    public rect(int w,int h){
        this.w=w;
        this.h=h;
    }
    public void rh(int h){
        this.h=h;
    }
    public void rw(int w){
        this.w=w;
    }
    public void displayDim(){
        System.out.println("current dimension :"+w+"X"+h);
    }

}
public class lab7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        rect r=new rect(10,20);
        r.displayDim();
        System.out.println("enter new width and height");
        int w=sc.nextInt();
        int h=sc.nextInt();
        r.rw(w);
        r.rh(h);
        r.displayDim();
    }
    
}

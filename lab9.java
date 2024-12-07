import java.util.*;
class sq extends Thread{
    int x;
    sq(int n){
        x=n;
    }
    public void run(){
        int sqr=x*x;
        System.out.println("square of "+x+"="+sqr);
    }
}
class cube extends Thread{
    int x;
    cube(int n){
        x=n;
    }
    public void run(){
        int cu=x*x*x;
        System.out.println("cube of "+x+"="+cu);
    }
}
class Rnumber extends Thread{
    public void run(){
        Random r=new Random();
        for (int i = 0; i < 5; i++) {
            int rInteger=r.nextInt(10);
            System.out.println("Random integer :"+rInteger);
            sq s=new sq(rInteger);
            s.start();
            cube c=new cube(rInteger);
            c.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class lab9 {
    public static void main(String[] args) {
        Rnumber n=new Rnumber();
        n.start();
    }
    
}

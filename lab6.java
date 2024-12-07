import java.util.*;
abstract class shape{
    abstract double cala();
    abstract double calp();
}
class circle extends shape{
    private double r;
    public circle(double r){
        this.r=r;
    }
    @Override
    double cala(){
        return Math.PI*r*r;
    }
    @Override
    double calp(){
        return 2*Math.PI*r;
    }
}
class tri extends shape{
    private double s1,s2,s3;
    public tri(double s1,double s2,double s3){
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
    double cala(){
        double s=(s1+s2+s3)/3;
        return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    }
    double calp(){
        return s1+s2+s3;
    }
}



public class lab6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        int r=sc.nextInt();
        shape c=new circle(r);
        System.out.println("Circle area "+c.cala());
        System.out.println("Circle perimeter "+c.calp());
        System.out.println("Enter sides of triangle");
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        shape t=new tri(s1,s2,s3);
        System.out.println("triangle area "+c.cala());
        System.out.println("triangle perimeter "+c.calp());

    }
    
}

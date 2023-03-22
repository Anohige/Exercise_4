import java.util.Scanner;

class Rectangle{
    float a,b,area;
    public Rectangle(){
        get_side1();
        get_side2();
        computeField();
        display();
    }
    void get_side1(){
        System.out.println("Enter your side length: ");
        Scanner Sc= new Scanner(System.in);
        a = Sc.nextFloat();
    }
    void get_side2(){
        System.out.println("Enter your side breadth: ");
        Scanner Sc= new Scanner(System.in);
        b = Sc.nextFloat();
    }
    void computeField(){
        area = a*b;
    }
    void display(){
        System.out.println("The area of the rectangle of side a: " + a + " and side b: " + b +" is: "+area);
    }
}
public class RectangleArea {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
//        rec.get_side1();
//        rec.get_side2();
//        rec.computeField();
//        rec.display();
    }
}

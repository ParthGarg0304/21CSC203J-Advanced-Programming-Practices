/*subroutine program to calculate the area and perimeter of different geometric*/


shapes (circle, rectangle, triangle, etc.).

import java.util.Scanner;

public class area
{
    int r,l,b,base,h;
    double pi = 3.14,area;
    Scanner s=new Scanner(System.in);
    void circle()
    {
        System.out.print("Enter radius of circle:");
        r=s.nextInt();
        area=pi*r*r;
        System.out.println("area of circle:"+area);
    } 
    void rectangle()
    {
        System.out.print("Enter length of rectangle:");
        l = s.nextInt();
        System.out.print("Enter breadth of rectangle:");
        b = s.nextInt();
        area = l*b;
        System.out.println("area of rectangle:"+area);
    }
    void triangle()
    {
        System.out.print("Enter length of base of triangle:");
        base=s.nextInt();
        System.out.print("Enter length of height of triangle:");
        h=s.nextInt();
        area = 0.5*base*h;
        System.out.println("area of triangle:"+area);
    }
    
public class Perimeter 
{
    int r, l, b, s1, s2, s3;
    double pi = 3.14,perimeter;
    Scanner s = new Scanner(System.in);
    void circle()
    {
        System.out.print("Enter radius of circle:");
        r = s.nextInt();
        perimeter = 2 * pi * r;
        System.out.println("Perimeter of circle:"+perimeter);
    } 
    void rectangle()
    {
        System.out.print("Enter length of rectangle:");
        l = s.nextInt();
        System.out.print("Enter breadth of rectangle:");
        b = s.nextInt();
        perimeter = 2 * (l + b);
        System.out.println("Perimeter of rectangle:"+perimeter);
    }
    void triangle()
    {
        System.out.print("Enter length of first side of triangle:");
        s1 = s.nextInt();
        System.out.print("Enter length of second side of triangle:");
        s2 = s.nextInt();
        System.out.print("Enter length of third side of triangle:");
        s3 = s.nextInt();
        perimeter = s1 + s2 + s3;
        System.out.println("Perimeter of triangle:"+perimeter);
    }
}

public class main
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        
        area obj1=new area();
        Perimeter obj2 = new Perimeter();
        
        System.out.print("Enter operation:");
        System.out.print("1:area");
        System.out.print("2:perimeter");
        int op = s.nextInt();
        
        System.out.print("Enter shape:");
        System.out.print("1:circle");
        System.out.print("2:rectangle");
        System.out.print("3:triangle");
        int shape = s.nextInt();
        
        if(op==1){   //area
            if(shape==1){
               obj1.circle(); 
            }
            else if(shape==2){
                obj1.rectangle()
            }
            else if(shape==3){
                obj1.triangle();
            }
            else{
                System.out.println("Wrong input");
            }
        }
        
        else if(op==2){     //perimeter
            if(shape==1){
               obj2.circle(); 
            }
            else if(shape==2){
                obj2.rectangle()
            }
            else if(shape==3){
                obj2.triangle();
            }
            else{
                System.out.println("Wrong shape");
            }
        }
        else{
            System.out.println("invalid operation");
            }

    }
}

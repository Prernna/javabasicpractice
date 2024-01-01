package practice;
//Uncomment the particular code you want to run. (all questions are commented when done.)

//1.
class Employee{
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getname(){
        return name;
    }
    public void setname(String n){
        name = n;
    }

}
//2.
class cellphone{

public void ringing(){
    System.out.println("Ringing...");
}
public void Vibrating(){
    System.out.println("Vibrating...");
}
public void call(){
    System.out.println("Calling Prerna...");
}
}
//3.
class square{
    int side;

    public int area(){
    return side*side;
    }
    public int perimeter(){
        
        return 4*side;

    }
}
//4.
class Rectangle{
    int l;
    int b;
    public int area(){
        return l*b;
    }
    public int perimeter(){
        return 2*(l+b);
    }
}
//5.
class TommyVecetti{
    public void run(){
        System.out.println("Running to win from the competitors");
    }
    public void hit(){
        System.out.println("Hit the treasure button");
    }
    public void fire(){
        System.out.println("Fire the enemy ");
    }
}
//6.
class circle{
    float r;
    public float area(){
        return r*r*(22/7);
    }
    public float perimeter(){
        return 2*22/7*r;
    }
}
public class basicOOPs {
    public static void main(String[] args) {
 //Basic Practice questions on OOPs
 /*1. Create a class Employee with following properties and methods   
  salary(property)(int)
  getsalary(method returning int)
  name(property)(string)
  getname(method returning string)
  setname(method changing name)
 */
Employee prerna = new Employee();
Employee Divya = new Employee();
Divya.salary=12;
// Divya.name="Sudhanshu rana";
Divya.setname("Kartik Singh");
System.out.println("Salary of 2nd emlpoyee is "+ Divya.getsalary()+"k");
System.out.println(Divya.getname());

System.out.println("\n");

prerna.name="Prerna";
prerna.salary=15;
prerna.setname(" Prerna");
System.out.println("Salary of "+ prerna.getname()+" is");
System.out.println(prerna.getsalary()+"k");
System.out.println("\n");

//2.Create a class cellphone with members to print "ringing...","Vibrating...",etc.
cellphone Mi=new cellphone(); //we have to declare it in the main method after creating a class before main method.
Mi.ringing();
Mi.Vibrating();
Mi.call();
//sout (no need to print becuase we just have to call the function)
System.out.println("\n");

//3.Create a class square with a method to initialize its side, calculating area , perimeter, etc.
square sq=new square();
sq.side=5;
System.out.println("Area of square is "+sq.area());
System.out.println("Perimeter of square is "+ sq.perimeter());
System.out.println("\n");

//4.Create a class rectangle and print its area and perimeter
Rectangle one=new Rectangle();
one.l=2;
one.b=4;
System.out.println("Area of rectangle is "+ one.area());
System.out.println("Perimeter of rectangle is "+ one.perimeter());
System.out.println("\n");

//5. Create a class TommyVecetti for Rockstar Games capable of hitting(print hitting...), running,firirng,etc
TommyVecetti player=new TommyVecetti();
player.run();
player.hit();
player.fire();
System.out.println("\n");

//6.Create a class circle and print their areas and perimeter
circle R = new circle();
R.r=4;
System.out.println("Area of circle is "+R.area());
System.out.println("Perimeter of circle is "+ R.perimeter());
    }
}

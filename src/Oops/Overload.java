package Oops;

//Polymorphism is the capability of a method to do different things based on the object that it is acting upon. 
//1)Method Overloading:
//In Java, it is possible to define two or more methods of same name in a class, provided that there argument list or parameters are different. 
//This concept is known as Method Overloading.
//compile time polymorphism
class Overload
{
    void demo (int a)
    {
       System.out.println ("a: " + a);
    }
    void demo (int a, int b)
    {
       System.out.println ("a and b: " + a + "," + b);
    }
    double demo(double a) {
       System.out.println("double a: " + a);
       return a*a;
    }
}
class MethodOverloading
{
    public static void main (String args [])
    {
        Overload Obj = new Overload();
        double result;
        Obj .demo(10);
        Obj .demo(10, 20);
        result = Obj .demo(5.5);
        System.out.println("O/P : " + result);
    }
}

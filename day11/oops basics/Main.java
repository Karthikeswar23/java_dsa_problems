/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// class First{
//     int a,b;
//     First(int x,int y){
//         System.out.println("First class constructor");
//         a=x;
//         b=y;
//     }
//     void sum(){
//         System.out.println(a+b);
//     }
// }
// class Second extends First{
//     Second(){
//         super(10,20);
//         System.out.println("Second class constructor");
//     }
// }
// public class Main
// {
// 	public static void main(String[] args) {
// 	    Second ob = new Second();
// 	    ob.sum();
// 	}
// }

// class First{
//     int a,b;
//     First(int x,int y){
//         System.out.println("First class constructor");
//         a=x;
//         b=y;
//     }
//     void sum(){
//         System.out.println(a+b);
//     }
// }
// class Second extends First{
//     Second(){
//         super(10,20);
//         System.out.println("Second class constructor");
//     }
// }
// public class Main
// {
// 	public static void main(String[] args) {
// 	    Second ob = new Second();
// 	    ob.sum();
// 	}
// }
class Student{
  private String name;
  public void setName(String n){
    name =n;
  }
  public String getname(){
    return name;
  }
}
class Me extends Student{
    void display(){
        System.out.println(name);
    }
}
public class Main{
    public static void main(String[] args){
        Student s = new Student();
        s.setName("Karthik");
        System.out.println(s.getname());
    }
}
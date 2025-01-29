class Printable{
void print()
{System.out.println("Hello");}
}
interface Showable{
void show();
}
 class C extends Printable implements Showable

{
public void print(){System.out.println("Hello");
}
public void show()
{System.out.println("Welcome");}
public static void main(String args[])
{
C obj = new C();
obj.print();
obj.show();
}}

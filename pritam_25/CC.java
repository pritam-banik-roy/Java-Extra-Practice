abstract class Printable{
abstract void print();
}
interface Showable{
void show();
}
 class CC extends Printable implements Showable

{
public void print(){System.out.println("Hello");
}
public void show()
{System.out.println("Welcome");}
public static void main(String args[])
{
CC obj = new CC();
obj.print();
obj.show();
}}

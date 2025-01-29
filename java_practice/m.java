class Test1
{
void m1()
{
 System.out.println("m1 method called");
}
static void m2()
{
 
 System.out.println("m2 method called");
}

public static void main(String[] args)
{
 Test1 t = new Test();
 t.m1();
 Test1.m2();
}
}
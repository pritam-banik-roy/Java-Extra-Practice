class tests
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
 tests t = new tests();
 t.m1();
 tests.m2();
}
}
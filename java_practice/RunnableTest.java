class X implements Runnable
{
public void run()
{
for (int i = 1; i<=10; i++)
{
System.out.println("\t From Thread  X: i= "+i);
}

System.out.println("Exit from Thread  X");

}
}
class Y implements Runnable
{
public void run()
{
for (int j = 1; j<=5; j++)
{
System.out.println("\t From Thread  Y: j= "+j);
}

System.out.println("Exit from Thread  Y");

}
}
class Z extends Thread
{
public void run()
{
for (int k = 1; k<=5; k++)
{
System.out.println("\t From Thread  Z: k= "+k);
}

System.out.println("Exit from Thread  Z");

}
}
class RunnableTest
{
public static void main(String args[])
{
X runnable1 = new X();
Y runnable2 = new Y();
Z runnable3 = new Z();

Thread threadX = new Thread(runnable1);
Thread threadY = new Thread(runnable2);
Thread threadZ = new Thread(runnable3);

threadX.start();
threadY.start();
threadZ.start();

System.out.println("End of main Thread");
}
}

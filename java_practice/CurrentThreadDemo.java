class CurrentThreadDemo
{
 public static void main(String args[])
{
Thread t = Thread.currentThread();
System.out.println("Current Thread details:" +t);
System.out.println("Current Thread Name:" +t.getName());

t.setName("My Thread");
System.out.println("After name change, Current Thread details:" +t);

System.out.println("After name change, Current Thread Name:" +t.getName());
try
{
for(int n = 5;n>0;n--)
{
System.out.println(n);
Thread.sleep(5000);
}
}
catch(InterruptedException e)
{
System.out.println("Main Thread Interrupted");
}
}
}
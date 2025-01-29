class Bird{
void eat(){System.out.println("eating...");}
}
class Pigeon extends Bird{
void eat(){System.out.println("eating rice...");}
void call(){System.out.println("calling...");}
void work(){
super.eat();
call();
eat();}
}
class TestSuper2{
public static void main(String args[]){
Pigeon p = new Pigeon();
p.work();
}
}
class Animal {
public void displayInfo(){
System.out.println("I am an Animal");
}
}
class Lion extends Animal{
public void displayInfo(){
System.out.println("I am a lion");
}
}
class Main{
public static void main(String[] args){
Lion l1 = new Lion();
l1.displayInfo();
}
}
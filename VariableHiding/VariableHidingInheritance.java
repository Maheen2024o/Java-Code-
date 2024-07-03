package VariableHiding;

class Parent{
    int x=10;
    int y=20;
}
class Child extends Parent{
    int x=100;
    int y=200;
}
public class VariableHidingInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        System.out.println(child.x);
        System.out.println(child.y);
    }
}
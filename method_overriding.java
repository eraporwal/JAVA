 class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void method2(){
        System.out.println("i am method 2 of class A");
    }
 }
 class B extends A{
    public void method2(){
        System.out.println("i am method 2 of class B");
    }

    public void method3(){
        System.out.println("i am method 3 of class B");
    }

 }
 
 public class method_overriding {
    public static void main(String[] args) {
        
   
    A a = new A();
    a.method2();

    B b= new B();
    b.method2();
}

}

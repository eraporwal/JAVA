class Animal{
    public void animalSound(){
        System.out.println("the sounds of animals!");
    }
}
class cat extends Animal{
    public void animalSound(){
        System.out.println("meoww,meoww");
    }
}
class dog extends Animal{
    public void animalSound(){
        System.out.println("bhoww,bhhoww");
    }
}

 

public class polymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal mycat = new cat();
        Animal mydog = new dog();
        myAnimal.animalSound();
        mydog.animalSound();
       mycat.animalSound();



        


    }
    
}

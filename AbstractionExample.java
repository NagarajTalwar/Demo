public class AbstractionExample {
    public static void main(String[] args) {
         Car c = new Car();
         Scooter sc = new Scooter();
         System.out.println(c.start()+" tires it has.");
         System.out.println(sc.start()+ "tires it has.");
        // Vehicle v = new Vehicle();
            
        


    }
}


abstract class Vehicle{
   
//     public static void main(String[] args) {
//         Car c = new Car();
//         Scooter sc = new Scooter();
//         System.out.println(c.start()+" tires it has.");
//         System.out.println(sc.start()+ "tires it has.");
//        // Vehicle v = new Vehicle();
//    }
    Vehicle(){
        System.out.println("Constructor");
    }

    public Vehicle(int a, int b){
        System.out.println(a+b);

    }

   abstract  int start();

   public void m1(){
       System.out.println("Simple method in abstract class");
   }

   
    
}

class Car extends Vehicle{
    Car(){
        super(5,10);
    }

    int start(){
        System.out.println("Car starts with key ");
        return 4;
    }
        
    
        
}

class Scooter extends Vehicle {
    int start(){
        System.out.println("Scooter starts with kick ");
        return 2;
    }
}

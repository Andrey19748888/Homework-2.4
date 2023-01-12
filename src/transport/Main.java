package transport;

import drivers.DDriver;
import drivers.Driver;


public class Main {
    public static void main(String[] args) {

        Car honda = new Car("Honda", "Accord", 3.5);
        System.out.println(honda.toString());
        Car lada = new Car("Lada","vesta",1.8);
        System.out.println(lada.toString());
        Car bmv = new Car("BMV","x5",3.3);
        System.out.println(bmv.toString());
        Car audi = new Car("Audi", "A8",4.0);
        System.out.println(audi.toString());
        System.out.println();
        System.out.println();

        Bus liaz = new Bus("Лиаз","Эг-17",3.0);
        System.out.println(liaz.toString());
        Bus ikarus = new Bus("Ikarus","281",5.0);
        System.out.println(ikarus.toString());
        Bus fav = new Bus("Fav","Q-21",7.0);
        System.out.println(fav.toString());
        Bus foton = new Bus("Foton", "Sky", 8.0);
        System.out.println(foton.toString());
        System.out.println();
        System.out.println();

        Truck tatra = new Truck("Tatra", "Elephant", 5.5);
        System.out.println(tatra.toString());
        Truck kamaz = new Truck("Kamaz","Mamont",5.5);
        System.out.println(kamaz.toString());
        Truck daf = new Truck("Daf","LF",6.0);
        System.out.println(daf.toString());
        Truck man= new Truck("Man","f2000",7.5);
        System.out.println(man.toString());
        System.out.println();

        Driver<Car> ivan = new Driver<>("Ivan", "B", 10, audi);
        ivan.drive();
        Driver<Bus> alex = new Driver<>("Alex", "C", 15, ikarus);
        alex.drive();
        Driver<Truck> denis = new Driver<>("Denis", "D", 10, daf);
        denis.drive();
        System.out.println();









    }
}
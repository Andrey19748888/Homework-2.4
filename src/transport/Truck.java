package transport;

public class Truck extends Transport implements Competing{

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Truck " + getBrand() + getModel() + " started moving");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Truck " + getBrand() + getModel() + " has stopped");
    }

    @Override
    public void pitStop() {
        System.out.println("Truck " + getBrand() + getModel() + " fulfilled pit-stop");
    }
    @Override
    public void bestTime() {
        System.out.println("Truck " + getBrand() + getModel() + " done bestTime");
    }
    @Override
    public void maxSpeed(){
        System.out.println("Truck " + getBrand() + getModel() + " done bestTime");}



    public String toString() {
        return  "бренд " + getBrand() + "\n"
                + "модель " + getModel() + "\n"
                + "объем двигателя " + getEngineVolume();
    }

}

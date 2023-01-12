package transport;



public class Car extends Transport implements Competing{

    public Car(String brand, String model, double engineVolume) {
        super(brand,model,engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Car " + getBrand() + getModel() + " started moving");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Car " + getBrand() + getModel() + " has stopped");
    }

    @Override
    public void pitStop() {
        System.out.println("Car " + getBrand() + getModel() + " fulfilled pit-stop");
    }
    @Override
    public void bestTime() {
        System.out.println("Car " + getBrand() + getModel() + " done bestTime");
    }
    @Override
    public void maxSpeed(){
        System.out.println("Car " + getBrand() + getModel() + " done bestTime");}



    public String toString() {
        return  "бренд " + getBrand() + "\n"
                + "модель " + getModel() + "\n"
                + "объем двигателя " + getEngineVolume();
    }
}


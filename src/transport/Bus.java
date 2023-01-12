package transport;

public class Bus extends Transport implements Competing{
    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Bus " + getBrand() + getModel() + " started moving");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Bus " + getBrand() + getModel() + " has stopped");
    }
    @Override
    public void pitStop() {
        System.out.println("Bus " + getBrand() + getModel() + " fulfilled pit-stop");
    }
    @Override
    public void bestTime() {
        System.out.println("Bus " + getBrand() + getModel() + " done bestTime");
    }
    @Override
    public void maxSpeed(){
        System.out.println("Bus " + getBrand() + getModel() + " done bestTime");}


    @Override
    public String toString() {
        return  "бренд " + getBrand() + "\n"
                + "модель " + getModel() + "\n"
                + "объем двигателя " + getEngineVolume();
    }
}

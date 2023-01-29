import java.awt.*;

public class Main {
    public static void main(String[] args) {

    }
}

enum TypeCar {SEDAN, PICKUP}

enum TypeFuel {GASOLINE, DIESEL, ELECTRICITY}

enum TypeGearBox {MT, AT}

abstract class Car {
    private String make;
    private String model;
    private Color color;

    private TypeCar bodyType;
    private int numberWheels;
    private TypeFuel fuelType;
    private TypeGearBox gearBoxType;
    private double engineCapacity;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String make) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public TypeCar getBodyType() {
        return bodyType;
    }

    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public TypeFuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(TypeFuel fuelType) {
        this.fuelType = fuelType;
    }

    public TypeGearBox getGearBoxType() {
        return gearBoxType;
    }

    public void setGearBoxType(TypeGearBox gearBoxType) {
        this.gearBoxType = gearBoxType;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}

interface iRefueling {
    void fuel();
}

interface iWipe {
    void wipeWindShield();

    void wipeHeadLight();

    void wipeMirrors();
}

class PickUp extends Car implements iRefueling, iWipe {
    @Override
    public void fuel() {
    }

    @Override
    public void wipeWindShield() {
    }

    @Override
    public void wipeHeadLight() {
    }

    @Override
    public void wipeMirrors() {
    }

    private int loadCapacity;

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}

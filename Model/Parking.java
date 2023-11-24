package Model;

import java.util.Arrays;

public class Parking {
    private String name;
    Car[] cars;

    public Parking(String name, int tamaño){
        this.name=name;
        if(tamaño<0){
            tamaño=2;
        }
        this.cars=new Car[tamaño];
    }

    public Parking(){
        this("Genérico",2);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parking{" +
                "name='" + name + '\'' +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }



    public boolean inFull(){
        return false;
    }


    public int howManyCars(){
        return 0;
    }

    public  int searchCar(String license){
        return 0;
    }

    public  int parkCar(Car car){
        return 0;
    }

    public  Car unparkCar(String license){
        return null;
    }
}

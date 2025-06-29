abstract class Logistics{
    String name;
    public String toString(){
        return "Тип транспортировки: "+this.name;
    }
}
abstract class LogisticsFactory{
    public abstract Logistics createLog();
}
class AirLog extends LogisticsFactory {
    public Logistics createLog() {
        return new Airplane();
    }
}
class ShipLog extends LogisticsFactory{
    public Logistics createLog(){
        return new Ship();
    }
}
class TruckLog extends LogisticsFactory{
    public Logistics createLog(){
        return new Truck();
    }
}
class Airplane extends Logistics{
    public Airplane(){
        name="Самолёт";
    }
}
class Ship extends Logistics{
    public Ship(){
        name="Корабль";
    }
}
class Truck extends Logistics{
    public Truck(){
        name="Грузовик";
    }
}
public class Main {
    public static void main(String[] args) {
        LogisticsFactory sea = new ShipLog();
        LogisticsFactory air = new AirLog();
        LogisticsFactory truck = new TruckLog();
        Logistics myplane = air.createLog();
        Logistics myship = sea.createLog();
        Logistics mytruck = truck.createLog();
        System.out.println(myplane.toString());
        System.out.println(myship.toString());
        System.out.println(mytruck.toString());
    }
}
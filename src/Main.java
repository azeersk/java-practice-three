class Vehicle{
    public static void car(String Cname, String Ccompany){
        System.out.println("Car Company name: "+ Ccompany);
        System.out.println("Car Name: "+ Cname );
    }
    public static void bike(String Bname, String Bcompany){
        System.out.println("Bike Company name: "+ Bcompany);
        System.out.println("Bike Name: "+ Bname);
    }
}


class VehicleOne extends Vehicle{
    public static void carOne(String Cname, String Ccompany){
        car(Cname,Ccompany);
    }
    public static void bikeOne(String Bname, String Bcompany){
        bike(Bname,Bcompany);
    }
}


public class Main {
    public static void main(String[] args){
        Vehicle obj = new Vehicle();
        VehicleOne objOne = new VehicleOne();
        String carCom = "Ferrari";
        String carName = "Ferrari34+";
        String bikeCom = "Benz";
        String bikeName = "Benz75*";
        String carOneCom = "TATA";
        String carOneName = "Tata Indigo";
        String bikeOneCom = "rr";
        String bikeOneName = "rr5*";

        System.out.println("*** Car ***");
        obj.car(carName,carCom);
        System.out.println("*** Bike ***");
        obj.bike(bikeName, bikeCom);

        System.out.println();
        System.out.println("*** Car One ***");
        objOne.carOne(carOneName, carOneCom);
        System.out.println("*** Bike One ***");
        objOne.bikeOne(bikeOneName, bikeOneCom);

    }
}


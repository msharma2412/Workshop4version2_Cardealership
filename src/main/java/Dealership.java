import com.ps.UserInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class Dealership {
    public String name = "General Dealers";
    public String address;
    public String phone = "834-908-1234";
    Dealership dealership = new Dealership("General Dealers");

    ArrayList<Vehicle> inventory = new ArrayList<>();

    public Dealership(String generalDealers) {

        address = "123 Palm Meadow Road, Miami Florida 10032";
    }

    public ArrayList<Vehicle> addVehicle(Vehicle vehicle, Object String) {

        inventory.add(vehicle);//create an instance of a specific vehicle to add to the array


        //things to do for project, look up writing from a file, case,do wile and while, making a menu
        // look at video greg did

        return null;

    }

    public ArrayList<Vehicle> RemoveVehicle(Vehicle vehicle, Object String) {

        inventory.remove(vehicle);

        return null;
    }

    //make a constructor to add properties on the top.  At some point I'd want to read fro the file
    //Create variable at the beginning of the class
    public ArrayList<Vehicle> getAllVehicle() {

        return this.inventory;
    }

    public ArrayList<Vehicle> getAllVehiclesByColor() {

        return null;
    }

    public ArrayList<Vehicle> getAllVehiclesByModelandMake() {

        return null;
    }


    public ArrayList<Vehicle> getAllVehiclesByPrice() {

        return null;
    }
// all, coloor,model,price,year
    //need ododometer,vin

    public ArrayList<Vehicle> getAllVehiclesByYear() {

        return null;
    }

    public ArrayList<Vehicle> getAllVehiclesByMileage() {

        return null;
    }

    public ArrayList<Vehicle> getAllVehiclesByVehicleType() {

        return null;
    }


}



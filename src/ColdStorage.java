import java.util.Scanner;

public class ColdStorage extends Storage implements IStorage{

    ColdStorage(String address, int countryCode, String name, int capacity){
        this.address = address;
        this.countryCode = countryCode;
        this.capacity = capacity;
        this.name = name;

    }
    boolean isCargoLoaded;

    @Override
    public void loadCargoInStorage() {
        System.out.println("Type the volume of cargo going to Cold Storage");
        Scanner scanner = new Scanner(System.in);
        int coldCargoVolume = scanner.nextInt();
        if(coldCargoVolume <= capacity){
            System.out.println("Load cargo into Cold Storage");
            isCargoLoaded = true;
        }else{
            System.out.println("Cargo volume extends Cold Storage capacity. Cannot load");
        }
    }

    @Override
    public void takeCargoOutOfStorage() {
        if(isCargoLoaded){
            System.out.println("Take cargo out of the Cold Storage");
        } else{
            System.out.println("Cold Storage is empty");
        }
    }

    @Override
    public void turnOnTemperatureMaintenance() {
            System.out.println("Turn on temperature maintenance in Cold storage");
        }

    @Override
    public void turnOffTemperatureMaintenance() {
        System.out.println("Turn off temperature maintenance in Cold storage");
    }

    @Override
    public void packCargo(Cargo cargo) {
        if(cargo.typeOfCargo.equals("Fragile")){
            System.out.println("Attention! Pack cold cargo carefully");
        }else{
            System.out.println("Pack cold cargo");
        }
    }
}

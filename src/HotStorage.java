import java.util.Scanner;

public class HotStorage extends Storage implements IStorage{

    HotStorage(String address, int countryCode, String name, int capacity){
        this.address = address;
        this.countryCode = countryCode;
        this.capacity = capacity;
        this.name = name;
    }
    boolean isCargoLoaded;

    @Override
    public void loadCargoInStorage() {
        System.out.println("Type the volume of cargo going to Hot Storage");
        Scanner scanner = new Scanner(System.in);
        int hotCargoVolume = scanner.nextInt();
        if(hotCargoVolume <= capacity){
            System.out.println("Load cargo into Hot Storage");
            isCargoLoaded = true;
        }else{
            System.out.println("Cargo volume extends Hot Storage capacity. Cannot load");
        }
    }

    @Override
    public void takeCargoOutOfStorage() {
        if(isCargoLoaded){
            System.out.println("Take cargo out of the Hot Storage");
        }else{
            System.out.println("Hot Storage is Empty");
        }
    }

    @Override
    public void turnOnTemperatureMaintenance() {
        System.out.println("Turn on temperature maintenance in Hot storage");
    }

    @Override
    public void turnOffTemperatureMaintenance() {
        System.out.println("Turn off temperature maintenance in Hot storage");
    }

    @Override
    public void packCargo(Cargo cargo) {
       if(cargo.typeOfCargo.equals("Fragile")){
           System.out.println("Attention! Pack hot cargo carefully");
       }else {
           System.out.println("Pack hot cargo");
       }
    }
}


public class Demo {
    public static void main(String[] args) {
        ColdStorage coldStorage = new ColdStorage("Vilnius", Constants.LITHUANIA_COUNTRY_CODE, "Cold Storage #1", 220);
        HotStorage hotStorage = new HotStorage("Wroclaw", Constants.POLAND_COUNTRY_CODE, "Hot Storage #1", 80);

        HotCargo hotCargo = new HotCargo("Fragile", 350, "Denmark");
        ColdCargo coldCargo = new ColdCargo("Not fragile", 210, "France");

        System.out.println("Cold Storage Information: " + "\n" + "Address: " + coldStorage.address + "\n" + "Country Code: " +
                 coldStorage.countryCode + "\n" + "Storage name: " + coldStorage.name + "\n" + "Capacity: " + coldStorage.capacity);


        coldStorage.loadCargoInStorage();
        if(coldStorage.isCargoLoaded){
            coldStorage.turnOnTemperatureMaintenance();
        }
        coldStorage.takeCargoOutOfStorage();
        if(coldStorage.isCargoLoaded){
            coldStorage.turnOffTemperatureMaintenance();
            coldStorage.packCargo(coldCargo);
        }

        System.out.println("-------------------");


        System.out.println("Hot Storage Information: " + "\n" + "Address: " + hotStorage.address + "\n" + "Country Code: " +
                hotStorage.countryCode + "\n" + "Storage name: " + hotStorage.name + "\n" + "Capacity: " + hotStorage.capacity);

        hotStorage.loadCargoInStorage();
        if(hotStorage.isCargoLoaded){
            hotStorage.turnOnTemperatureMaintenance();
            hotStorage.packCargo(hotCargo);
        }
        hotStorage.takeCargoOutOfStorage();
        if(hotStorage.isCargoLoaded){
            hotStorage.turnOffTemperatureMaintenance();
        }
    }
}

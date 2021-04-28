public interface IStorage {
    void loadCargoInStorage();
    void takeCargoOutOfStorage();
    void turnOnTemperatureMaintenance();
    void turnOffTemperatureMaintenance();
    void packCargo(Cargo cargo);
}

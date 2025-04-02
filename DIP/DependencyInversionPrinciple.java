package solid.DIP;

public class DependencyInversionPrinciple {

    public static void main(String[] args) {
        Storage sharedPreferences = new SharedPreferencesStorage();
        Storage firebase = new FirebaseStorage();

        DataManager dataManager1 = new DataManager(sharedPreferences);
        dataManager1.saveData("User Settings");

        DataManager dataManager2 = new DataManager(firebase);
        dataManager2.saveData("User Profile");
    }
}
// 1️⃣ Common Interface (Abstraction)
interface Storage {
    void save(String data);
}


class SharedPreferencesStorage implements Storage {
    @Override
    public void save(String data) {
        System.out.println("Saving to SharedPreferences: " + data);
    }
}


class FirebaseStorage implements Storage {
    @Override
    public void save(String data) {
        System.out.println("Saving to Firebase: " + data);
    }
}


class DataManager {
    private final Storage storage;

    public DataManager(Storage storage) { // Dependency Injection
        this.storage = storage;
    }

    public void saveData(String data) {
        storage.save(data);
    }
}



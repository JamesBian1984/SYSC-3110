import java.util.ArrayList;

public class AddressBook {
    ArrayList<BuddyInfo> addresses = new ArrayList<BuddyInfo>();

    private boolean addBuddy(String name, int phone, String addr) {
        BuddyInfo buddy = new BuddyInfo(name, phone, addr);
        System.out.println("added " + name);
        return addresses.add(buddy);
    }
    private BuddyInfo removeBuddy(String name, int phone) {
        BuddyInfo goneBud = null;
        for (int i = 0; i < addresses.size(); i++) {
            if (addresses.get(i).getName().equals(name)) {
                if (addresses.get(i).getNumber() == phone) {
                    goneBud = addresses.remove(i);
                    System.out.println("removed " + name);
                    return goneBud;
                }
            }
        }
        return goneBud;

    }

    public static void main(String[] args) {

        AddressBook addressBook = new AddressBook();
        boolean john_Added = addressBook.addBuddy("John", 123, "Canada");
        boolean joe_Added = addressBook.addBuddy("Joe", 1234, "Kanata");
        BuddyInfo gone = addressBook.removeBuddy("Joe",1234);
        BuddyInfo gone2 = addressBook.removeBuddy("John",123);
        System.out.println("x");
    }

}

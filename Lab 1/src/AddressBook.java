public class AddressBook {

    private void addBuddy(BuddyInfo bud) {
        return;
    }
    private void removeBuddy(BuddyInfo bud) {
        return;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("John", 123, "Canada");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}

public class BuddyInfo {

    private String name;
    private int phone_number;
    private String address;


    public BuddyInfo(String name, int phone_number, String address) {
        this.name = name;
        this.phone_number = phone_number;
        this.address = address;
    }

    public BuddyInfo() {
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return phone_number;
    }
    public static void main(String[] args) {
        BuddyInfo buddy1 = new BuddyInfo("Homer", 1800, "addr");
        System.out.println("Hello, " + buddy1.name);


    }

}




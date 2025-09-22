public class Main {
    public static void main(String[] args) {
        Poker poker = new Poker();
        Hand hand1 = new Hand("5D 3D 4C 6C 2H");
        Hand hand2 = new Hand("5C 5D 5S QD 2D");

        poker.addHand(hand1);
        poker.addHand(hand2);
        System.out.println(poker.bestHand().kind());
    }
}

public class Board extends BoardOfSpots implements BoardPrinter{

    @Override
    public void display() {
        String out =
                String.join(" | ", this.firstRow()) + "\n"
                + String.join (" | ", this.secondRow()) + "\n"
                + String.join (" | ", this.thirdRow());
        System.out.println(out);
    }

    public static void main(String[] args) {
        Board b = new Board();
        b.display();
    }
}

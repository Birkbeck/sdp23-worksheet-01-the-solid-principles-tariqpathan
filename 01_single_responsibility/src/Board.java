public class Board extends BoardOfSpots implements BoardPrinter{

    @Override
    public void display() {
        String out =
                String.join(" | ", this.firstRow()) + "\n"
                + String.join (" | ", this.secondRow()) + "\n"
                + String.join (" | ", this.thirdRow());
        System.out.println(out);
    }
}

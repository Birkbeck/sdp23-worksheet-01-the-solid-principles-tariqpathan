public class BoardDisplay{
    String columnDelimiter = " | ";
    String rowDelimiter = "\n";

    public String display(Board board) {
        String firstString = String.join(columnDelimiter, board.firstRow());
        String secondString = String.join(columnDelimiter, board.secondRow());
        String thirdString = String.join(columnDelimiter, board.thirdRow());
        return firstString + rowDelimiter +
                secondString + rowDelimiter +
                thirdString;
    }

    public static void main(String[] args) {
        Board board = new Board();
        BoardDisplay bd = new BoardDisplay();
        System.out.println(bd.display(board));
    }
}

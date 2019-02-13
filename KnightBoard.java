public class KnightBoard{
  public int[][] board;
  private int row;
  private int col;

  public KnightBoard(int startingRows, int startingCols){
    board = new int[startingRows][startingCols];
    this.row = startingRows;
    this.col = startingCols;
  }

  public String toString(){
    if(row*col >= 10 && board[row][col] < 10){
      return "_" + board[row][col];
    }
    return "" + board[row][col];
  }

  public boolean solve(int startingRow, int startingCols){
    return true;
  }

  public int countSolutions(int startingRow, int startingCols){
    return 0;
  }

  private boolean solveH(int row, int col, int level){
    return true;
  }

}

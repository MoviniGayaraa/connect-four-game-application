package lk.ijse.dep.service;

public interface Board {
    public int NUM_OF_ROWS =5;
    public int NUM_OF_COLS =6;

    public BoardUI getBoardUI();
    public int FindNextAvailableSpot(int col);
    public boolean isLegalMove(int col);
    public boolean  existLegalMove();
    public void updateMove(int col,piece move);
    public Winner FindWinner();


}

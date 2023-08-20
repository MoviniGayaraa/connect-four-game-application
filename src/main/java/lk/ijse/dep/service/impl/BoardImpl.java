package lk.ijse.dep.service.impl;

import lk.ijse.dep.service.Board;
import lk.ijse.dep.service.BoardUI;
import lk.ijse.dep.service.Winner;

import java.util.ArrayList;

public class BoardImpl implements Board{
    private Piece[][] pieces;


    @Override
    public BoardUI getBoardUI() {
        return null;
    }

    @Override
    public int FindNextAvailableSpot(int col) {
        return 0;
    }

    @Override
    public boolean isLegalMove(int col) {
        return false;
    }

    @Override
    public boolean existLegalMove() {
        return false;
    }

    @Override
    public void updateMove(int col, piece move) {

    }

    @Override
    public Winner FindWinner() {
        return null;
    }
}

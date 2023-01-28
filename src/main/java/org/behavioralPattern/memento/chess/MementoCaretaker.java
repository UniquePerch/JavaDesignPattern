package org.behavioralPattern.memento.chess;

import java.util.ArrayList;

public class MementoCaretaker { // 实现多次悔棋
    private ArrayList<ChessmanMemento> chessmanMementoArrayList = new ArrayList<>();

    public ChessmanMemento getMemento(int i) {
        return chessmanMementoArrayList.get(i);
    }

    public void setMemento(ChessmanMemento memento) {
        this.chessmanMementoArrayList.add(memento);
    }
}

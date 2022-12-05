package org.example.Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Board {
    public Stack<Character>[] gameboard;

    public Board(int size){
        gameboard = new Stack[size];
        for (int i = 0; i < gameboard.length; i++) {
            gameboard[i] = new Stack<>();
        }
    }
}

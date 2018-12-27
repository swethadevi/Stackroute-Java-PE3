//package com.stackroute.unittest.pe3;
//
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class ChessBoardTest {
//    ChessBoard board = new ChessBoard();
//
//    @Test
//    public void chessBoardTrue () {
//        String[][] arr = new String[][] {
//                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
//                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
//                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
//                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
//                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
//                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"},
//                {"WW|","BB|","WW|","BB|","WW|","BB|","WW|","BB|"},
//                {"BB|","WW|","BB|","WW|","BB|","WW|","BB|","WW|"}
//
//        };
//        assertEquals(arr,board.chessPattern());
//    }
//    @Test
//    public void chessBoardNotNull () {
//        assertNotNull(board.chessPattern());
//    }
//
//}
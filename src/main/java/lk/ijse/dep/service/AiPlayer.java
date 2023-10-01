package lk.ijse.dep.service;

import static java.lang.Integer.max;
import static java.lang.Integer.min;

public class AiPlayer extends Player{
    public AiPlayer(Board board){
        super(board);
    }

    @Override
    public void movePiece(int col) {
       /* boolean flag = false;
        do {
            col = (int)(Math.random()*(6-0)+0);
        }while (!board.isLegalMove(col));

        board.updateMove(col,Piece.GREEN);
        board.getBoardUI().update(col,flag);

        Winner winner =board.findWinner();

        if (board.findWinner().getWinningPiece() == Piece.GREEN) {
            board.getBoardUI().notifyWinner(winner);
        } else{
            if (!board.exitsLegalMove()){
                board.getBoardUI().notifyWinner(new Winner(Piece.EMPTY));
            }
        }*/
    /*boolean flag = true;
    Min_max(2,flag);

    board.updateMove(col,Piece.GREEN);
    board.getBoardUI().update(col,false);

    Winner winner = board.findWinner();

        if (board.findWinner().getWinningPiece() == Piece.GREEN) {
            board.getBoardUI().notifyWinner(winner);
        } else{
            if (!board.exitsLegalMove()){
                board.getBoardUI().notifyWinner(new Winner(Piece.EMPTY));
            }
        }


    }
    int Min_max(int depth, boolean maxPlayer){
        Piece[][] piece = board.getPiece();

        if (depth == 0 || !board.exitsLegalMove()){
            board.updateMove(0,Piece.GREEN);
            board.getBoardUI().update(0,false);

            Winner winner =board.findWinner();

            if (board.findWinner().getWinningPiece() == Piece.GREEN){
                board.getBoardUI().notifyWinner(winner);
            } else if (!board.exitsLegalMove()) {
                board.getBoardUI().notifyWinner(new Winner(Piece.EMPTY));
            }
        }
        if (maxPlayer){
                int max = -100000;
                int hu;

            for (int i = 0; i < piece.length; i++) {
                if (piece[i][board.findNextAvailableSpot(i)] == Piece.EMPTY){
                    hu = Min_max(depth - 1, false);
                    max = max(max,hu);
                }
            }
            return max;
        }
        else{
                int min = +100000;
                int hu;

            for (int i = 0; i < piece.length; i++) {
                if (piece[i][board.findNextAvailableSpot(i)] == Piece.EMPTY) {
                    hu = Min_max(depth - 1, true);
                    min = min(min, hu);
                }
            }
            return min;
        }*/

    }

}

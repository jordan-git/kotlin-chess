package com.jordan.chess

class Board {
    lateinit var board: Array<Array<Tile>>

    init {
        resetBoard()
    }

    fun resetBoard() {
        board = Array(8) {
            Array(8) {
                Tile(null)
            }
        }

        for (i in 0..7) {
            board[1][i] = Tile(Pawn(Color.BLACK))
            board[6][i] = Tile(Pawn(Color.WHITE))
        }

        board[0][0] = Tile(Rook(Color.BLACK))
        board[0][1] = Tile(Knight(Color.BLACK))
        board[0][2] = Tile(Bishop(Color.BLACK))
        board[0][3] = Tile(Queen(Color.BLACK))
        board[0][4] = Tile(King(Color.BLACK))
        board[0][5] = Tile(Bishop(Color.BLACK))
        board[0][6] = Tile(Knight(Color.BLACK))
        board[0][7] = Tile(Rook(Color.BLACK))

        board[7][0] = Tile(Rook(Color.WHITE))
        board[7][1] = Tile(Knight(Color.WHITE))
        board[7][2] = Tile(Bishop(Color.WHITE))
        board[7][3] = Tile(Queen(Color.WHITE))
        board[7][4] = Tile(King(Color.WHITE))
        board[7][5] = Tile(Bishop(Color.WHITE))
        board[7][6] = Tile(Knight(Color.WHITE))
        board[7][7] = Tile(Rook(Color.WHITE))
    }


}

fun main() {
    val b = Board()
}
package com.jordan.chess

class Queen(override var color: Color, override var status: Status = Status.ALIVE, override val type: Type = Type.QUEEN): Piece(color, status) {
    override fun canMove(board: Board, start: Tile, end: Tile): Boolean {
        return true
    }
}
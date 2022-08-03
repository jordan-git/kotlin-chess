package com.jordan.chess

class Bishop(override var color: Color, override var status: Status = Status.ALIVE, override val type: Type = Type.BISHOP): Piece(color, status) {
    override fun canMove(board: Board, start: Tile, end: Tile): Boolean {
        return true
    }
}
package com.jordan.chess

class Knight(override var color: Color, override var status: Status = Status.ALIVE, override val type: Type = Type.KNIGHT): Piece(color, status) {
    override fun canMove(board: Board, start: Tile, end: Tile): Boolean {
        return true
    }
}
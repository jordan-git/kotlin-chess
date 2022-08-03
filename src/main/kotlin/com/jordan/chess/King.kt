package com.jordan.chess

class King(override var color: Color, override var status: Status = Status.ALIVE, override val type: Type = Type.KING): Piece(color, status) {
    override fun canMove(board: Board, start: Tile, end: Tile): Boolean {
        return true
    }
}
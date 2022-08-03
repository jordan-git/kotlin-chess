package com.jordan.chess

enum class Color {
    WHITE,
    BLACK
}

enum class Status {
    DEAD,
    ALIVE
}

enum class Type {
    KING,
    QUEEN,
    BISHOP,
    KNIGHT,
    ROOK,
    PAWN
}

abstract class Piece(open val color: Color, open val status: Status = Status.ALIVE) {
    abstract val type: Type
    abstract fun canMove(board: Board, start: Tile, end: Tile): Boolean
}

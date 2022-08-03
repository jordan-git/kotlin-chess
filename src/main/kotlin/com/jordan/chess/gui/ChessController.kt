package com.jordan.chess.gui;

import com.jordan.chess.Board
import javafx.fxml.FXML;
import javafx.scene.Node
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.GridPane
import javafx.scene.layout.Pane
import javafx.scene.paint.Color
import javafx.scene.paint.ImagePattern
import javafx.scene.shape.Rectangle;
import java.io.FileInputStream
import java.util.*
import kotlin.collections.HashMap

fun capitalize(s: String): String =
    s.lowercase().replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString().lowercase() }

class ChessController {
    @FXML
    lateinit var grid: GridPane
    val chessBoard = Board()

    private var gridArray: Array<Array<Rectangle>> = Array(8) {
        Array(8) {
            Rectangle()
        }
    }
    private var piecePatterns = HashMap<String, ImagePattern>()

    @FXML
    fun initialize() {
        // Create pattern hashmap
        val pieceNames = arrayOf("WhiteKing", "WhiteQueen", "WhiteBishop", "WhiteKnight", "WhiteRook", "WhitePawn",
            "BlackKing", "BlackQueen", "BlackBishop", "BlackKnight", "BlackRook", "BlackPawn")
        for (p in pieceNames) {
            piecePatterns[p] = ImagePattern(Image(ChessController::class.java.getResource("$p.png")?.openStream()))
        }

        // Create grid array for convenient access
        for (n in grid.children) {
            gridArray[GridPane.getRowIndex(n)][GridPane.getColumnIndex(n)] = n as Rectangle
        }

//        gridArray[0][0].fill = piecePatterns["BlackRook"]
//        gridArray[0][2].fill = piecePatterns["BlackKing"]

        // Set up piece patterns according to chessboard
        for (i in 0 until chessBoard.board.size) {
            for (j in 0 until chessBoard.board[i].size) {
                if (chessBoard.board[i][j].piece != null) {
                    val type = capitalize(chessBoard.board[i][j].piece?.type.toString())
                    val color = capitalize(chessBoard.board[i][j].piece?.color.toString())

                    gridArray[i][j].fill = piecePatterns["$color$type"]
                }
            }
        }
    }


}

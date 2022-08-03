package com.jordan.chess.gui

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class ChessApplication : Application() {
    override fun start(stage: Stage) {
//        val fxmlLoader = FXMLLoader(HelloApplication::class.java.getResource("hello-view.fxml"))
//        val scene = Scene(fxmlLoader.load(), 320.0, 240.0)
//        stage.title = "Hello!"
//        stage.scene = scene
//        stage.show()

//        val gridPane = GridPane()
//        var count = 0
//
//        for (i in 0..7) {
//            for (j in 0..7) {
//                val rectangle = Rectangle(100.0, 100.0, 100.0, 100.0)
//                rectangle.fill = if (count % 2 == 0) Color.WHITE else Color.BLACK
//                gridPane.add(rectangle, j, i)
//                count += 1
//            }
//            count += 1
//        }
//
//        val scene = Scene(gridPane)

        val fxmlLoader = FXMLLoader(ChessApplication::class.java.getResource("chess-board.fxml"))
        val scene = Scene(fxmlLoader.load())

        stage.title = "Chess"
        stage.scene = scene
        stage.minWidth = 400.0
        stage.minHeight = 400.0
        stage.isResizable = false

        stage.show()
    }
}

fun main() {
    Application.launch(ChessApplication::class.java)
}
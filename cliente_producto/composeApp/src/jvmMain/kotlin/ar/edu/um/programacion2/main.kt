package ar.edu.um.programacion2

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "cliente_producto",
    ) {
        App()
    }
}
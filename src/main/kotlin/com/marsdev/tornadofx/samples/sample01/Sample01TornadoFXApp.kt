package com.marsdev.tornadofx.samples.sample01

import javafx.scene.control.Alert
import javafx.scene.control.ButtonType
import tornadofx.*

/**
 * Sample 01 - Simple TornadoFX Example Application
 */
class Sample01TornadoFXApp : App(Sample01View::class)

class Sample01View : View("Sample 01 TornadoFX") {
    val api: Rest by inject()

    init {

        api.baseURI = "https://services.yesenergy.com/PS/rest"
        api.setBasicAuth("", "")
    }
    override val root = borderpane {
        prefWidth = 400.0
        prefHeight = 200.0
        center {
            button("Click Me") {
                setOnAction {
                    alert(Alert.AlertType.INFORMATION, "Sample 01 TornadoFX", "Button Clicked", ButtonType.OK)
                }
            }
        }
    }
}

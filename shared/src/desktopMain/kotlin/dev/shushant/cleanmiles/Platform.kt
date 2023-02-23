package dev.shushant.cleanmiles

import java.awt.Desktop

class DesktopPlatform : Platform {
    override val name: String = "Desktop ${Desktop.getDesktop()}"
}

actual fun getPlatform(): Platform = DesktopPlatform()
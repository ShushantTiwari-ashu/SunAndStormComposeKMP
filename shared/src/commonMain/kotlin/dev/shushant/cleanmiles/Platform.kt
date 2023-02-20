package dev.shushant.cleanmiles

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform
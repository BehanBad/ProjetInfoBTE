package com.example.androidstudio2dgamedevelopment.`object`

import android.R
import android.content.Context
import androidx.core.content.ContextCompat
import com.example.androidstudio2dgamedevelopment.GameLoop
import com.example.androidstudio2dgamedevelopment.Joystick

/**
 * Player is the main character of the game, which the user can control with a touch joystick.
 * The player class is an extension of a Circle, which is an extension of a GameObject
 */
class Player(
    context: Context?,
    private val joystick: Joystick,
    positionX: Double,
    positionY: Double,
    radius: Double
) :
    Circle(
        context,
        ContextCompat.getColor(context!!, R.color.player),
        positionX,
        positionY,
        radius
    ) {
    fun update() {
        // Update velocity based on actuator of joystick
        velocityX = joystick.actuatorX * MAX_SPEED
        velocityY = joystick.actuatorY * MAX_SPEED

        // Update position
        positionX += velocityX
        positionY += velocityY
    }

    companion object {
        const val SPEED_PIXELS_PER_SECOND = 400.0
        private val MAX_SPEED: Double = SPEED_PIXELS_PER_SECOND / GameLoop.MAX_UPS
    }
}
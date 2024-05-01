package com.example.androidstudio2dgamedevelopment.`object`

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint

/**
 *
 * Circle is an abstract class which implements a draw method from GameObject for drawing the object
 *
 * as a circle.
 *
 */
abstract class Circle(
    context: Context?,
    color: Int,
    positionX: Double,
    positionY: Double,
    protected var radius: Double
) :
    GameObject(positionX, positionY) {
    protected var paint: Paint

    init {


        // Set colors of circle
        paint = Paint()
        paint.color = color
    }

    fun draw(canvas: Canvas) {
        canvas.drawCircle(positionX as Float, positionY as Float, radius.toFloat(), paint)
    }
}
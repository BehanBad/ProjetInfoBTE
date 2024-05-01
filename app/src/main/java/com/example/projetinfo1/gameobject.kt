package com.example.androidstudio2dgamedevelopment.`object`

import android.graphics.Canvas

/**
 * GameObject is an abstract class which is the foundation of all world objects in the game.
 */
abstract class GameObject {
    var positionX = 0.0
        protected set
    var positionY = 0.0
        protected set
    protected var velocityX = 0.0
    protected var velocityY = 0.0

    constructor()
    constructor(positionX: Double, positionY: Double) {
        this.positionX = positionX
        this.positionY = positionY
    }

    abstract fun draw(canvas: Canvas?)
    abstract fun update()

    companion object {
        fun getDistanceBetweenObjects(obj1: GameObject, obj2: GameObject): Double {
            return Math.sqrt(
                Math.pow(obj2.positionX - obj1.positionX, 2.0) +
                        Math.pow(obj2.positionY - obj1.positionY, 2.0)
            )
        }
    }
}
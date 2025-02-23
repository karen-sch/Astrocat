package com.mygdx.game

import android.os.Bundle
import com.badlogic.gdx.Screen

import com.badlogic.gdx.backends.android.AndroidApplication
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration
import com.mygdx.game.FlyPusefinnFlyGame

class AndroidLauncher : AndroidApplication() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val config = AndroidApplicationConfiguration()
        initialize(FlyPusefinnFlyGame<Screen>(), config)
    }
}

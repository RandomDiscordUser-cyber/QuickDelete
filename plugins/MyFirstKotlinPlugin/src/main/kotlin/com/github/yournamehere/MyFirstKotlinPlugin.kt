
package com.github.yournamehere

import android.content.Context
import com.aliucord.annotations.AliucordPlugin
import com.aliucord.entities.Plugin

@AliucordPlugin(
    requiresRestart = false,
)
@Suppress("unused")
class QuickDelete : Plugin() {
    override fun start(context: Context) {
        logger.info("QuickDelete loaded")
    }

    override fun stop(context: Context) {
        patcher.unpatchAll()
    }
}

package android.minhazur.com.funfacts

import android.graphics.Color
import java.util.*


class ColorWheel {

    val colors = arrayOf(
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    )

    fun getColor(): Int {
        val random = Random()
        var randomNumber = random.nextInt(colors.size)
        val colorString = colors[randomNumber]
        val color = Color.parseColor(colorString)
        return color
    }
}
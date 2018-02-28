package android.minhazur.com.funfacts

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val TAG: String = MainActivity::class.java.simpleName

    private var factTextView: TextView? = null
    private var showFactButton: Button? = null
    private var relativeLayout: RelativeLayout? = null

    private val factBook = FactBook()
    private val colorWheel = ColorWheel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        factTextView = findViewById(R.id.factTextView)
        showFactButton = findViewById(R.id.showFactButton)
        relativeLayout = findViewById(R.id.relativeLayout)

        showFactButton!!.setOnClickListener {
            val fact = factBook.getFact()
            factTextView!!.text = fact

            val color = colorWheel.getColor()
            relativeLayout!!.setBackgroundColor(color)
            showFactButton!!.setTextColor(color)
        }

       Log.d(TAG, "Activity was created")
    }
}

package za.ac.iie.assessment1

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlinx.coroutines.selects.select

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val radioBo1 = findViewById<RadioButton>(R.id.radioBo1)
        val radioBo2 = findViewById<RadioButton>(R.id.radioBo2)
        val radioBo3 = findViewById<RadioButton>(R.id.radioBo3)
        val radioBo4 = findViewById<RadioButton>(R.id.radioBo4)
        val radioBo5 = findViewById<RadioButton>(R.id.radioBo5)
        val radioBo6 = findViewById<RadioButton>(R.id.radioBo6)
        val checkBox3 = findViewById<CheckBox>(R.id.checkBox3)
        val checkBox4 = findViewById<CheckBox>(R.id.checkBox4)
        val checkBox2 = findViewById<CheckBox>(R.id.checkBox2)
        val checkBox5 = findViewById<CheckBox>(R.id.checkBox5)
        val checkBox16 = findViewById<CheckBox>(R.id.checkBox16)
        val checkBox8 = findViewById<CheckBox>(R.id.checkBox8)
        val checkBox15 = findViewById<CheckBox>(R.id.checkBox15)
        val checkBox13 = findViewById<CheckBox>(R.id.checkBox13)
        val checkBox10 = findViewById<CheckBox>(R.id.checkBox10)
        val checkBox12 = findViewById<CheckBox>(R.id.checkBox12)
        val checkBox9 = findViewById<CheckBox>(R.id.checkBox9)
        val checkBox11 = findViewById<CheckBox>(R.id.checkBox11)
        val checkBox7 = findViewById<CheckBox>(R.id.checkBox7)
        val checkBox1 = findViewById<CheckBox>(R.id.checkBox1)
        val onClear = findViewById<Button>(R.id.button)
        val onOrder = findViewById<TextView>(R.id.textView)

        onClear.setOnClickListener {
            val onOrder = mutableListOf(toString())
            if (radioBo1.isChecked) {
                if (checkBox3.isChecked)
                    if (checkBox4.isChecked)
                        if (checkBox2.isChecked)
                            if (onOrder.isNotEmpty()) {


                            }
            }

        }

    }
}










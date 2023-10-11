package vn.edu.hust.soict.sv.rolldice

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

/**
 * @author NTVu - 20204625
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Set button event
        //Step 1: Get button by id
        val rollButton: Button = findViewById(R.id.button)

        //Step 2: Add event

        // Add Toast
//        rollButton.setOnClickListener {
//            val toast = Toast.makeText(this,"Dice Rolled!", Toast.LENGTH_SHORT)
//            toast.show()
//        }

        // Add event to display on textView
//        rollButton.setOnClickListener {
//            // Get textView by id
//            val resultTextView: TextView = findViewById(R.id.textView)
//            resultTextView.text = "6"
//
//        }

        // Add event to roll Dice
        rollButton.setOnClickListener {
            rollDice()
        }

    }

    /**
     * Hàm tạo xúc xắc 6 mặt và tung ngẫu nhiên
     * Sau đó set kết quả lên textView
     */
    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()

        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }

    // Ctrl + Alt + L: Format code
}
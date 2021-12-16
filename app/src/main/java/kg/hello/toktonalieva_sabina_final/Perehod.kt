package kg.hello.toktonalieva_sabina_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Perehod : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perehod)
        val textView = findViewById<Button>(R.id.button)

        textView.setOnClickListener{
            startActivity(Intent(this,Perehod::class.java))
        }

    }


}
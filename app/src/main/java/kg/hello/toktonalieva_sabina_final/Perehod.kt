package kg.hello.toktonalieva_sabina_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Perehod : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perehod)
        val textView = findViewById<ImageView>(R.id.imageView10)

        textView.setOnClickListener{
            startActivity(Intent(this,Perehod::class.java))
        }

    }


}
package yocupicio.martin.thecheezery_yocupiciomartin_228307

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)

        val button:Button = findViewById(R.id.sing_in_button) as Button

        button.setOnClickListener{
            var intent: Intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }
    }
}
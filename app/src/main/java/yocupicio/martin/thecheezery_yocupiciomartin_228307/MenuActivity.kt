package yocupicio.martin.thecheezery_yocupiciomartin_228307

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val btnCold: Button = findViewById(R.id.button_cold_drinks)
        val btnHot: Button = findViewById(R.id.button_hot_drinks)
        val btnSweet: Button = findViewById(R.id.button_sweets)
        val btnSaltie: Button = findViewById(R.id.button_salties)

        btnCold.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("categoria", "cold")
            startActivity(intent)
        }

        btnHot.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("categoria", "hot")
            startActivity(intent)
        }

        btnSweet.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("categoria", "sweet")
            startActivity(intent)
        }

        btnSaltie.setOnClickListener {
            val intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("categoria", "saltie")
            startActivity(intent)
        }
    }
}
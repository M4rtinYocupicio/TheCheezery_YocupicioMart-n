package yocupicio.martin.thecheezery_yocupiciomartin_228307

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ProductosActivity : AppCompatActivity() {
    var coldDrinks = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_productos)

        agregaProductos()
    }

    fun agregaProductos(){
        coldDrinks.add(Product(name = "Caramel Frap", image = R.drawable.caramel_frap, description = "Caramel syrup meets coffee, milk and ice and whipped cream and buttery caramel sauce layer the love on top.", price = 5.00))
        coldDrinks.add(Product(name = "Chocolate Frap", image = R.drawable.chocolate_frap, description = "Rich mocha-flavored sauce meets up with chocolaty chips, milk and ice for a blender bash.", price = 6.00))
        coldDrinks.add(Product(name = "Cold Brew", image = R.drawable.coldbrew, description = "Created by steeping medium-to-coarse ground coffee in room temperature water for 12 hours or longer.", price = 3.00))
        coldDrinks.add(Product(name = "Matcha Latte", image = R.drawable.matcha, description = "Leafy taste of matcha green tea powder with creamy milk and a little sugar for a flavor balance that will leave you feeling ready and raring to go.", price = 4.00))
        coldDrinks.add(Product(name = "Oreo Milkshake", image = R.drawable.oreomilkshake, description = "Chocolate ice cream, and oreo cookies. Topped with whipped cream with cocoa and chocolate syrup.", price = 3.00))

        coldDrinks.add(Product("Oreo Milkshake", R.drawable.oreomilkshake, "", 7.0))
        coldDrinks.add(Product("Peanut Milkshake", R.drawable.peanutmilkshake, "Vanilla ice cream, mixed with peanut butter and chocolate.", 7.0))
    }
}
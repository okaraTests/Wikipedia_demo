package ok.okara.wikipedia_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import ok.okara.wikipedia_demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Toast.makeText(this, "hello first commit", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "hello first commit", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "hello first commit", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "hello first commit", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "hello first commit", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "hello first commit", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "hello first commit", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "hello first commit", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "hello first commit", Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "hello first commit", Toast.LENGTH_SHORT).show()
    }
}
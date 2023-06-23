package ok.okara.wikipedia_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import ok.okara.wikipedia_demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.mainToolbar)

        val actionBarDrawerToggle = ActionBarDrawerToggle(
            this , binding.mainDrawerLayout, binding.mainToolbar,
            R.string.open_drawer, R.string.close_drawer
        )
        actionBarDrawerToggle.syncState()

        binding.mainDrawerLayout.addDrawerListener(actionBarDrawerToggle)
        binding.mainNaviView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_item_BWriter -> {
                    Toast.makeText(this, "be a Writer !", Toast.LENGTH_SHORT).show()
                    binding.mainDrawerLayout.closeDrawer(GravityCompat.START, true)
                }
                R.id.menu_item_photographer -> {

                }
                R.id.menu_item_videoMaker -> {

                }
                R.id.menu_item_open_wikipedia -> {

                }
                R.id.menu_item_open_wikimedia -> {

                }

            }
            true
        }


    }
}
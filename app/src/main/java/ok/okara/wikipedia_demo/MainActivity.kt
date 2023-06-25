package ok.okara.wikipedia_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.Fragment
import ok.okara.wikipedia_demo.databinding.ActivityMainBinding
import ok.okara.wikipedia_demo.fragments.FragmentExplore
import ok.okara.wikipedia_demo.fragments.FragmentProfile
import ok.okara.wikipedia_demo.fragments.FragmentTrends

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

        firstRun()

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

        binding.mainBottonNavi.setOnItemSelectedListener {

            when(it.itemId){
                R.id.menu_Explore -> {
                    replaceFragment(FragmentExplore())
                }

                R.id.menu_Trends -> {
                    replaceFragment(FragmentTrends())
                }

                R.id.menu_Profile -> {
                    replaceFragment(FragmentProfile())
                }
            }
            true
        }
        binding.mainBottonNavi.setOnItemReselectedListener {
            Toast.makeText(this, "this page has been Selected!", Toast.LENGTH_SHORT).show()
        }
    }
    private fun firstRun(){
        replaceFragment(FragmentExplore())
        binding.mainBottonNavi.selectedItemId = R.id.menu_Explore
    }
    private fun replaceFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frameMainContainer, fragment)
        transaction.commit()
    }
}
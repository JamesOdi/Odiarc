package odiarc.com.views.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import odiarc.com.R
import odiarc.com.databinding.ActivityMainBinding
import odiarc.com.views.fragments.CartFragment
import odiarc.com.views.fragments.FavoriteFragment
import odiarc.com.views.fragments.SettingsFragment
import odiarc.com.views.fragments.TrendingFragment

class MainActivity : AppCompatActivity() {
    private lateinit var view: ActivityMainBinding

    lateinit var cartFragment: CartFragment
    private lateinit var trendingFragment: TrendingFragment
    private lateinit var settingsFragment: SettingsFragment
    lateinit var favoriteFragment: FavoriteFragment
    lateinit var fragment: FragmentTransaction
    lateinit var currentFragment: Fragment

    companion object {
        const val FRAGMENT_TAG = "current_fragment"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        view = ActivityMainBinding.inflate(layoutInflater)
        setContentView(view.root)
        cartFragment = CartFragment()
        trendingFragment = TrendingFragment()
        settingsFragment = SettingsFragment()
        favoriteFragment = FavoriteFragment()

        view.chipNavBar.setItemSelected(R.id.trending,true)
        view.chipNavBar.setOnItemSelectedListener {
            when(it) {
                R.id.cart -> replaceFragment(cartFragment)
                R.id.favorites -> replaceFragment(favoriteFragment)
                R.id.settings -> replaceFragment(settingsFragment)
                else -> replaceFragment(trendingFragment)
            }
        }
        replaceFragment(trendingFragment)
    }

    private fun replaceFragment(selectedFragment: Fragment) {
        currentFragment = selectedFragment
        fragment = supportFragmentManager.beginTransaction()
        fragment.replace(R.id.fragmentContainer, selectedFragment, FRAGMENT_TAG)
        fragment.addToBackStack(null)
        fragment.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        fragment.commit()
    }

    override fun onBackPressed() {
        if (currentFragment != trendingFragment) {
            supportFragmentManager.popBackStack()
            //TODO: Add functionality to track back pressed with the navigation
        } else {
            super.onBackPressed()
        }
    }
}
package odiarc.com.views.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import odiarc.com.R
import odiarc.com.databinding.FragmentFavoriteBinding

class FavoriteFragment : Fragment() {
   lateinit var view : FragmentFavoriteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        view = FragmentFavoriteBinding.inflate(layoutInflater)

        return view.root
    }

}
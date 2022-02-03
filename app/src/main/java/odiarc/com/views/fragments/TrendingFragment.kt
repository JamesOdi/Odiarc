package odiarc.com.views.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import odiarc.com.R
import odiarc.com.databinding.FragmentTrendingBinding

class TrendingFragment : Fragment() {
    lateinit var view: FragmentTrendingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        view = FragmentTrendingBinding.inflate(layoutInflater)

        return view.root
    }
}
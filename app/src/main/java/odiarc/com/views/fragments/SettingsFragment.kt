package odiarc.com.views.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import odiarc.com.R
import odiarc.com.databinding.FragmentSettingsBinding

class SettingsFragment : Fragment() {
    lateinit var view: FragmentSettingsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        view = FragmentSettingsBinding.inflate(layoutInflater)

        return view.root
    }
}
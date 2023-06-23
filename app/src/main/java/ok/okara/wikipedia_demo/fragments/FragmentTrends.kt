package ok.okara.wikipedia_demo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ok.okara.wikipedia_demo.databinding.FragmentProfileBinding
import ok.okara.wikipedia_demo.databinding.FragmentTrendsBinding

class FragmentTrends: Fragment() {
    private lateinit var binding: FragmentTrendsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTrendsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}
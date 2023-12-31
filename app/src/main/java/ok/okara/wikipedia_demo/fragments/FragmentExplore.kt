package ok.okara.wikipedia_demo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import ok.okara.wikipedia_demo.adapters.ExploreAdapter
import ok.okara.wikipedia_demo.databinding.FragmentExploreBinding
import ok.okara.wikipedia_demo.setData4Explore

class FragmentExplore: Fragment() {
    private lateinit var binding: FragmentExploreBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExploreBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val myAdapter = ExploreAdapter(setData4Explore())
        binding.exploreRecyclerView.adapter = myAdapter
        binding.exploreRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }
}
package ok.okara.wikipedia_demo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import ok.okara.wikipedia_demo.adapters.ExploreAdapter
import ok.okara.wikipedia_demo.adapters.TrendsAdapter
import ok.okara.wikipedia_demo.databinding.FragmentTrendsBinding
import ok.okara.wikipedia_demo.setData4Trends

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

        val myAdapter = TrendsAdapter(setData4Trends())
        binding.trendsRecyclerView.adapter = myAdapter
        binding.trendsRecyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }
}
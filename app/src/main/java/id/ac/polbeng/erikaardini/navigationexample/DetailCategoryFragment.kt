package id.ac.polbeng.erikaardini.navigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.ac.polbeng.erikaardini.navigationexample.databinding.FragmentDetailCategoryBinding

class DetailCategoryFragment : Fragment() {

    private var _binding: FragmentDetailCategoryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDetailCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dataName = DetailCategoryFragmentArgs.fromBundle(requireArguments()).name
        val dataDescription = DetailCategoryFragmentArgs.fromBundle(requireArguments()).stock

        binding.tvCategoryName.text = dataName
        binding.tvCategoryDescription.text = getString(R.string.stock_format, dataDescription)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

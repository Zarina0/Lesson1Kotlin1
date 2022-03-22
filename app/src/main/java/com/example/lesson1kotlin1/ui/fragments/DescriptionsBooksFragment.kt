package com.example.lesson1kotlin1.ui.fragments

import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kotlin1lesson1.base.BaseFragment
import com.example.lesson1kotlin1.R
import com.example.lesson1kotlin1.databinding.FragmentDescriptionsBooksBinding

class DescriptionsBooksFragment : BaseFragment<FragmentDescriptionsBooksBinding>(
    R.layout.fragment_descriptions_books
) {
    override val binding: FragmentDescriptionsBooksBinding by viewBinding(
        FragmentDescriptionsBooksBinding::bind
    )
    private val args: DescriptionsBooksFragmentArgs by navArgs()

    override fun getArgs() {

        binding.tvDescription.text = args.argsDescriptionsBooksFragment
    }

}
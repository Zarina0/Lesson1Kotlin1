package com.example.lesson1kotlin1.ui.fragments

import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kotlin1lesson1.base.BaseFragment
import com.example.kotlin1lesson1.interfaces.OnItemClickListener
import com.example.lesson1kotlin1.R
import com.example.lesson1kotlin1.ui.adapters.BooksAdapter
import com.example.lesson1kotlin1.databinding.FragmentNameBooksBinding
import com.example.lesson1kotlin1.models.BooksModel
import com.example.lesson1kotlin1.ui.fragments.view_model.BooksViewModel

class NameBooksFragment : BaseFragment<FragmentNameBooksBinding>(
    R.layout.fragment_name_books
), OnItemClickListener<BooksModel> {

    override val binding: FragmentNameBooksBinding by viewBinding(FragmentNameBooksBinding::bind)
    private val viewModel: BooksViewModel by activityViewModels()
    private val booksAdapter = BooksAdapter(this)

    override fun initAdapter() {
        booksAdapter.setList(viewModel.getBooks())
        binding.recyclerview.adapter = booksAdapter
    }

    override fun onClick(model: BooksModel, position: Int) {
        findNavController().navigate(
            NameBooksFragmentDirections.actionNameBooksFragmentToDescriptionsBooksFragment(
                model.description
            )
        )
    }
}
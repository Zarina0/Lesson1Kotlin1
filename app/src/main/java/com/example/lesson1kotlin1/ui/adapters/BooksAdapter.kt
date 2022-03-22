package com.example.lesson1kotlin1.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin1lesson1.interfaces.OnItemClickListener
import com.example.lesson1kotlin1.databinding.ItemBookHolderBinding
import com.example.lesson1kotlin1.models.BooksModel

class BooksAdapter(
    private val onItemClick: OnItemClickListener<BooksModel>
) :
    RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    private var list: List<BooksModel> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder =
        BooksViewHolder(
            ItemBookHolderBinding.inflate
                (
                LayoutInflater.from(parent.context), parent, false
            )
        )


    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size


    fun setList(list: List<BooksModel>) {
        this.list = list
    }

    inner class BooksViewHolder(private val viewBinding: ItemBookHolderBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {

        fun onBind(bookModel: BooksModel) {
            viewBinding.tvNameBook.text = bookModel.title
            viewBinding.imBook.setImageResource(bookModel.image)
            viewBinding.root.setOnClickListener {
                onItemClick.onClick(bookModel,absoluteAdapterPosition)
            }
        }
    }
}
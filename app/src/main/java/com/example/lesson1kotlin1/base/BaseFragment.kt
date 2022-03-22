package com.example.kotlin1lesson1.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<Binding : ViewBinding>(@LayoutRes layoutId: Int) : Fragment(
    layoutId
) {
    protected abstract val binding: ViewBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
        initAdapter()
        initialize()
        getArgs()
    }


    open fun initListeners() {
    }

    open fun initAdapter() {
    }


    open fun getArgs() {
    }

    open fun initialize() {}


}
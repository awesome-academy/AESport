package com.suntraining.aesport.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.suntraining.aesport.R
import com.suntraining.aesport.utils.showToast

abstract class BaseFragment<VB : ViewDataBinding, VM : BaseViewModel> : Fragment() {

    private var _viewBinding: VB? = null
    protected val viewBinding: VB
        get() = _viewBinding
            ?: throw IllegalStateException(resources.getString(R.string.msg_exception_base))
    @get:LayoutRes
    protected abstract val layoutResource: Int
    protected abstract val viewModel: VM

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? = DataBindingUtil
        .inflate<VB>(inflater, layoutResource, container, false)
        .apply { _viewBinding = this }
        .root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeViewModel()
        initViews()
        initData()
        initActions()
    }

    protected abstract fun initViews()

    protected abstract fun initData()

    protected abstract fun initActions()

    protected open fun observeViewModel() = with(viewModel) {
        isLoading.observe(viewLifecycleOwner, Observer(::handleLoading))
        message.observe(viewLifecycleOwner, {
            hideLoading()
            if (it.isNullOrBlank().not()) {
                context?.showToast(it)
            }
        })
    }

    private fun handleLoading(isLoading: Boolean?) =
        if (isLoading == true) showLoading() else hideLoading()

    open fun showLoading() {}

    open fun hideLoading() {}

    override fun onDestroy() {
        super.onDestroy()
        _viewBinding = null
    }
}

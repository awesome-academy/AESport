package com.suntraining.aesport.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.suntraining.aesport.R

abstract class BaseActivity<VB : ViewDataBinding> : AppCompatActivity() {

    private var _viewBinding: VB? = null
    protected val viewBinding: VB
        get() = _viewBinding
            ?: throw IllegalStateException(resources.getString(R.string.msg_exception_base))

    @get:LayoutRes
    protected abstract val layoutId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewBinding()
        initViews()
    }

    private fun initViewBinding() {
        _viewBinding = DataBindingUtil.setContentView(this, layoutId)
        viewBinding.lifecycleOwner = this
    }

    protected abstract fun initViews()

    override fun onDestroy() {
        super.onDestroy()
        _viewBinding = null
    }
}

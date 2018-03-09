package com.android.yuexunit.yxeducation

import android.os.Bundle
import com.android.yuexunit.yxeducationlibrary.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
    override fun initData(savedInstanceState: Bundle?) {
        setTitleText("智慧教育")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test_name.text = "欢迎来到测试"
    }

}

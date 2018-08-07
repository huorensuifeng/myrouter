package com.router.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.module.extend.view.ExtendActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends ExtendActivity {


    @Override
    protected int initLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initData(@Nullable Bundle savedInstanceState) {
        if (BuildConfig.DEBUG) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(getApplication()); // 尽可能早，推荐在Application中初始化

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.click1, R.id.click2, R.id.click3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.click1:
                ARouter.getInstance().build("/test3/activity1")
                        .withLong("key1", 666L)
                        .withString("key3", "888")
//                        .withObject("key4", new Test("Jack", "Rose"))
                        .navigation();
                break;
            case R.id.click2:
                ARouter.getInstance().build("/test/demo1")
                        .withLong("key1", 666L)
                        .withString("key3", "888")
//                        .withObject("key4", new Test("Jack", "Rose"))
                        .navigation();
                break;
            case R.id.click3:
                ARouter.getInstance().build("/test2/demo2")
                        .withLong("key1", 666L)
                        .withString("key3", "888")
//                        .withObject("key4", new Test("Jack", "Rose"))
                        .navigation();
                break;
        }
    }
}

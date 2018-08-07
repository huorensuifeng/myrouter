package com.module.extend.view;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.githang.statusbar.StatusBarCompat;
import com.module.extend.R;

import butterknife.ButterKnife;

public abstract class ExtendActivity extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initLayout());
        ButterKnife.bind(this);
        StatusBarCompat.setStatusBarColor(this, ContextCompat.getColor(this, R.color.white), true);
        initData(savedInstanceState);
    }

    protected abstract @LayoutRes int initLayout();

    protected abstract void initData(@Nullable Bundle savedInstanceState);
}

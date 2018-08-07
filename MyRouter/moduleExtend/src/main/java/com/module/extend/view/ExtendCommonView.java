package com.module.extend.view;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import butterknife.ButterKnife;

public abstract class ExtendCommonView extends LinearLayout{
    public ExtendCommonView(Context context) {
        super(context);
        init();
    }

    public ExtendCommonView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ExtendCommonView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init(){
        LayoutInflater.from(getContext()).inflate(initLayout(), this);
        ButterKnife.bind(this);
        initData();
    }


    protected abstract @LayoutRes int initLayout();

    protected abstract void initData();
}

package com.jhs.taolibao.base.recyclerview;

import android.view.View;
import android.view.ViewGroup;

public interface OnItemClickListener<T>
{
    void onItemClick(ViewGroup parent, View view, T t, int position);
}
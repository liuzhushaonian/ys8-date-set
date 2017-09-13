package com.legend.ys8.adaper;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

/**
 * 基础adapter
 * Created by legend on 2017/8/8.
 */

public class BaseAdapter<T extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<T>{
    @Override
    public T onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(T holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    static class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
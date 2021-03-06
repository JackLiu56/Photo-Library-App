package com.android.albumapp;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * @author Ziyang Liu
 * @author Hongpeng Zhang
 */
public class GridViewItem extends ImageView {

    public GridViewItem(Context context) {
        super(context);
    }

    public GridViewItem(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GridViewItem(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);
        //Make the height equivalent to its width
    }
}
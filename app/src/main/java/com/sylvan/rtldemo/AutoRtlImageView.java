package com.sylvan.rtldemo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.Log;

public class AutoRtlImageView extends AppCompatImageView {
    private final String TAG = "AutoRtlImageView";
    private final float ROTATION_Y_180 = 180f;
    private final float ROTATION_Y_0 = 0f;

    public AutoRtlImageView(Context context) {
        super(context);
        init();
    }

    public AutoRtlImageView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public AutoRtlImageView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public void init() {
        if (LanguageUtil.isLayoutRTL()) {
            Log.d(TAG, "setRotationY: 180");
            setRotationY(ROTATION_Y_180);
        } else {
            Log.d(TAG, "setRotationY: 0");
            setRotationY(ROTATION_Y_0);
        }
    }

    /**
     * 是否镜像
     *
     * @param flag
     */
    public void setMirrored(boolean flag) {
        if (flag) {
            setRotationY(ROTATION_Y_180);
        } else {
            setRotationY(ROTATION_Y_0);
        }
    }
}
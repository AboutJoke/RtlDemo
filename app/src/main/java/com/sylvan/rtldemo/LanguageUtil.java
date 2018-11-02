package com.sylvan.rtldemo;

import android.text.TextUtils;
import android.view.View;

import java.util.Locale;

public class LanguageUtil {

    /**
     * 当前系统语言是否是阿拉伯语
     */
    private static boolean isAR() {
        return Locale.getDefault().getLanguage().equalsIgnoreCase(new Locale("ar").getLanguage());
    }

    /**
     * 获取当前的布局方向
     *
     * @return {@link android.view.View#LAYOUT_DIRECTION_LTR} or
     * {@link android.view.View#LAYOUT_DIRECTION_RTL}.
     */
    public static int getLayoutDirection() {
        return TextUtils.getLayoutDirectionFromLocale(Locale.getDefault());
    }

    /**
     * 判断布局方向是否是从右到左
     */
    public static boolean isLayoutRTL() {
        return getLayoutDirection() == View.LAYOUT_DIRECTION_RTL;
    }
}

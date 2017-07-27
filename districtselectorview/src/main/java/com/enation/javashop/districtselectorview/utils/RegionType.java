package com.enation.javashop.districtselectorview.utils;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 地区等级
 */

public class RegionType {

    /**
     * 一级分类
     */
    public static final int First =  0;

    /**
     * 二级分类
     */
    public static final int Second = 1;

    /**
     * 三级分类
     */
    public static final int Third =  2;

    /**
     * 四级分类
     */
    public static final int Fourth = 3;

    @IntDef({First, Second, Third, Fourth})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {

    }
}

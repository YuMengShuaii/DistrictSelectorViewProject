package com.enation.javashop.districtselectorview.model;

import com.enation.javashop.districtselectorview.utils.RegionType;

/**
 * 基本数据接口  如果要使用该控件必须继承该接口
 */

public interface BaseRagionModel {
    String getPickerName();
    @RegionType.Type
    int getType();
    int  getRegionId();
}

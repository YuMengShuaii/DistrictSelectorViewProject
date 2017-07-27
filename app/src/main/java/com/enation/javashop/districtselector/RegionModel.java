package com.enation.javashop.districtselector;

import com.enation.javashop.districtselectorview.model.BaseRagionModel;

/**
 * Created by LDD on 17/7/27.
 */

public class RegionModel implements BaseRagionModel {

    private String name;
    private int    id;
    private int    type;

    public RegionModel(String name, int id, int type) {
        this.name = name;
        this.id = id;
        this.type = type;
    }

    @Override
    public String getPickerName() {
        return name;
    }

    @Override
    public int getType() {
        return type;
    }

    @Override
    public int getRegionId() {
        return id;
    }
}

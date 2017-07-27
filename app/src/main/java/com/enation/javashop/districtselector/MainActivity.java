package com.enation.javashop.districtselector;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.enation.javashop.districtselectorview.widget.DistrictSelectorView;
import com.enation.javashop.districtselectorview.utils.RegionType;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayList<RegionModel> data = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            data.add(new RegionModel("北京"+i,1, RegionType.First));
        }
        final DistrictSelectorView selectView = new DistrictSelectorView(this);
        selectView.setRegionListener(new DistrictSelectorView.RegionListener<RegionModel>() {
            @Override
            public void setPickData(RegionModel rid) {
                switch (rid==null?0:rid.getRegionId()) {
                    case 0:
                        ArrayList<RegionModel> data = new ArrayList<>();
                        for (int i = 0; i < 20; i++) {
                            data.add(new RegionModel("北京"+i,1, RegionType.First));
                        }
                        selectView.setData(data);
                        break;
                    case 1:
                        ArrayList<RegionModel> datas = new ArrayList<>();
                        for (int i = 0; i < 20; i++) {
                            datas.add(new RegionModel("新乡"+i,2, RegionType.Second));
                        }
                        selectView.setData(datas);
                        break;
                    case 2:
                        ArrayList<RegionModel> data2 = new ArrayList<>();
                        for (int i = 0; i < 20; i++) {
                            data2.add(new RegionModel("河南"+i,3, RegionType.Third));
                        }
                        selectView.setData(data2);
                        break;
                    case 3:
                        ArrayList<RegionModel> data1 = new ArrayList<>();
                        for (int i = 0; i < 20; i++) {
                            data1.add(new RegionModel("郑州"+i,4, RegionType.Fourth));
                        }
                        selectView.setData(data1);
                        break;
                }
            }

            @Override
            public void getResult(RegionModel per,RegionModel city,RegionModel region,RegionModel town) {
                Log.e("SELECTTEST",per==null?"":per.getPickerName()
                        +" "+(city==null?"":city.getPickerName())
                        +" "+(region==null?"":region.getPickerName())
                        +" "+(town==null?"":town.getPickerName()));
            }
        });
        findViewById(R.id.text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectView.setCancelText("asda").setConfirmText("2313");
                selectView.show(data);
            }
        });
    }
}

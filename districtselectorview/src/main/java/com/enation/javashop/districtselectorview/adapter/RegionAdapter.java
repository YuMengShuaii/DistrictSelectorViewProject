package com.enation.javashop.districtselectorview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.enation.javashop.districtselectorview.R;
import com.enation.javashop.districtselectorview.model.BaseRagionModel;

import java.util.ArrayList;

/**
 * 适配器
 * @param <T> model
 */

public class RegionAdapter<T extends BaseRagionModel> extends BaseAdapter {
    private ArrayList<T> datas;

    private LayoutInflater inflater;

    public RegionAdapter(Context context , ArrayList<T> datas) {
        this.datas = datas;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        if (datas==null){
            return 0;
        }
        return datas.size();
    }

    @Override
    public T getItem(int position) {
        return datas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder =null;
        if (convertView==null){
            viewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.picker_item,null);
            viewHolder.picker_item_tv = (TextView) convertView.findViewById(R.id.picker_item_tv);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
           viewHolder.picker_item_tv.setText(getItem(position).getPickerName());
        return convertView;
    }

    public void setData(ArrayList<T> data){
        datas=null;
        notifyDataSetChanged();
        datas = data;
        notifyDataSetChanged();
    }


    static class ViewHolder{
        TextView picker_item_tv ;
    }
}

## DistrictSelectorView

### 前言

	该组件是一个地区选择器，最高支持四级地区选择，可以自定义样式，支持链式调用。


### Install

#### Gradle

	compile 'com.enation.geamtear.widget:districtselectorview:1.0.1'

#### Maven

    <dependency>
    <groupId>com.enation.geamtear.widget</groupId>
    <artifactId>districtselectorview</artifactId>
    <version>1.0.1</version>
    <type>pom</type>
    </dependency>

#### LVY

    <dependency org='com.enation.geamtear.widget' name='districtselectorview' rev='1.0.1'>
    <artifact name='districtselectorview' ext='pom' ></artifact>
    </dependency>

### 使用方式

  * 首先地区数据Model实现BaseRagionModel

#### 大致使用方式如下

		/**RegionModel实现BaseRagionModel*/
		DistrictSelectorView<RegionModel> selectView = new DistrictSelectorView(this);
		/**自定义返回键图片*/
		selectView.setBackImage(R.drawable.back)
	          /**自定义取消键文字*/
                  .setCancelText("退出")
                  /**自定义背景样式*/
                  .setBackGroundStyle(R.drawable.radis)
                  /**自定义确定键文字*/
                  .setConfirmText("确定")
                  /**自定义返回键样式*/
                  .setCancelStyle(R.drawable.dialog_left_radis)
                  /**自定义确认键样式*/
                  .setConfrimStyle(R.drawable.dialog_radis)
                  /**自定义topbar样式*/
                  .setTopBarStyle(R.drawable.dialog_left_radis)
                  /**设置地址监听*/
                  .setRegionListener(this)
                  /**设置数据并显示*/
                  .show(data);

    		/**监听接口*/
     		new DistrictSelectorView.RegionListener() {
     		      /**此方法用户来更新DistrictSelectorView数据源*/
                      @Override
                      public void setPickData(BaseRagionModel previousData) {
                          ArrayList<RegionModel> data = new ArrayList<>();
                          for (int i = 0; i < 20; i++) {
                            data.add(new RegionModel("北京"+i,1, RegionType.First));
                          }
                          selectView.setData(data);
                      }
					  /**通过方法最终获取选择完成的结果*/
                      @Override
                      public void getResult(BaseRagionModel per, BaseRagionModel city, BaseRagionModel region, BaseRagionModel town) {

                      }
                  }

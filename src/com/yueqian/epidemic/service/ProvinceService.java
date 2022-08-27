package com.yueqian.epidemic.service;

import com.yueqian.epidemic.bean.ProvinceInfo;

import java.util.List;

/**
 * 访问省份的service
 */
public interface ProvinceService {
    /**
     * 获取还未录入数据的省份的列表
     * @param date
     * @return
     */
    List<ProvinceInfo> findNoDataProvinces(String date);
}

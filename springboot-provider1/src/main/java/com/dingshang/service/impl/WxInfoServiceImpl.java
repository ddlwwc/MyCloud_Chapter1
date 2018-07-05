package com.dingshang.service.impl;

import com.dingshang.mapper.TsWxUserInfoMapper;
import com.dingshang.service.WxInfoService;
import com.example.demo.model.TsWxUserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wancheng on 2018/7/5.
 */
@Service
public class WxInfoServiceImpl implements WxInfoService{

    @Autowired
    TsWxUserInfoMapper tsWxUserInfoMapper;

    @Override
    public TsWxUserInfo get(Integer id) {
        return tsWxUserInfoMapper.selectByPrimaryKey(id);
    }
}

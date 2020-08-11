package com.qianfeng.jfr.service.impl;

import com.qianfeng.jfr.bean.UmsMember;
import com.qianfeng.jfr.bean.UmsMemberReceiveAddress;
import com.qianfeng.jfr.mapper.UmsMemberReceiveAddressMapper;
import com.qianfeng.jfr.mapper.UserMapper;
import com.qianfeng.jfr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        //一使用Example构造器
//        Example example=new Example(UmsMemberReceiveAddress.class);//构造器
//        example.createCriteria().andEqualTo("memberId",memberId);//拼接SQL语句where memberId=#{memberId}
//        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectByExample(example);

        //直接new一个UmsMemberReceiveAddress对象，然后给对象的属性赋值，传一个对象过去
        UmsMemberReceiveAddress umsMemberReceiveAddress=new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddresses;
    }
}

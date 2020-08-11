package com.qianfeng.jfr.service;

import com.qianfeng.jfr.bean.UmsMember;
import com.qianfeng.jfr.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

     List<UmsMember> getAllUser();

     List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}

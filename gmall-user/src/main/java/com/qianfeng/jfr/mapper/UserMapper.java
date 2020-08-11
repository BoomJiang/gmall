package com.qianfeng.jfr.mapper;

import com.qianfeng.jfr.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {
    //@Select("select * from ums_member")
     List<UmsMember> getAllUser();
}

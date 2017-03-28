package com.fire.mapper;

import com.fire.po.ShuichanData;

import java.util.List;
import java.util.Map;

public interface AdmMapper {
    //// 查询管理员登录
    //public TAdm findAdmByNameAndPasswd(TAdm tAdm) throws Exception;
    //
    ////查询用户
    //public List<TUser> findUserByRname(String rRname) throws Exception;
    //
    ////通过用户用户名查询用户信息
    //public TUser findUserByUname(String uName) throws Exception;
    //
    ////查询鱼塘信息
    //public List<TPort> findPortListByName(String pName) throws Exception;
    //
    ////查询鱼塘的信息和塘主的用户名
    //public List<PortVo> findPortAndUnameList(String pName) throws Exception;
    //
    ////尝试进行管理员的枫叶查询
    //public List<TAdm> queryAdmByPage(Map<String, Object> parameter) throws Exception;

    //新数据库的水产数据的分页查询
    public List<ShuichanData> queryHistoryDataByPage(Map<String, Object> parameter)throws Exception;


}

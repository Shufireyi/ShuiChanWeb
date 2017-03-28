package com.fire.service;

import com.fire.po.ShuichanData;

import java.util.List;
import java.util.Map;

/**
 * 管理员service
 *
 * @author fire
 */

public interface AdmService {
    //// 根据用户名和密码检查登录
    //public TAdm findAdmByNameAndPasswd(TAdm tAdm) throws Exception;
    //
    //// 用户信息录入
    //public void insertUserInfo(TUser tUser) throws Exception;
    //
    //// 用户信息删除
    //public int deleteUser(Integer uId) throws Exception;
    //
    //// 用户信息更新
    //public int userUpdate(TUser tUser) throws Exception;
    //
    //// 用户信息查询
    //public List<TUser> findUserList(String rRname) throws Exception;
    //
    ////用户信息查询通过用户名
    //public TUser findUserByUname(String uName) throws Exception;
    //
    //// 鱼塘信息录入
    //public void insertPortInfo(TPort tPort) throws Exception;
    //
    //// 删除鱼塘信息
    //public int deletePort(Integer pId) throws Exception;
    //
    //// 更新鱼塘信息
    //public int portUpdate(TPort tPort) throws Exception;
    //
    //// 查询鱼塘信息
    //public List<TPort> findPortList(String pName) throws Exception;
    //
    ////查询鱼塘信息和所属塘主用户名
    //public List<PortVo> findPortAndUnameList(String pName) throws Exception;
    //
    ////尝试管理员的分页查询
    //List<TAdm> queryAdmByPage(Map<String, Object> parameter) throws Exception;

    //新数据库的历史数据查询
    List<ShuichanData> queryHistoryDataByPage(Map<String, Object> parameter)throws Exception;
}

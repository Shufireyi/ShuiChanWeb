package com.fire.service.impl;

import com.fire.mapper.AdmMapper;
import com.fire.po.ShuichanData;
import com.fire.service.AdmService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * 管理员管理
 *
 * @author fire
 */
public class AdmServiceImpl implements AdmService {

    @Autowired
    private AdmMapper admMapper;

    //@Autowired
    //private TUserMapper tUserMapper;
    //
    //@Autowired
    //private TPortMapper tPortMapper;
    //
    //// 管理员登录
    //
    //public TAdm findAdmByNameAndPasswd(TAdm tAdm) throws Exception {
    //    TAdm re = admMapper.findAdmByNameAndPasswd(tAdm);
    //    return re;
    //}
    //
    //// 添加用户信息
    //
    //public void insertUserInfo(TUser tUser) throws Exception {
    //    tUserMapper.insertSelective(tUser);
    //}
    //
    //// 删除用户
    //
    //public int deleteUser(Integer uId) throws Exception {
    //    return tUserMapper.deleteByPrimaryKey(uId);
    //}
    //
    //// 用户信息修改
    //
    //public int userUpdate(TUser tUser) throws Exception {
    //    return tUserMapper.updateByPrimaryKeySelective(tUser);
    //
    //}
    //
    //// 用户信息的查询
    //
    //public List<TUser> findUserList(String rRname) throws Exception {
    //    return admMapper.findUserByRname(rRname);
    //}
    //
    ////用户信息查询通过用户名
    //public TUser findUserByUname(String uName) throws Exception {
    //    return admMapper.findUserByUname(uName);
    //}
    //
    //// 添加塘口信息
    //
    //public void insertPortInfo(TPort tPort) throws Exception {
    //    tPortMapper.insertSelective(tPort);
    //}
    //
    //// 删除鱼塘信息
    //
    //public int deletePort(Integer pId) throws Exception {
    //    return tPortMapper.deleteByPrimaryKey(pId);
    //}
    //
    ////更新鱼塘信息
    //
    //public int portUpdate(TPort tPort) throws Exception {
    //    return tPortMapper.updateByPrimaryKeySelective(tPort);
    //}
    //
    //// 查询鱼塘信息
    //
    //public List<TPort> findPortList(String pName) throws Exception {
    //    return admMapper.findPortListByName(pName);
    //}
    //
    ////查询鱼塘信息和所属的塘主的用户名
    //public List<PortVo> findPortAndUnameList(String pName) throws Exception {
    //
    //    return admMapper.findPortAndUnameList(pName);
    //
    //}
    //
    ////尝试分页查询管理员
    //public List<TAdm> queryAdmByPage(Map<String,Object> parameter) throws Exception{
    //    return admMapper.queryAdmByPage(parameter);
    //}

    //新数据库的历史数据查询
    public List<ShuichanData> queryHistoryDataByPage(Map<String,Object> parameter)throws Exception{
        return admMapper.queryHistoryDataByPage(parameter);
    }

}

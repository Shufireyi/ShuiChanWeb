package com.fire.controller;

import com.fire.po.HistoryDateUtil;
import com.fire.po.Page;
import com.fire.po.ShuichanData;
import com.fire.service.AdmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 管理员controller
 *
 * @author fire
 */
@Controller
//@RequestMapping("/adm")
public class AdmController {

    @Autowired
    private AdmService admService;

    //// 管理员登录
    //@RequestMapping(value = "admLogin")
    //public
    //@ResponseBody
    //String admLogin(HttpSession session, TAdm tAdm) throws Exception {
    //    TAdm re = admService.findAdmByNameAndPasswd(tAdm);
    //    String isNull = null;
    //    if (re != null) {
    //        session.setAttribute("nowUser", tAdm.getaName());
    //        isNull = "success";
    //    }
    //    return isNull;
    //}
    //
    //// 管理员退出
    //@RequestMapping(value = "admLogout")
    //public String logout(HttpSession session) throws Exception {
    //    // 清除session
    //    session.invalidate();
    //    return "redirect:../index.html";
    //}
    //
    //// 用户信息录入
    //@RequestMapping(value = "userInsert")
    //public
    //@ResponseBody
    //String userInsert(TUser tUser) throws Exception {
    //    String isNull = null;
    //    admService.insertUserInfo(tUser);
    //    isNull = "success";
    //    return isNull;
    //}
    //
    //// 删除用户
    //@RequestMapping(value = "userDelete")
    //public
    //@ResponseBody
    //String userDelete(Integer uId) throws Exception {
    //    String isNull = null;
    //    admService.deleteUser(uId);
    //    isNull = "success";
    //    return isNull;
    //}
    //
    //// 修改用户信息
    //@RequestMapping(value = "userUpdate")
    //public
    //@ResponseBody
    //String userUpdate(Integer uId, TUser tUser) throws Exception {
    //    // 测试
    //    // TUser test = new TUser();
    //    // test.setuId(2);
    //    // test.setuName("刘晓军");
    //    // test.setuPhone("110");
    //    // admService.userUpdate(test);
    //    String isNull = null;
    //    tUser.setuId(uId);
    //    admService.userUpdate(tUser);
    //    isNull = "success";
    //    return isNull;
    //}
    //
    //// 用户信息的查询
    //@RequestMapping(value = "userQuery")
    //public
    //@ResponseBody
    //List<TUser> userQuery(String uRname) throws Exception {
    //    List<TUser> userList = admService.findUserList(uRname);
    //    return userList;
    //}
    //
    //// 插入鱼塘信息
    //@RequestMapping(value = "portInsert")
    //public
    //@ResponseBody
    //String portInsert(TPort tPort) throws Exception {
    //    String isNull = null;
    //    admService.insertPortInfo(tPort);
    //    isNull = "success";
    //    return isNull;
    //}
    //
    //// 删除鱼塘信息
    //@RequestMapping(value = "portDelete")
    //public
    //@ResponseBody
    //String portDelete(Integer pId) throws Exception {
    //    String isNull = null;
    //    admService.deletePort(pId);
    //    isNull = "success";
    //    return isNull;
    //}
    //
    //// 修改鱼塘信息
    //@RequestMapping(value = "portUpdate")
    //public
    //@ResponseBody
    //String portUpdate(Integer pId, TPort tPort) throws Exception {
    //    // 测试
    //    // TPort test = new TPort();
    //    // test.setpId(2);
    //    // test.setpPro("湖南省");
    //    // test.setpCity("长沙市");
    //    // admService.portUpdate(test);
    //    String isNull = null;
    //    tPort.setpId(pId);
    //    admService.portUpdate(tPort);
    //    isNull = "success";
    //    return isNull;
    //}
    //
    //// 转让鱼塘所有权
    //@RequestMapping(value = "portChange")
    //public
    //@ResponseBody
    //String portChange(Integer pId, TPort tPort, String uName) throws Exception {
    //    String isNull = null;
    //    TUser newowner = admService.findUserByUname(uName);
    //    tPort.setpId(pId);
    //    tPort.setuId(newowner.getuId());
    //    admService.portUpdate(tPort);
    //    isNull = "success";
    //    return isNull;
    //}
    //
    //// 查询鱼塘信息
    //@RequestMapping(value = "portQuery")
    //public
    //@ResponseBody
    //List<TPort> portQuery(String pName) throws Exception {
    //    List<TPort> portList = admService.findPortList(pName);
    //    return portList;
    //}
    //
    //// 查询鱼塘信息和塘主的用户名
    //@RequestMapping(value = "port_unameQuery")
    //public
    //@ResponseBody
    //List<PortVo> portunametQuery(String pName) throws Exception {
    //    List<PortVo> portList = admService.findPortAndUnameList(pName);
    //    return portList;
    //}
    //
    ////分页查询管理员：尝试
    //@RequestMapping(value = "queryAdmByPage")
    //public
    //@ResponseBody
    //List<TAdm> queryAdmByPage(Page page) throws Exception {
    //    Map<String, Object> parameter = new HashMap<String, Object>();
    //    //组织管理员对象
    //    TAdm tAdm = new TAdm();
    //    Page page1 = new Page();
    //    page1.setCurrentPage(2);
    //    parameter.put("TAdm", tAdm);
    //    parameter.put("Page", page1);
    //    List<TAdm> list = admService.queryAdmByPage(parameter);
    //    return list;
    //}

    //分页查询shuichandata 换了个数据库，具体待议
    @RequestMapping(value = "queryHistoryDataByPage")
    public
    @ResponseBody
    List<ShuichanData> queryHistoryDataByPage(HistoryDateUtil historyDateUtil, Page page) throws Exception {
        Map<String, Object> parameter = new HashMap<String, Object>();
        HistoryDateUtil historyDateUtil1 = new HistoryDateUtil();
        Page page1 = new Page();
        page1.setCurrentPage(2);
        historyDateUtil1.setComid("2");
        historyDateUtil1.setFacid("1");
        historyDateUtil1.setType("ph");
        historyDateUtil1.setStartDate("2017-01-19");
        historyDateUtil1.setStartTime("0:0:0");
        historyDateUtil1.setEndDate("2017-01-20");
        historyDateUtil1.setEndTime("23:0:0");
        parameter.put("util", historyDateUtil1);
        parameter.put("page", page1);
        List<ShuichanData> list = admService.queryHistoryDataByPage(parameter);
        return list;
    }

}

























package com.xlx.day01;

import com.xlx.day01.dao.impl.MysqlDaoImpl;
import com.xlx.day01.dao.impl.OrcalDaoImpl;
import com.xlx.day01.service.impl.Service;

/**
 * @author xlx
 * @Date: 2021/7/20
 * @Description:com.xlx.day01
 * @version:1.0
 */
public class SpringStart {
    public static void main(String[] args) {
        //查询用户数据
        Service service = new Service();
        service.setDao(new MysqlDaoImpl());
        service.findUserService();

        service.setDao(new OrcalDaoImpl());
        service.findUserService();
    }
}

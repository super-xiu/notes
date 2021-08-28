package com.xlx.day01.service.impl;

import com.xlx.day01.dao.IDao;
import com.xlx.day01.dao.impl.MysqlDaoImpl;
import com.xlx.day01.dao.impl.OrcalDaoImpl;
import com.xlx.day01.dao.impl.SqlServerImpl;
import com.xlx.day01.service.IService;

/**
 * @author xlx
 * @Date: 2021/7/20
 * @Description:com.xlx.day01.service.impl
 * @version:1.0
 */
public class Service implements IService {
    private IDao dao;

    /**
     * 使用set方法进行解决，将程序员主动修改的逻辑编程代码修改
     * @param dao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    public void findUserService() {
        //如果用户根据业务需求需要采用不同的实现进行数据库中数据的访问，那么需要每次都进入service中进行代码修改
//        IDao dao = new MysqlDaoImpl();
//        OrcalDaoImpl orcalDao = new OrcalDaoImpl();
//        SqlServerImpl sqlServer = new SqlServerImpl();
        dao.findUser();

        //解决方法

    }
}

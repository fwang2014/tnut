package com.nutz.pip.dao.customer;

import org.nutz.ioc.annotation.InjectName;
import org.nutz.ioc.loader.annotation.IocBean;

import com.nutz.pip.dao.BasicDao;

@SuppressWarnings("unused")
@IocBean
@InjectName
public class CustomerDao extends BasicDao {
	private static final org.nutz.log.Log log = org.nutz.log.Logs
			.getLog(CustomerDao.class);

}
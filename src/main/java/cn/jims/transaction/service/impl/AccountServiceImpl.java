package cn.jims.transaction.service.impl;

import cn.jims.transaction.dao.AccountDao;
import cn.jims.transaction.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Jims on 2017/1/31.
 */
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

    /*set注入
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }*/
    @Transactional
    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out, money);
        int a =1/0;
        accountDao.inMoney(in, money);
    }
}

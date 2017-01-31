package cn.jims.transaction.dao.impl;

import cn.jims.transaction.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by Jims on 2017/1/31.
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    public void outMoney(String out, Double money) {
        String sql = "update account set money = money-? where name = ?";
        this.getJdbcTemplate().update(sql, money, out);
    }

    public void inMoney(String in, Double money) {
        String sql = "update account set money = money+? where name = ?";
        this.getJdbcTemplate().update(sql, money, in);
    }
}

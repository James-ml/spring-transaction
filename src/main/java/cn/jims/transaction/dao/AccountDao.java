package cn.jims.transaction.dao;

/**
 * Created by Jims on 2017/1/31.
 */
public interface AccountDao {

    /**
     *
     * @param out 转出账号
     * @param money 转账金额
     */
    void outMoney(String out,Double money);

    /**
     *
     * @param in 转入账号
     * @param money 转账金额
     */
    void inMoney(String in,Double money);
}

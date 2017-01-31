package cn.jims.transaction.service;

/**
 * Created by Jims on 2017/1/31.
 */
public interface AccountService {

    void transfer(String out, String in, Double money);
}

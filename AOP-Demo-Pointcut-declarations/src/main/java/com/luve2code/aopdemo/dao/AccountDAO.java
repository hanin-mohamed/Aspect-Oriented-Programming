package com.luve2code.aopdemo.dao;


import com.luve2code.aopdemo.Account;

import java.util.List;

public interface AccountDAO {

    void addAccount(Account account,boolean vipFlag);

    boolean doWork();
     String getName();

     void setName(String name);

     String getServiceCode();

     void setServiceCode(String serviceCode);
    List<Account> findAccounts(boolean flag);
    List<Account> findAccounts();
}

package com.luve2code.aopdemo.dao;


import org.springframework.stereotype.Repository;

@Repository
public class MembershipDAOImpl implements MembershipDAO{
    @Override
    public boolean addSillyMember() {
        System.out.println(getClass()+" : Adding A Membership account");
    return true;
    }

    @Override
    public void goToSleep() {
        System.out.println(getClass()+" : I'm going to sleep now...");
    }
}

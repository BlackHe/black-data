package com.peony.blackdata.service.impl;

import com.peony.blackdata.dao.AccountBalanceDao;
import com.peony.blackdata.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountBalanceDao accountBalanceDao;

    @Override
    public void updateAccountBalance() {
        System.out.println("更新账户余额");
        accountBalanceDao.updateAccountBalance();
    }
}

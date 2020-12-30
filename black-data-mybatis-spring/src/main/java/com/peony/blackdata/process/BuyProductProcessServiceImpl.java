package com.peony.blackdata.process;


import com.peony.blackdata.service.AccountService;
import com.peony.blackdata.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BuyProductProcessServiceImpl implements BuyProductProcessService {

    @Autowired
    private AccountService accountService;


    @Autowired
    private ProductService productService;

    @Transactional
    @Override
    public void buy(){
        accountService.updateAccountBalance();
        productService.updateProductStore();
    }
}

package com.peony.blackdata.service.impl;

import com.peony.blackdata.dao.ProductStoreDao;
import com.peony.blackdata.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductStoreDao productStoreDao;

    @Override
    public void updateProductStore() {
        System.out.println("扣减库存");
        productStoreDao.updateProductStore();
        int a = 1/0;
    }
}

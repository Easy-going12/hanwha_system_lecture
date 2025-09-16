package com.ohgiraffers.transactional.section01.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderService {

    private final OrderMapper orderMapper;
    private final MenuMapper menuMapper;

    @Autowired
    public OrderService(MenuMapper menuMapper, OrderMapper orderMapper) {
        this.menuMapper = menuMapper;
        this.orderMapper = orderMapper;
    }

    @Transactional
    public void registerOrder(OrderDTO orderInfo) {

    }
}

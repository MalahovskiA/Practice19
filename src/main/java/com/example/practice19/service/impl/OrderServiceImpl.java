package com.example.practice19.service.impl;

import com.example.practice19.conroller.InviteType;
import com.example.practice19.model.Invite;
import com.example.practice19.model.Order;
import com.example.practice19.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {

    Map<Long, Invite> allInvites = new HashMap<>();
    Map<Long, Order> allOrders = new HashMap<>();

    {
        allInvites.put(1401L, new Invite(1401L, InviteType.DRINK, "tea"));
        allInvites.put(1402L, new Invite(1402L, InviteType.SAUCE, "chill"));
        allInvites.put(1403L, new Invite(1403L, InviteType.BORDER, "cheese"));
        allInvites.put(1404L, new Invite(1404L, InviteType.DRINK, "coffee"));
    }


    @Override
    public Order enreacheOrderByInvite(Order order) {
        List<Invite> userInvites = new ArrayList<>();
        if (order.getPizzaCount() > 2) {
            userInvites.addAll(allInvites.values());
        } else {
            for (Invite invite : allInvites.values()) {
                if(!InviteType.BORDER.equals(invite.getType())) {
                    userInvites.add(invite);
                }
            }
        }
        order.setInvites(userInvites);
        return order;
    }
}

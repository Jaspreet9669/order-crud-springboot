package com.example.ordercrud.service;

import com.example.ordercrud.model.Order;
import com.example.ordercrud.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order getOrderById(Long id) {
        return orderRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));
    }

    @Override
    public Order updateOrder(Long id, Order order) {
        Order existingOrder = getOrderById(id);
        existingOrder.setProductName(order.getProductName());
        existingOrder.setQuantity(order.getQuantity());
        existingOrder.setPrice(order.getPrice());
        return orderRepository.save(existingOrder);
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}

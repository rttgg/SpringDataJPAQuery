package com.perscholas.springdatajpaquery.repository;

import com.perscholas.springdatajpaquery.dto.OrderResponse;
import com.perscholas.springdatajpaquery.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query("SELECT new com.perscholas.springdatajpaquery.dto.OrderResponse(c.name, p.productName) FROM Customer c JOIN c.products p")
    public List<OrderResponse> getJoinInformation();

}

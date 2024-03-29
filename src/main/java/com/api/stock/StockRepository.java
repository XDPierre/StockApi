package com.api.stock;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

interface StockRepository extends JpaRepository<Stock, Long> {
    List<Stock> findByNameContainingOrTickerContaining(String name, String ticker);
}
package com.api.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class StockService {
    @Autowired
    private StockRepository stockRepository;

    public List<Stock> getAllStocks() {
        return stockRepository.findAll();
    }

    public Stock getStockById(Long id) {
        return stockRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Stock not found"));
    }

    public Stock createStock(Stock stock) {
        return stockRepository.save(stock);
    }

    public Stock updateStock(Long id, Stock stock) {
        Stock existingStock = getStockById(id);
        existingStock.setTicket(stock.getTicket());
        existingStock.setName(stock.getName());
        existingStock.setSector(stock.getSector());
        existingStock.setPrice(stock.getPrice());
        return stockRepository.save(existingStock);
    }

    public void deleteStock(Long id) {
        Stock existingStock = getStockById(id);
        stockRepository.delete(existingStock);
    }

    public List<Stock> searchStocks(String keyword) {
        return stockRepository.findByNameContainingOrTicketContaining(keyword, keyword);
    }
}
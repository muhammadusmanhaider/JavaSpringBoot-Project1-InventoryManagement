package com.springclassproject.springclassproject.Models;
import org.springframework.data.repository.CrudRepository;

public interface InventoryRepo extends CrudRepository<Inventory, String> {
}

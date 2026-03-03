package com.rafaelfavetta.mibri.repository;

import com.rafaelfavetta.mibri.model.ProductModel;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {



}

package com.tuyano.libro.bootapp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyDataRepository
        extends JpaRepository<MyData, Integer> {
 
}


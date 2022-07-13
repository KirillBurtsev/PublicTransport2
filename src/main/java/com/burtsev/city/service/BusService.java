package com.burtsev.city.service;
import com.burtsev.city.model.Bus;

import java.util.List;

public interface BusService {
    void create(Bus bus);

    List<Bus> readAll();


    Bus read(int numberCar);


    boolean update(Bus bus, int numberCar);


    boolean delete(int numberCar);
}




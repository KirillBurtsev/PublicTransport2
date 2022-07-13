package com.burtsev.city.service;

import com.burtsev.city.model.Bus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


@Service
public class BusServiceImpl implements BusService {

    // Хранилище клиентов
    private static final Map<Integer, Bus> BUS_REPOSITORY_MAP = new HashMap<>();

    // Переменная для генерации ID клиента
    private static final AtomicInteger BUS_ID_HOLDER = new AtomicInteger();

    @Override
    public void create(Bus bus) {
        final int busId = BUS_ID_HOLDER.incrementAndGet();
        bus.setNumberCar(busId);
        BUS_REPOSITORY_MAP.put(busId, bus);
    }

    @Override
    public List<Bus> readAll() {
        return new ArrayList<>(BUS_REPOSITORY_MAP.values());
    }

    @Override
    public Bus read(int numberCar) {
        return BUS_REPOSITORY_MAP.get(numberCar);
    }

    @Override
    public boolean update(Bus bus, int numberCar) {
        if (BUS_REPOSITORY_MAP.containsKey(numberCar)) {
            bus.setNumberCar(numberCar);
            BUS_REPOSITORY_MAP.put(numberCar, bus);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(int numberCar) {
        return BUS_REPOSITORY_MAP.remove(numberCar) != null;
    }
}

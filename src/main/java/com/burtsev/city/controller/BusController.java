package com.burtsev.city.controller;

import com.burtsev.city.model.Bus;
import com.burtsev.city.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BusController{
    private final BusService busService;

    @Autowired
    public BusController(BusService busService) {
        this.busService = busService;
    }

    @PostMapping (value="/bus")
    public ResponseEntity<?> create (@RequestBody Bus bus){
        busService.create(bus);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping (value="/bus")
    ResponseEntity<List<Bus>> read(){
        final List<Bus> bus=busService.readAll();

        return bus!=null&&!bus.isEmpty()
                ? new ResponseEntity<>(bus, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @GetMapping (value = "/bus/{numberCar}")
    public ResponseEntity<Bus> read(@PathVariable(name="numberCar")int numberCar){
        final Bus bus =busService.read(numberCar);
        return bus!=null
                ? new ResponseEntity<>(bus, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PutMapping (value="/bus/{numberCar}")
    public ResponseEntity<?> update (@PathVariable (name="numberCar")int numberCar, @RequestBody Bus bus){
        final boolean updated=busService.update(bus, numberCar);
        return updated
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @DeleteMapping (value="bus/{numberCar}")
    public ResponseEntity<?> delete (@PathVariable(name="numberCar")int numberCar){
        final boolean deleted=busService.delete(numberCar);
        return deleted
                ? new ResponseEntity<>(HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("info")
    public String information() {
        return String.format("Проект работает: %s", busService.readAll().size());

    }
}

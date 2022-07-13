package com.burtsev.city.model;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.annotation.processing.Generated;

public class Bus {

    private int numberCar;
    private String numberRoute;
    private String state;
    private String brand;
    private int year;
    private int placeSit;
    private int placeAll;
    private int placeCurrent;

    public Bus(int numberCar, String numberRoute, String state, String brand, int year, int placeSit, int placeAll, int placeCurrent) {
        this.numberCar = numberCar;
        this.numberRoute = numberRoute;
        this.state = state;
        this.brand = brand;
        this.year = year;
        this.placeSit = placeSit;
        this.placeAll = placeAll;
        this.placeCurrent = placeCurrent;
    }

    public Bus(){
    }

    public void setNumberCar(int numberCar) {
        this.numberCar = numberCar;
    }

    public int getNumberCar(){
        return numberCar;
    }

    public void setNumberRoute(){ //numbers of routes
        this.numberRoute=numberRoute;
    }
    public String getNumberRoute(){
        return numberRoute;
    }

    public void setState(){ //state
        this.state=state;
    }
    public String getState(){
        return state;
    }

    public void setBrand(){ //brand
        this.brand=brand;
    }

    public String getBrand(){
        return brand;
    }

    public void setYear(){ //year
        this.year=year;
    }
    public int getYear(){
        return year;
    }

    public void setPlaceSit(){ //place for sitting
        this.placeSit=year;
    }
    public int getPlaceSit(){
        return placeSit;
    }

    public void setPlaceAll(){ //all places
        this.placeAll=placeAll;
    }
    public int getPlaceAll(){
        return placeAll;
    }

    public void setPlaceCurrent(){ //current state of places
        this.placeCurrent=placeCurrent;
    }
    public int getPlaceCurrent(){
        return placeCurrent;
    }

    public String toString(){
        return "NumberCar:"+getNumberCar()+ "Brand:"+getBrand() + "NumberRoute:"
                + getNumberRoute() + "Year:" + getYear()
                + "Places for sitting:"+getPlaceSit()
                + "All available places:"+getPlaceAll()
                + "Taken places:"+getPlaceCurrent()
                + "Current state of the bus:"+getState();
    }

}

// all this is new
/*class  App {
    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();
        Bus bus = new Bus("204","14","doors are open","ford",2002,6,12,4);
        String str = mapper.writeValueAsString(bus);
        System.out.println(str);

        //bus2 = mapper.readValue(str, Bus.class);
        //System.out.println(bus2.getBrand());

    }

}

 */


/*package com.burtsev.city.repository;

import com.burtsev.city.model.Bus;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

public class BusRepository {
    public static void main(String[] args) throws JsonProcessingException {
        //Creating a JSONObject object
        JSONObject jsonObject = new JSONObject();
        //Inserting key-value pairs into the json object


        jsonObject.put("NumberCar", "222");
        jsonObject.put("NumberRoute", "14");
        jsonObject.put("State", "Doors are open");
        jsonObject.put("Brand", "ford");
        jsonObject.put("year", "2002");
        jsonObject.put("PlaceAll", "14");
        try {
            FileWriter file = new FileWriter("C:\\Users\\Kirill\\Desktop\\json");
            file.write(jsonObject.toJSONString());
            file.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("JSON file created: "+jsonObject);



        //ObjectMapper mapper = new ObjectMapper();
        //Bus bus = new Bus("204","14","doors are open","ford",2002,6,12,4);

        //String str = mapper.writeValueAsString(bus);
        //System.out.println(str);

        //bus2 = mapper.readValue(str, Bus.class);
        //System.out.println(bus2.getBrand());

    }
}
*/
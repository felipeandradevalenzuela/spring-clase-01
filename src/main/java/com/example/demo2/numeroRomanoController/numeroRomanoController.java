package com.example.demo2.numeroRomanoController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class numeroRomanoController {
    @GetMapping("/number/{number}")
    public String intToRoman(@PathVariable int number){
        if(number < 4000000){
            if(number < 4000){
                return getRoman(number);
            }else {
                return "||" + getRoman(number/1000) + "||" + getRoman(number %1000);
            }
        }else
            return "El numero ingresado supera el limite máximo";
    }
    public String getRoman(int number){
        StringBuilder romano = new StringBuilder();
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        //HashMap<Integer, String> map = new HashMap<>();

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");


        if(map.get(number) != null)
            return map.get(number);
        else{
            while(number > 0){
                for(Map.Entry<Integer, String> entry : map.entrySet()){
                    if(entry.getKey() <= number){
                        romano.append(entry.getValue());
                        number -= entry.getKey();
                        break;
                    }
                }
            }
            return romano.toString();
        }
    }
}




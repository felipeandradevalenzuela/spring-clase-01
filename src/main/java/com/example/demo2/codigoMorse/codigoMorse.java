package com.example.demo2.codigoMorse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.LinkedHashMap;
import java.util.Locale;

public class codigoMorse {
    @GetMapping("/traductor/{message}")
    public String toMorse(@PathVariable String message){
        return tMorse(message.toUpperCase(Locale.ROOT));
    }

    public String tMorse(String msg){
        LinkedHashMap<Character, String> dicTraductor = new LinkedHashMap();
        dicTraductor.put('A', "· —");
        dicTraductor.put('B', "— · · ·");
        dicTraductor.put('C', "— · — ·");
        dicTraductor.put('D', "— · ·");
        dicTraductor.put('E', "·");
        dicTraductor.put('F', "· · — ·");
        dicTraductor.put('G', "— — ·");
        dicTraductor.put('H', "· · · ·");
        dicTraductor.put('I', "· ·");
        dicTraductor.put('J', "· — — —");
        dicTraductor.put('K', "— · —");
        dicTraductor.put('L', "· — · ·");
        dicTraductor.put('M', "— —");
        dicTraductor.put('N', "— ·");
        dicTraductor.put('Ñ', "— — · — —");
        dicTraductor.put('O', "— — —");
        dicTraductor.put('P', "· — — ·");
        dicTraductor.put('Q', "— — · —");
        dicTraductor.put('R', "· — ·");
        dicTraductor.put('S', "· · ·");
        dicTraductor.put('T', "—");
        dicTraductor.put('U', "· · —");
        dicTraductor.put('V', "· · · —");
        dicTraductor.put('W', "· — —");
        dicTraductor.put('X', "— · · —");
        dicTraductor.put('Y', "— · — —");
        dicTraductor.put('Z', "— — · ·");
        dicTraductor.put('0', "— — — — —");
        dicTraductor.put('1', "· — — — —");
        dicTraductor.put('2', "· · — — —");
        dicTraductor.put('3', "· · · — —");
        dicTraductor.put('4', "· · · · —");
        dicTraductor.put('5', "· · · · ·");
        dicTraductor.put('6', "— · · · ·");
        dicTraductor.put('7', "— — · · ·");
        dicTraductor.put('8', "— — — · ·");
        dicTraductor.put('9', "— — — — ·");
        dicTraductor.put('.', "	· — · — · —");
        dicTraductor.put('\'', ",	— — · · — —");
        dicTraductor.put('?', "· · — — · ·");
        dicTraductor.put('"', " — · · — · ");
        dicTraductor.put('/', " · · — ·");
        dicTraductor.put(' ', "//");

        String response = "";
        for(int i = 0; i<msg.length(); i++){
            response += dicTraductor.get(msg.charAt(i)) + "/";
        }
        return response;
    }
}


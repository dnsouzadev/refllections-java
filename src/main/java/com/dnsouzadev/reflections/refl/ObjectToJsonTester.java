package com.dnsouzadev.reflections.refl;

import com.dnsouzadev.reflections.Pessoa;

public class ObjectToJsonTester {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(4L, "Daniel", "2330");
        ObjectToJson objectToJson = new ObjectToJson();
        System.out.println(objectToJson.transform(pessoa));
    }
}

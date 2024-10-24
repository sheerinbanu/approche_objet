package fr.diginamic.maps;

import java.util.HashMap;

public class CreationMap {
    public static void main(String[] args) {

        Employee e1 = new Employee("Paul", 1750);
        Employee e2 = new Employee("Hicham", 1825);
        Employee e3 = new Employee("Yu", 2250);
        Employee e4 = new Employee("Ingrid", 2015);
        Employee e5 = new Employee("Chantal", 2418);

        HashMap<String, Employee> mapSalaires = new HashMap<>();
        mapSalaires.put("Paul", e1);
        mapSalaires.put("2", e2);
        mapSalaires.put("3", e3);
        mapSalaires.put("4", e4);
        mapSalaires.put("5", e5);
        System.out.println(mapSalaires.size());
    }
}

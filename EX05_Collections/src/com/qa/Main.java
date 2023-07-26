package com.qa;

import com.qa.model.Animal;
import com.qa.model.Cat;
import com.qa.model.Dog;
import com.qa.model.Rabbit;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Denis",2));
        animals.add(new Cat("Felix",3));
        animals.add(new Rabbit("Bunny",1));
        animals.add(new Dog("Rex",9));
        animals.add(new Dog("T-Rex",2));

        for (Animal animal: animals) {
            System.out.println(animal);
        }
            HashMap<String, Animal> hashMap = new HashMap<>();

            hashMap.put(animals.get(0).getName(),animals.get(0));
            hashMap.put(animals.get(1).getName(),animals.get(2));
            hashMap.put(animals.get(2).getName(),animals.get(2));
            hashMap.put(animals.get(3).getName(),animals.get(3));
            hashMap.put(animals.get(4).getName(),animals.get(4));

            HashMap<Animal, String> hashMap2 = new HashMap<>();

            hashMap2.put(animals.get(0),"This is a very cute cat");
            hashMap2.put(animals.get(1),"This is a very very cute cat");
            hashMap2.put(animals.get(2),"This is just an ordinary rabbit");
            hashMap2.put(animals.get(3),"Ouf ouf!");
            hashMap2.put(animals.get(4),"Roooooarrrr!");

        for (String key : hashMap.keySet()){
            System.out.println("Key: " + key + " Value: " +
                    hashMap.get(key));
        }

        for (Animal key : hashMap2.keySet()){
            System.out.println("Key: " + key + " Value: " +
                    hashMap2.get(key));
        }

        HashSet<Animal> set = new HashSet<>();
        //we can just add all the elements of another collection
        set.addAll(animals);

        set.add(animals.get(0)); // replaces the previous version of the cat
        set.add(animals.get(1));

        Iterator<Animal> iter = set.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        // this is the same for the animal list and the set, we
// need to iterate through everything
        System.out.println("\nFinding Denis.");
        for (Animal a : animals){
            if (a.getName().equals("Denis")){
                System.out.println(
                        "Found Denis in the ArrayList: " + a);
            }
        }

// And for a HashMap
        System.out.println("Found Denis in the HashMap: " +
                hashMap.get("Denis"));


    Collections.sort(animals);
           System.out.println("Sorted animal list");
           for (int i = 0; i < animals.size(); i++){
        System.out.println(animals.get(i));
    }

        TreeMap<String, Animal> tree = new TreeMap<>();
        tree.putAll(hashMap);

        System.out.println("TreeMap");
        for (String key : tree.keySet()){
            System.out.println("Key: " + key + " Value: " +
                    tree.get(key));
        }
    }
}
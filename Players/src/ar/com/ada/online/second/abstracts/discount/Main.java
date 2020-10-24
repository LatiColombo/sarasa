package ar.com.ada.online.second.abstracts.discount;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    private static final Random wand = new Random(); // java me pide que lo ponga como "final" pero private y static deberían alcanzar

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Cerezo"); // Neville
        list.add("Ciprés"); // Remus
        list.add("Roble"); // Hagrid
        list.add("Sauce"); // Ron
        list.add("Abeto"); // Minerva
        list.add("Sauco"); // Albus

        for (int i = 0; i < 1; i++) {
            getRandomItem(list);
        }
    }

    private static void getRandomItem(List<String> list) {
        int index = wand.nextInt(list.size());
        System.out.println("La varita que eligió a este mago es: " + list.get(index));
    }
}

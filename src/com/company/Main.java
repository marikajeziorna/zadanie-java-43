package com.company;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        File fileNew = new File("numberFile.txt");
        fileNew.createNewFile();

        Set<Integer> numbersSet = new TreeSet<>();
        ArrayList<Integer> numbersList = new ArrayList<>();

        Scanner scanner = new Scanner(fileNew);

        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            numbersSet.add(number);
            numbersList.add(number);
        }

        Iterator<Integer> iterator = numbersSet.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next + " - number of occurrences: " + Collections.frequency(numbersList, next));
        }
    }
}

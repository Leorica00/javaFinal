package org.example.quiz3.task1quiz;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

            if (arrayList.get(i) == 3) {
                arrayList.remove(i);
            }
        }

            arrayList.set(1, 99);
            System.out.println(arrayList.get(1));

            Collections.sort(arrayList);
            //------------------------------------------------------------

            LinkedList<Object> list = new LinkedList<>();
            ListOperations listOps = new ListOperations();

            listOps.addIntoList(list, 1);
            listOps.addIntoList(list, 2.5);
            listOps.addIntoList(list, 3.14);
            listOps.addIntoList(list, "Hello");
            listOps.addIntoList(list, 10);

            listOps.removeFromList(list, "Hello");

            LinkedList<Object> reversedList = listOps.reverseList(list);
            System.out.println("Reversed List: " + reversedList);

            LinkedList<Object> orderedList = listOps.listOrder(list);
            System.out.println("Ordered List: " + orderedList);

            ArrayList<Number> numberList = new ArrayList<>();
            double sum = 0.0;

            for (Object obj : list) {
                if (obj instanceof Integer) {
                    numberList.add((Integer) obj);
                } else if (obj instanceof Float) {
                    numberList.add((Float) obj);
                } else if (obj instanceof Double) {
                    numberList.add((Double) obj);
                }
            }

            for (Number num : numberList) {
                sum += num.doubleValue();
            }

            System.out.println("Number List: " + numberList);
            System.out.println("Sum of Numbers: " + sum);
//-----------------------------------------------------------------------------------------------

        }
    }




package org.example.quiz3.task1quiz;

import java.util.Iterator;
import java.util.LinkedList;

class ListOperations {
    public LinkedList<Object> addIntoList(LinkedList<Object> list, Object element) {
        list.add(element);
        return list;
    }

    public LinkedList<Object> removeFromList(LinkedList<Object> list, Object element) {
        list.remove(element);
        return list;
    }

    public LinkedList<Object> reverseList(LinkedList<Object> list) {
        LinkedList<Object> reversedList = new LinkedList<>();
        Iterator<Object> iterator = list.descendingIterator();
        while (iterator.hasNext()) {
            reversedList.add(iterator.next());
        }
        return reversedList;
    }

    public LinkedList<Object> listOrder(LinkedList<Object> list) {
        // You can implement sorting logic here if needed.
        // This method currently just returns the list as is.
        return list;
    }
}

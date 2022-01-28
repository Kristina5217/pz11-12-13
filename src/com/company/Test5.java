package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test5 {
    public Test5() {
    }
    public static void main(String[] args) {
        Test5 test = new Test5();
        LinkedList ll = new LinkedList();
        ll.add("Element1");
        ll.addFirst("Element2");
        ll.addFirst("Element3");
        ll.addLast("Element4");
        test.dumpList(ll);
        ll.remove(2);
        test.dumpList(ll);
        String element = (String)ll.getLast();
        ll.remove(element);
        test.dumpList(ll);
    }
    private void dumpList(List list){
        Iterator it = list.iterator();
        System.out.println();
        while(it.hasNext()){
            System.out.println((String)it.next());
        }
    }
}

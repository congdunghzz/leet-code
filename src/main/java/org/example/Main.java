package org.example;

import java.util.*;

public class Main {


    public static int handle (Queue<Integer> queue, int k){
        int result = 0;
        int len = queue.size();
        while (queue.peek() != null){

            int prev = 0;

            for (int i = 0; i < k; i++){
                if (queue.peek() == null ) break;

                if (i == 0){
                    prev = queue.peek();
                    result += Math.abs(queue.poll() - 1);
                    System.out.println("up");
                }else {
                    int temp = queue.peek();
                    result += Math.abs(queue.poll() - prev);
                    prev = temp;

                }
            }
            result += Math.abs(prev - 1);
            System.out.println("down");
            System.out.println();
        }
        return result;
    }
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(2);
        list.add(3);
        list.add(4);
        list = list.stream().sorted(Comparator.reverseOrder()).toList();
        Queue queue = new ArrayDeque();
        queue.addAll(list);
   /*     queue.offer(2);
        queue.offer(2);
        queue.offer(2);
        queue.offer(2);
        queue.offer(2);
        queue.offer(2);
        queue.offer(2);*/
        int k = 2;
        System.out.println(handle(queue, k));
    }
}
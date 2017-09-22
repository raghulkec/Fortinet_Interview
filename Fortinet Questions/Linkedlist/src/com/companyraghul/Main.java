package com.companyraghul;

public class Main
         {
    Node head;

    public static class Node{
        int data;
        Node next = null;

        public Node (int data) {
            this.data = data;
            this.next = null;
        }

    }


    public int[] print(Node head) {
        Node current = head;
        int [] array = new int[4];
        int i = 0;
        while(current != null) {
            array[i] = current.data;
            System.out.println(current.data);
            current = current.next;
            i++;
        }
        System.out.println(current);

return array;

    }

    public Node reverse(Node head) {
        Node current = head;
        Node previous = null;
        Node later = null;
        while(current != null) {
            later = current.next;
            current.next = previous;
            previous = current;
            current = later;

        }
        return previous;
    }

}


// Time Complexity  is   O(n)
// Space Complexitiy is  O(1)

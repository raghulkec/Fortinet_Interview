package com.companyraghul;

import org.junit.Test;

import static org.junit.Assert.*;

    public class MainTest {
        @Test
        public void testmain() throws Exception {
            int []  array;
            Main.Node head = new Main.Node(1);
            Main.Node second = new Main.Node(8);
            Main.Node third = new Main.Node(6);
            Main.Node forth = new Main.Node(5);

            head.next = second;
            second.next = third;
            third.next = forth;

            Main linked = new Main();
            linked.print(head);
            Main.Node reverselist = linked.reverse(head);
           array =  linked.print(reverselist);
            assertArrayEquals(new int[]{5,6,8,1},array);

        }


    }


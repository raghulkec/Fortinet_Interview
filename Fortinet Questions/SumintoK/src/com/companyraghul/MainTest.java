package com.companyraghul;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void test() throws Exception {

       Main main = new Main();
        int k =3;
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(6);
        list.add(3);
        list.add(6);
        list.add(6);
        list.add(3);

        boolean result = main.separate(list,k);
        System.out.println(result);
    }

}
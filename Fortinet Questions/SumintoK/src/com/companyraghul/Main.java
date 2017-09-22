package com.companyraghul;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {


    public  boolean separate(List<Integer> list, int k){


      Collections.sort(list);
      Collections.reverse(list);
      List<Integer> subset = new ArrayList<>(k) ;
        boolean result = false;

      for(int i=0; i<k; i++ ){
          subset.add(list.get(i));
      }

      for (int i=k; i< list.size(); i++){

          subset.set(subset.indexOf(Collections.min(subset)),Collections.min(subset) + list.get(i));

      }

        int first = subset.get(0);
        for (int s : subset) {
            if(s ==(first))
                result = true;
            else
                result = false;
        }

        return result;

    }


}


// Time Complexity  is   O(2n)
// Space Complexitiy is  O(3n)

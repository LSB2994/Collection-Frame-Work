package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Pisey", "K!J", "James"));

        // aslist
//        names = new ArrayList<>(Arrays.asList("James","Pisey","K1J"));

        //initail for your own cusstom class
        names = new ArrayList<>(){{
           add("KOKO");
           add("KIKI");
           add("JORK");
        }};

        // for loop
        System.out.println("======== for loop ===========");
        for (int i=0; i<names.size();i++){
            System.out.println("Name "+(i+1)+": "+names.get(i));
        }

        // for each
        for (String name : names){
            System.out.println("=======For Ech loop=====");
            System.out.println("Name: "+name);
        }
        // set to update element by index
        names.set(1,"Polla");

        // remove() by element
        names.remove("JORK");

        // add first
        names.add(0,"KOKI");

        //clear() clear all element
//       names.clear();
//        System.out.println("Name size: "+names.size());
//        System.out.println("Name at index 2 is "+names.get(2));
//        System.out.println("KOKO at index "+names.indexOf("KOKO"));
        System.out.println("Name: "+names);
    }
}

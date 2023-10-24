package List;

import java.util.Enumeration;
import java.util.Vector;

public class VictorDemo {
    public static void main(String[] args) {
        Vector<String> allNames = new Vector<>(){{
            add("sambath");
            add("sambo");
            add("samdach");
        }};

        // allNames.clear()
        allNames.remove("sambath");
//        allNames.remove("samdach");
        allNames.add(1,"James sbone");
        allNames.set(0,"Gosling");
        System.out.println("All names: "+allNames);

        System.out.println("================= Enumeration ============");
        Enumeration<String> names = allNames.elements();
        while (names.hasMoreElements()){
            System.out.println("Name is: "+names.nextElement());
        }
    }
}

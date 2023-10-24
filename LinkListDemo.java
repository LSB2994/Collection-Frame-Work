package List;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListDemo {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>(){{
            add("sambath");
            add("sambo");
            add("samdach");
        }};
        names.add("somb'ar");
        names.set(0,"sophea");
        names.remove("samdach");

        String popItem = names.pop();
        names.push("Iterator");
        System.out.println("Pop item is "+popItem);
        System.out.println("All names are "+names);

        Iterator<String> itr = names.iterator();
        while (itr.hasNext()){
            System.out.println(" "+itr.next());
        }
    }
}

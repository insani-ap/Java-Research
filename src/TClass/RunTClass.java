package TClass;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RunTClass {
    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("List 1");
        items.add("List 2");

        Collection<String> collections = new ArrayList<>();
        collections.add("List 3");
        collections.add("List 4");
        collections.add("List 5");

        List<String> itemFromMethod = TClass.returnSomething(items);
        for (String res : itemFromMethod) {
            System.out.println(res);
        }

        List<String> itemALl = TClass.addAndReturn(items, collections);
        for (String res : itemALl) {
            System.out.println(res);
        }
    }
}

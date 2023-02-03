package TClass;

import java.util.Collection;
import java.util.List;

public class TClass {
    public static <T> List<T> returnSomething(List<T> items) {
        return items;
    }

    public static <T> List<T> addAndReturn(List<T> items, Collection<T> collection) {
        if (items != null)
            items.addAll(collection);
        return items;
    }
}

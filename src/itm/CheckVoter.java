package itm;

import java.util.HashMap;
import java.util.Map;

//HashTables

public class CheckVoter {

    private static Map<String, Boolean> voted = new HashMap<>();

    private static void checkVoter(String name) {
        if (voted.containsKey(name)) {
            System.out.println("Kick this " + name + " out");
        } else {
            voted.put(name, true);
            System.out.println("Let them vote");
        }

    }

    public static void main(String[] args) {
        checkVoter("Tom");
        checkVoter("Alex");
        checkVoter("Alex");
    }
}

import p1.A;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alex", "lex@gamil.com");
        User user2 = new User("Neymar", "my@gamil.com");
        User user3 = new User("Bun", "hj@gamil.com");
        User user4 = new User("Coach", "joe@gamil.com");

        List<User> list = new ArrayList<>();
        list.add(user1);
        ArrayList<User> arrayList = new ArrayList<>();
        arrayList.add(user2);

        p1.A.foo();
        p1.B.foo();

        TreeSet<User> userTreeSet = new TreeSet<>();

        userTreeSet.add(user1);
        userTreeSet.add(user2);
        userTreeSet.add(user3);
        userTreeSet.add(user4);
        System.out.println(userTreeSet.size());

        userTreeSet.forEach(user -> {
            System.out.println(user);
        });
    }
}
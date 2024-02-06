public class User implements Comparable<User>{
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(User user) {
        System.out.println("comp " + this.name.compareTo(user.getName()));

        return this.name.compareTo(user.getName());
    }

    @Override
    public String toString() {
        return "User { "+this.name + " => " + this.email + " }";
    }
}

//public class User {
//    private String name;
//    private String email;
//
//    public User(String name, String email) {
//        this.name = name;
//        this.email = email;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//}

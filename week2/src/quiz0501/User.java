//Quiz 5-1 prob 20
package quiz0501;

public class User {
    String name;
    int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void printUserInfo() {
        System.out.println("Username: "+this.name+", UserID: "+this.id);
    }

    public static void main(String[] args) {
        User user1 = new User("Alice", 101);
        user1.printUserInfo();
    }
}

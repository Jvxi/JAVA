import java.util.*;

public class main {
    //一个main方法
    public static void main(String[] args) {
        System.out.println("Hello JAVA!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}

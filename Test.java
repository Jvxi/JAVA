import java.util.*;

public class Test {
    //一个main方法
    public static void main(String[] args) {
        System.out.println("Hello JAVA!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        sc.close(); // 关闭 Scanner 释放资源
    }
}

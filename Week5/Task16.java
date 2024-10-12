package Week5;

public class Task16 {
    public static void main(String[] args) {
        // 假设的字符串，包含名字和姓氏
        String s = "John Doe";

        // 使用 indexOf 方法找到空格的索引
        int spaceIndex = s.indexOf(" ");

        // 使用 substring 方法提取名字（空格前的部分）
        String firstName = s.substring(0, spaceIndex);

        // 使用 substring 方法提取姓氏（空格后的部分），加1是为了跳过空格
        String lastName = s.substring(spaceIndex + 1);

        // 输出结果
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
    }
}
// Task N3:  Three lines are given:
// 
// String str1 = "123";
// String str2 = "456";
// String str3 = "789";
// Add the of these rows as integers.

public class Values {
    public static void main(String[] args) {

        String str1 = "123";
        String str2 = "456";
        String str3 = "789";

        int int1 = Integer.parseInt(str1);
        int int2 = Integer.parseInt(str2);
        int int3 = Integer.parseInt(str3);

        int sum = int1 + int2 + int3;
        System.out.println("Sum: " + sum);
    }
}


package hash;

import java.util.Arrays;

/**
 * hash
 * Find_Same_Prefix.java
 * https://programmers.co.kr/learn/courses/30/lessons/42577
 * 전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때,
 * 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.
 *
 * @Author : henry
 * @Data : 2019-03-31
 * @Version : 1.0
 */
public class Find_Same_Prefix {
    private static String[] case1 = new String[]{"119", "97674223", "1195524421"};
    private static String[] case2 = new String[]{"123", "456", "789"};
    private static String[] case3 = new String[]{"12", "123", "1235", "567", "88"};

    public static void main(String[] args) {
        Find_Same_Prefix f = new Find_Same_Prefix();
        System.out.println(f.solution(case1));
        System.out.println(f.solution(case2));
        System.out.println(f.solution(case3));
    }

    private boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length - 1; i++) {
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false;
            }
            for (int j = 1; j < phone_book.length - 1; j++) {
                if (phone_book[j + 1].startsWith(phone_book[j])) {
                    return false;
                }
            }
        }
        return true;
    }
}

package hash;

import java.util.HashMap;
import java.util.Map;

/**
 * hash
 * Hash_Key_Comparison.java
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
 * 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 * @Author : henry
 * @Data : 2019-03-31
 * @Version : 1.0
 */
public class Hash_Key_Comparison {
    public static String[] part1 = new String[]{"mislav", "stanko", "mislav", "ana"};
    public static String[] compl1 = new String[]{"stanko", "mislav", "ana"};

    public static void main(String[] args) {
        Hash_Key_Comparison solution = new Hash_Key_Comparison();
        System.out.println(solution.solution(part1, compl1));
    }
    private String solution(String [] participants, String[] completions){
        String result = null;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < participants.length; i++) {
            if (!map.containsKey(participants[i])) {
                map.put(participants[i], 1);
            }else {
                map.put(participants[i], map.get(participants[i]) + 1);
            }
        }
        for (int j = 0; j < completions.length; j++) {
            if (map.get(completions[j])>1) {
                map.replace(completions[j], map.get(completions[j])-1);
            }else{
                map.remove(completions[j]);
            }
        }
        for(String key : map.keySet()){
            result = key;
        }
        return result;
    }

}

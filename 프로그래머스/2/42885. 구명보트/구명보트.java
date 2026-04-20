import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people); // 몸무게 순으로 정렬

        int left = 0; // 가장 가벼운 사람의 인덱스
        int right = people.length - 1; // 가장 무거운 사람의 인덱스

        while (left <= right) {
            // 가장 가벼운 사람과 가장 무거운 사람을 같이 태울 수 있는지 확인
            if (people[left] + people[right] <= limit) {
                left++; // 같이 탈 수 있으면 가벼운 사람도 태워서 보냄
            }
            // 무거운 사람은 (같이 타든 혼자 타든) 이번 보트에 무조건 나감
            right--; 
            answer++; // 보트 사용 횟수 증가
        }

        return answer;
    }
}
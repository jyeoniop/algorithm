
import java.util.Arrays;
import java.util.Scanner;




public class Main{
static int N, M;
    static int[] input, result;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        input = new int[N];
        visited = new boolean[N];
        result = new int[M];

        for (int i = 0; i < N; i++) {
            input[i] = sc.nextInt();
        }

        // 사전 순 출력을 위해 정렬
        Arrays.sort(input);

        dfs(0);
        System.out.print(sb);
    }

    static void dfs(int depth) {
        if (depth == M) {
            for (int val : result) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }

        int lastUsed = 0; // 이전에 사용한 값을 저장하여 중복 방지
        for (int i = 0; i < N; i++) {
            // 이미 방문했거나, 현재 depth에서 이미 선택했던 숫자와 같다면 건너뜀
            if (visited[i] || input[i] == lastUsed) {
                continue;
            }

            visited[i] = true;
            result[depth] = input[i];
            lastUsed = input[i]; // 방금 사용한 숫자를 기록
            dfs(depth + 1);
            visited[i] = false;
        }
    }


}
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        
        int count = 1; // 지나가는 방의 개수 (층수)
        int range = 1; // 해당 층의 최댓값

        if (N == 1) {
            System.out.println(1);
        } else {
            // 입력받은 N이 현재 층의 최댓값보다 클 때까지 반복
            while (range < N) {
                // 다음 층의 최댓값은 현재 최댓값 + (6 * 현재 층수)
                range = range + (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }
}
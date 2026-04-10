
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine()," ");
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        Queue<long[]> q = new LinkedList<>();
        q.add(new long[]{a,1});
        
        while(!q.isEmpty()){
            long[] cur = q.poll();
            if(cur[0]==b){
                System.out.println(cur[1]);
                return;
            }
            if(cur[0]*2<=b) q.add(new long[]{cur[0]*2,cur[1]+1});
            if(cur[0]*10+1<=b) q.add(new long[]{cur[0]*10+1,cur[1]+1});
        }

        System.out.println(-1);
    }
}
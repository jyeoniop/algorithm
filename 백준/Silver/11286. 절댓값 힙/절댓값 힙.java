import java.io.*;
import java.util.*;

public class Main{

    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder sb = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)-> {
            int absA = Math.abs(a);
            int absB = Math.abs(b);

            // 1. 절댓값이 같으면 실제 값이 작은 것을 우선 (오름차순)
            if (absA == absB) {
                return Integer.compare(a, b);
            }
            // 2. 절댓값이 다르면 절댓값이 작은 것을 우선 (오름차순)
            return Integer.compare(absA, absB);
        });
        
        for(int i=0;i<N;i++){
            int x = Integer.parseInt(br.readLine());
            if(x==0){
                if(heap.isEmpty()){
                    sb.append("0\n");
                }else{
                    sb.append(heap.poll()).append("\n");
                }
            }else{
                heap.add(x);
            }
        }


        System.out.println(sb.toString());
        
        
    }

    
    }

import java.util.*;
import java.util.stream.Collectors;

// import javax.sound.midi.SysexMessage;

import java.io.*;

public class Main{
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph;
    public static void dfs(int c){
        visited[c] = true;
        for(int value : graph.get(c)){
            if(!visited[value]){
                dfs(value);
            }
        }
    }
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] ground = new int[N*M];

        int idx = 0;
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<M;j++){
                ground[idx] = (Integer.parseInt(st.nextToken()));
                idx++;
            }
        }
        
        long ressulttime = Long.MAX_VALUE;
        int resulthet = 0;
        for(int i=0;i<257;i++){
            long put = 0, remove = 0;
            for(int ht : ground){
                if(ht<=i){
                    put += (i-ht);
                }
                else{
                    remove += (ht-i);
                }
            }
            if(put<=B+remove){
                long curtime = put +remove*2;
                if(curtime<=ressulttime){
                    ressulttime = curtime;
                    resulthet = Math.max(resulthet,i);
                }
            }

        }





        sb.append(ressulttime).append(" ").append(resulthet);


        
        System.out.println(sb.toString());
        
    }

    
    }

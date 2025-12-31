import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{
    static  HashSet<Integer> hs;
    static StringBuilder sb = new StringBuilder();
    private static void add(int num) {
        hs.add(num);
    }
    private static void remove(int num) {
        hs.remove(num);
    }
    private static void check(int num) {
        if(hs.contains(num)){
            sb.append(1).append("\n");
        }else{
            sb.append(0).append("\n");
        }
    }
    private static void toggle(int num) {
        if(hs.contains(num)){
            hs.remove(num);
        }else{
            hs.add(num);
        }
    }
    private static void all() {
        for(int i=1;i<21;i++){
            hs.add(i);
        }
    }
    private static void empty() {
        hs.clear();
    }
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int M  = Integer.parseInt(br.readLine());
        hs = new HashSet<>();
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine()," ");
            String str = st.nextToken();
            int num=0;
            if(st.hasMoreTokens()){
                num = Integer.parseInt(st.nextToken());
            }

            switch (str) {
                case "add":
                    add(num);
                    break;
                case "remove":
                    remove(num);
                    break;
                case "check":
                    check(num);
                    break;
                case "toggle":
                    toggle(num);
                    break;
                case "all":
                    all();
                    break;
                case "empty":
                    empty();
                    break;
                default:
                    throw new AssertionError();
            }


        }
   




        
        System.out.println(sb.toString());
    }

    

    
    }

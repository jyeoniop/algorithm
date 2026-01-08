import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{
    static int L;
    static int C;
    static boolean[] visited;
    static Character[] result;
    static StringBuilder sb = new StringBuilder();
    static Character[] chs;
    static Character[] c = {'a', 'e','i','o','u'};
    public static boolean  isvowe(char c){
        return "aeiou".indexOf(c) !=-1;
    }
    public static boolean  chkc(Character[] result){
        int len = result.length;
        int countv= 0;
        for (char ch : result) {
            if(isvowe(ch)==true){
                countv++;
            }   
        }
        if(countv<1||(len-2)<countv){
            return false;
        }else{
            return true;
        }
    }
    public static void dfs(int start, int depth){
        if(depth == L){
            if(chkc(result)){
                for (Character ch : result) {
                    sb.append(ch);
                }sb.append("\n");
            }
            return;
        }
        for(int i=start;i<C;i++){
            visited[i]= true;
            result[depth] = chs[i];
            dfs(i+1, depth+1);
            visited[i] = false;
            

        }
    }

    public static void main(String args[]) throws Exception{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        L  =Integer.parseInt(st.nextToken());
        C  =Integer.parseInt(st.nextToken());
        chs = new Character[C];
        visited = new boolean[C+1];
        result = new Character[L];

        st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<C;i++){
            chs[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(chs);
        dfs(0,0);


        System.out.println(sb.toString());
    
    }
}
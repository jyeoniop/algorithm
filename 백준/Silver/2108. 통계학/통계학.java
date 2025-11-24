import java.util.*;
import java.io.*;
// import java.time.LocalDate;
import java.lang.reflect.Array;


public class Main{
    public static int getavg(TreeMap<Integer, Integer> nummap,int N){
        double sum=0.0;

        for(Integer key : nummap.keySet()){
            sum += nummap.get(key)*key;
        }
        double avg = Math.round(sum/N);
        
        return (int)avg;
    }
    public static int getmiddle(TreeMap<Integer, Integer> nummap,int N){
        int mindex = N/2, count=0;
        for(Integer key : nummap.keySet()){
            count += nummap.get(key);
            if(mindex+1<=count){
                return key;
            }
        }
        return 0;
    }
    public static int getfreq(TreeMap<Integer, Integer> nummap, int N){
        int max=0;
        List<Integer> min =  new ArrayList<>();

        for(Integer key : nummap.keySet()){
            if(max<nummap.get(key)){
                max = nummap.get(key);
            }
        }
        for(Integer key : nummap.keySet()){
            if(nummap.get(key)==max){
                min.add(key);
            }
        }
        
        if(min.size()>1){
            Collections.sort(min);
            return min.get(1);
        }
        else{
            return min.get(0);
        }
    }
    public static int getminus(TreeMap<Integer, Integer> nummap, int N){
        int min = nummap.firstKey();
        int max = nummap.lastKey();
        if((max-min)<0){
            return -(max-min);
        }
        else if((max-min)==0){return 0;}
        else{return max-min;}
        
    }
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;
        
        int N = Integer.parseInt(br.readLine());
        TreeMap<Integer, Integer> nummap = new TreeMap<>();

        for(int i=0;i<N;i++){
            int num = Integer.parseInt(br.readLine());
            if(nummap.containsKey(num)){
                nummap.put(num, nummap.get(num)+1);
            }
            else{
                nummap.put(num,1);
            }
        }
        sb.append(getavg(nummap, N)).append("\n");
        sb.append(getmiddle(nummap, N)).append("\n");
        sb.append(getfreq(nummap, N)).append("\n");
        sb.append(getminus(nummap, N)).append("\n");
        

        System.out.println(sb.toString());
        
    }

    
    }

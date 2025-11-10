import java.util.*;
import java.io.*;
// import java.time.LocalDate;
import java.lang.reflect.Array;

class Position implements Comparable<Position>{
    private int x;
    private int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
@Override
public int compareTo(Position other){
    if(this.x != other.x){
        return this.x-other.x;
    }
    return this.y - other.y;
}


}
public class Main{

    public static void main(String args[]) throws Exception{

        

        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;
        
        int N = Integer.parseInt(br.readLine());

        List<Position> positions = new ArrayList<>();

        for(int i =0;i<N;i++){
            st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            positions.add(new Position(x, y));
        }
        
        Collections.sort(positions);

        for(Position p : positions){
            sb.append(p.getX()).append(" ").append(p.getY()).append("\n");
        }



        System.out.println(sb.toString());
   


        }

       
    }





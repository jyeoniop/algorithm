import java.util.*;


import java.io.*;
class Member implements Comparable<Member>{
    private int age;
    private String name;
    private int order;

    public Member(int age, String name, int order){
        this.age = age;
        this.name = name;
        this.order = order;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Member other){
        if(this.age!=other.age){
            return this.age- other.age;
        }
        else{
            return this.order-other.order;
        }

        
    }
    @Override
    public String toString(){
        return age+" "+name;
    }


}
public class Main{

    public static void main(String args[]) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;

        List<Member> members = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());
        
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine(), " ");
             
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            members.add(new Member(age,name, i));
            
        }
        Collections.sort(members);
        
        for(Member member:members){
            sb.append(member.toString()).append("\n");
        }

        System.out.print(sb.toString());
        





    }
       
    }





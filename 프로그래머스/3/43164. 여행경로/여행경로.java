import java.util.*;
class Solution {
    static boolean[] visited;
    static boolean isReached = false;
    static String[][] tickets;
    static String[] answer;
    public void dfs(String now, int cnt, List<String> course){
        if(cnt==tickets.length){
            isReached = true;
            answer = course.toArray(new String[0]);
            return;
        }
        for(int i=0;i<tickets.length;i++){
            if(tickets[i][0].equals(now)&&!visited[i]){
                course.add(tickets[i][1]);
                visited[i] = true;
                
                dfs(tickets[i][1], cnt+1, course);
                
                if(isReached){
                   return; 
                }
                
                course.remove(course.size()-1);
                visited[i] = false;
            }
        }
    }
    public String[] solution(String[][] tickets) {
        Arrays.sort(tickets, (a,b)->{
            if(a[0].equals(b[0]))return a[1].compareTo(b[1]);
            return a[0].compareTo(b[0]);
        });
        
        this.tickets = tickets;
        visited = new boolean[tickets.length];
        
        List<String> course = new ArrayList<>();
        
        course.add("ICN");
        dfs("ICN", 0, course);
        
        
        
        
        return answer;
    }
}
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        
        int max = health;
        
        int[] time = new int[attacks[attacks.length-1][0]+1];
        for (int[] a : attacks) {
            time[a[0]] = -1*a[1];
        }
        for(int i=1;i<=attacks[attacks.length-1][0];i++){
            if(time[i] ==0){
                time[i] = bandage[1];
            }
        }

        int count  =0;
        for (int i : time) {
            if(i==bandage[1]){
                count++;
                if(count==bandage[0]){
                    i += bandage[2];
                    count=0;
                }
            }else{
                count = 0;
            }
            // System.out.println(i);
            health = Math.min((health+i), max);
            if(health<=0)return -1;
        }

        
        answer = health;
        return answer;
    }
}
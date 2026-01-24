class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int[] stu = new int[n+1];
        
        for(int i=1;i<=n;i++){
            stu[i] = 1;
        }
        
        for(int i:lost){
            stu[i] -=1;
        }
        
        for(int i:reserve){
            stu[i] +=1;
        }
        
        for(int i=1;i<=n;i++){
            if(stu[i]==0){
                if((i-1)>=1&&stu[i-1]==2){
                    stu[i]++;
                    stu[i-1]--;
                }else if((i+1)<=n&&stu[i+1]==2){
                    stu[i]++;
                    stu[i+1]--;
                }
            }
        }
        int count = 0;
        for(int i:stu){
            if(i>=1)count++;
        }
        
        answer = count;
        return answer;
    }
}
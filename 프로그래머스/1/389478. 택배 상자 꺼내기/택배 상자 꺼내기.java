class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        
        int[][] box = new int[(n/w)+1][w];
        for(int i=0;i<n;i++){
            int floor = i/w;
            int idx = (floor%2==0)?i%w:w-1-i%w;
            box[floor][idx] = 1;
            // System.out.println(floor+"  "+idx);


        }

        int tarfloor = (num-1)/w;
        int taridx = (tarfloor%2==0)?(num-1)%w:w-1-(num-1)%w;
        // System.out.println(tarfloor+"  "+taridx);
        for(int i=tarfloor;i<=n/w;i++){
            answer += box[i][taridx];
        }
        return answer;
    }
}
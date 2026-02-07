class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int max = Math.max(bill[0], bill[1]);
        int min = Math.min(bill[0], bill[1]);

        int tarmax = Math.max(wallet[0], wallet[1]);
        int tarmin = Math.min(wallet[0], wallet[1]);


        while(max>tarmax||min>tarmin){
            answer++;
            max /=2;
            if(max<min){
                int temp = max;
                max = min;
                min = temp;
            }
        }
        
        return answer;
    }
}
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        
                StringBuilder sb = new StringBuilder();

        boolean[][] map = new boolean[n][n];
        String[] result = new String[n];
        for(int i=0;i<n;i++){
            String padded1 = String.format("%"+n+"s", Integer.toBinaryString(arr1[i])).replace(' ','0');
            String padded2 = String.format("%"+n+"s", Integer.toBinaryString(arr2[i])).replace(' ','0');

            for(int j=0;j<n;j++){
                if(((padded1.charAt(j)-'0')|(padded2.charAt(j)-'0'))==1){
                    sb.append("#");
                }else{
                    sb.append(" ");
                }
            }result[i] = sb.toString();
            sb.setLength(0);

        }
        answer = result;
        
        
        return answer;
    }
}
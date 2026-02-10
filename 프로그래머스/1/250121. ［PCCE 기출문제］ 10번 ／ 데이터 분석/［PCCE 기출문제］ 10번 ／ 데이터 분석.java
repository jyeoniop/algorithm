import java.util.*;
class Solution {
    public int number(String str){
        if(str.equals("code"))return 0;
        else if(str.equals("date")) return 1;
        else if(str.equals("maximum")) return 2;
        else if(str.equals("remain")) return 3;
        else return -1;
    }
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        
        ArrayList<int[]> arr = new ArrayList<>();

        int extint = number(ext);
        int sortint = number(sort_by);

        int index = 0;
        for (int[] datum : data) {
            if(datum[extint]<val_ext){
                arr.add(datum);
            }
        }
        answer = new int[arr.size()][4];
        for (int i=0;i<arr.size();i++) {
            answer[i] = arr.get(i);
        }

        Arrays.sort(answer, (a,b)-> {
            return a[sortint]-b[sortint];
        });

        
        return answer;
    }
}
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        int days = -1;
        if(a>1)days+=31;
        if(a>2)days+=29;
        if(a>3)days+=31;
        if(a>4)days+=30;
        if(a>5)days+=31;
        if(a>6)days+=30;
        if(a>7)days+=31;
        if(a>8)days+=31;
        if(a>9)days+=30;
        if(a>10)days+=31;
        if(a>11)days+=30;
        
        days+=b;
        days%=7;
        switch (days){
            case 0:return "FRI";
            case 1:return "SAT";
            case 2:return "SUN";
            case 3:return "MON";
            case 4:return "TUE";
            case 5:return "WED";
            case 6:return "THU";
        }

        
        return answer;
    }
}
class Solution {
    public int getsco(int sco){
        int returnsco = 0;
        if(sco<4){
            return -1*Math.abs(sco-4);
        }else{
            return Math.abs(sco-4);
        }
    }
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        
        int sco1 = 0;
        int sco2 = 0;
        int sco3 = 0;
        int sco4 = 0;

        for(int i=0;i<survey.length;i++){
            switch (survey[i]) {
                case "RT"->{sco1 += getsco(choices[i]);}
                case "TR"->{sco1 -= getsco(choices[i]);}
                case "CF"->{sco2 += getsco(choices[i]);}
                case "FC"->{sco2 -= getsco(choices[i]);}
                case "JM"->{sco3 += getsco(choices[i]);}
                case "MJ"->{sco3 -= getsco(choices[i]);}
                case "AN"->{sco4 += getsco(choices[i]);}
                case "NA"->{sco4 -= getsco(choices[i]);}

            }
        }
        
        if(sco1<=0)answer+="R";
        else answer+="T";

        if(sco2<=0)answer+="C";
        else answer+="F";

        if(sco3<=0)answer+="J";
        else answer+="M";

        if(sco4<=0)answer+="A";
        else answer+="N";
        
        
        return answer;
    }
}
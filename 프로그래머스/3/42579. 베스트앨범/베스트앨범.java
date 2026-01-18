import java.util.*;
class Solution {
    class Song implements Comparable<Song>{
        int id;
        int plays;
        Song(int id, int plays){this.id = id; this.plays = plays;}
        
        @Override
        public int compareTo(Song o){
            if(o.plays==this.plays) return this.id-o.id;
            return o.plays-this.plays;
        }
        
    }
    
    public int[] solution(String[] genres, int[] plays) {
        // int[] answer = {};
        
        HashMap<String, Integer> sumplay = new HashMap<>();
        HashMap<String, List<Song>> gensong = new HashMap<>();
        
        for(int i=0;i<genres.length;i++){
            sumplay.put(genres[i], sumplay.getOrDefault(genres[i],0)+plays[i]);
            if(!gensong.containsKey(genres[i])) gensong.put(genres[i], new ArrayList<>());
            gensong.get(genres[i]).add(new Song(i, plays[i]));
        }
        
        List<String> sortgen = new ArrayList<>(sumplay.keySet());
        sortgen.sort((a,b)->sumplay.get(b)-sumplay.get(a));
        
        List<Integer> result = new ArrayList<>();
        
        for(String gen : sortgen){
            List<Song> songs = gensong.get(gen);
            Collections.sort(songs);
            
            for(int i=0;i<Math.min(songs.size(),2);i++){
                result.add(songs.get(i).id);
            }
        }
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i); 
        }
        return answer;
    }
}
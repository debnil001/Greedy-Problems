class Solution {
    void kill(String senate,boolean map[],char c,int index){
        while(true){
            if(senate.charAt(index)==c && !map[index]){
                map[index]=true;
                return;
            }
            index=(index+1)%senate.length();
        }
    }
    public String predictPartyVictory(String senate) {
        int DCount=0,RCount=0;
        int n=senate.length();
        for(int i=0;i<n;i++){
            char c=senate.charAt(i);
            if(c=='D')   DCount++;
            else RCount++;
        }
        int index=0;
        boolean map[]=new boolean[n];
        while(RCount>0 && DCount>0){
            char c=senate.charAt(index);
            if(!map[index]){
                if(c=='D'){
                    kill(senate,map,'R',(index+1)%n);
                    RCount--;
                }
                else{
                    kill(senate,map,'D',(index+1)%n);
                    DCount--;
                }
            }
            index=(index+1)%n;
        }
        return RCount==0?"Dire":"Radiant";
    }
}
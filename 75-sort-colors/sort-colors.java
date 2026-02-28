class Solution {
    public void sortColors(int[] arr2) {
        int zero=0,one=0,two=0;
        for(int i:arr2){
            if(i==0) zero++;
            else if(i==1) one++;
            else two++;
        }
        int index =0;
        while(zero > 0){ arr2[index++]=0; zero--;}
        while(one > 0) {arr2[index++]=1; one--;}
        while(two > 0) {arr2[index++]=2;two--;}

    }
}
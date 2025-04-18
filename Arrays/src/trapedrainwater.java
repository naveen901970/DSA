public class trapedrainwater {


    public static int trapedrainwater(int hight[]) {
        int n=hight.length;

        int leftmax[]=new int[n];
        leftmax[0]=hight[0];
        for (int i = 1; i < n; i++){
            leftmax[i]=Math.max(hight[i], leftmax[i-1]);
        }
        int rightmax[]=new int[n];
        rightmax[n-1]=hight[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]=Math.max(hight[i], rightmax[i+1]);
        }
        for (int i = 0; i <= n; i++) {
            System.err.println(rightmax[i]+"||"+leftmax[i]);
            
        }

    int trappedwater=0;
    for (int i = 0; i <n; i++) {
        int waterlevel=Math.min(leftmax[i],rightmax[i]);
        trappedwater=trappedwater+(waterlevel-hight[i]);

    }
    return trappedwater;

    }
public static void main(String[] args) {
    int hight[]={4,2,0,6,3,2,5};
    System.out.println(trapedrainwater(hight));
}
}

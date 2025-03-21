public class Bitmanupulation{

public static int getIthbit(int n,int i) {
    int bitwise=1<<i;
    if((n&bitwise)==0){
        return 0;
    }else{
        return 1;
    }
}
public static int setIthbit(int n, int i) {
    int bitwise=1<<i;
    int newbit=n|bitwise;
    return newbit;
}
public static int clearIthbit(int n, int i) {
    int bitwise=~(1<<i);
    int newbit=n&bitwise;
    return newbit;
}
public static int updateIthbit(int n, int i ,int upbit) {
    // if(upbit==0){
    //      return  clearIthbit(n, i);
    // }else{
    //     return setIthbit(n,i);
    // }
    n=clearIthbit(n, i);
    int newbit=upbit<<i;
    return n|newbit;


} 
public static int clearlastIthbits(int n, int i) {
    int bitwise=(~0<<i);
    return n&bitwise;
}
public static int clearIthrangeofbits(int n, int i,int j){
    int a=~0<<(j+1);
    int b=(1<<i)-1;//2^i-1
    int Aorb=a|b;
    return n&Aorb;
//n=10=1010
//11110000000;
//00000000111;
//Aorb=11110000111;
//n&Aorb=0010
}
public static int countthe1sinbit(int n ,int i) {
    int count=0;
    
    while (n>0) { 
        if((n&1)!=0){
            count++;
        }
        n=n>>1;
    }
    return count;
}
public static boolean  nisapowerof2bit(int n) {
    
    if(n>1){
        if((n&(n-1))==0)
          return true;
          else
          return false;
    }
    System.out.println(" not valid number");
    return false;
 
}
public static int fastexponantial(int a,int n) {
    int ans=1;
    while (n>0) { 
        if((n  & 1)!=0){
            ans=ans*a;
        }
        a=a*a;
        n=n>>1;
    }
    return ans;
}
public static int modularExponentiation(int a, int n, int m) {
    int ans = 1;
    a = a % m; // Reduce a if it's larger than m

    while (n > 0) {
        if ((n & 1) != 0) { // If the current bit is 1
            ans = (ans * a) % m;
        }
        a = (a * a) % m; // Square a and take modulo
        n = n >> 1; // Right shift n (divide by 2)
    }
    return ans;
}













    public static void main(String[] args) throws Exception {
      System.out.println(getIthbit(10, 2));
      System.out.println(setIthbit(10, 2));
      System.out.println(clearIthbit(10, 2));
      System.out.println(updateIthbit(10, 3,1));
      System.out.println(clearlastIthbits(10, 2));
      System.out.println(clearIthrangeofbits(10, 2,7));
      
      System.out.println( nisapowerof2bit(2));
     
      System.out.println(  countthe1sinbit(15,1));
     
      System.out.println(  fastexponantial(15,2));
     
      System.out.println(   modularExponentiation(3,5,7));
    }
}

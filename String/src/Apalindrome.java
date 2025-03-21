public class Apalindrome {


    public static boolean palindromearenot(String str) {
        int n=str.length();
        for (int i = 0; i <str.length()/2; i++) {
            if(str.charAt(i)!= str.charAt(n-1-i)){
                return  false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String str="raecar";
        boolean isstring=palindromearenot(str);
        if(isstring){
            System.out.println("it is sting");
        }else{
            System.out.println("it is not a string");
        }
    }
}

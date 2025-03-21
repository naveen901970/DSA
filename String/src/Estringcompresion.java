public class Estringcompresion {
    public static String strigcompresion(String str) {
        String newStrin="";
        for (int i = 0; i <str.length();i++){
           Integer count=1;
          while (i<str.length()-1&&str.charAt(i)==str.charAt(i+1)){
            count++;
            i++;
          }
          newStrin+=str.charAt(i);
         
          if(count>1){
             newStrin+=count.toString();
          }
              
          }
          return  newStrin;
        }
            
        
    
    public static void main(String[] args) {
        String letter="aaaabbbbbccccddddd";
       System.out.println(strigcompresion(letter));
    }
}

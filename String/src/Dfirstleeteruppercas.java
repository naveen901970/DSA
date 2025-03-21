public class Dfirstleeteruppercas {
    public static String uppercase(String str) {
        StringBuilder sb= new StringBuilder();
        char ch=str.toUpperCase().charAt(0);
        sb.append(ch);
        for(int i = 1; i <str.length(); i++) {
            if(str.charAt(i)==' '&& i<str.length()-1){
                  sb.append(str.charAt(i));
                  i++;
                  sb.append(str.toUpperCase().charAt(i));
            }else{
                sb.append(str.charAt(i)); 
            }
                
            
        }
        return  sb.toString();
    }
    public static void main(String[] args) {
        String sentence="hi, i am naveen os i am happy to tell this";
        String seee=uppercase(sentence);
        System.out.println(seee);
    }
}

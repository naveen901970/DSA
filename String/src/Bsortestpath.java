
import java.util.Scanner;

public class Bsortestpath {
    
public static float  findsortestpath(String route) {
    int y=0;
    int x=0;
    for (int i = 0; i <route.length(); i++) {
        char letter=route.charAt(i);

        if(letter=='N'){
            y++;
        }
        else if(letter=='S'){
             y--;
        }
        else if(letter=='E'){
            x++;
        }else{
            x--;
        }
    }
    int x2=x*x;
    int y2=y*y;
    return (float)Math.sqrt(x2+y2);
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String route="WNEENESENNN";
        float value=findsortestpath(route);
        System.out.println(value);
    }
}

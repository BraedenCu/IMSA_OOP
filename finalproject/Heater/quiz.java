import java.util.*;

public class quiz
{
    public quiz() {
        
    }
    public void q1() {
        String s = "*****";
        for(int i = s.length(); i>0; i-=1) {
            String y = "";
            for(int x = 0; x<i; x+=1) {
                y+="*";
            }
            System.out.println(y);
        }
        
    }
    public void q2() {
        ArrayList<Integer> item100 = new ArrayList<Integer>();
        item100.add(1);
        item100.add(2);
        item100.add(3);
        Iterator<Integer> it = item100.iterator();
        while(it.hasNext()) {
            int x = it.next();
            System.out.println(x);
        } 
    }
    public void q3() {
        if(1==1 && 2==2) {
            System.out.println("wee good");
        }
    }
    public void q4() {
        int d = -1;
        int []v = {-1, -1, -1, -1, -1};
        for (int i=0; i<v.length; i++) {
            d=d*2;
            v[i]=v[i]*d;
        }
        for(int i : v) {
            System.out.println(i);
        }
    }
}

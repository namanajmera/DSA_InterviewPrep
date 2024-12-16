import commonFunctions.CommonFunctions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MinimumOperationsMakeStringsEqual {
    public static void main(String[] args) {
        String a = CommonFunctions.getString();
        String b = CommonFunctions.getString();
        int result = minimumOperations(a, b);
        System.out.println(result);
    }

    public static int minimumOperations(String a, String b)
    {
        if(a.length()!=b.length())
            return -1;

        int count=0,n=a.length();

        if(a.length()==1)
        {
            if(a.charAt(0)==b.charAt(0))
                return 0;
            else
                return 1;
        }
        for(int i=0;i<n/2;i++)
        {
            HashMap<Character,Integer> map=new HashMap<Character,Integer>();
            map.put(a.charAt(i),map.getOrDefault(a.charAt(i),0)+1);
            map.put(a.charAt(n-i-1),map.getOrDefault(a.charAt(n-i-1),0)+1);
            map.put(b.charAt(i),map.getOrDefault(b.charAt(i),0)+1);
            map.put(b.charAt(n-i-1),map.getOrDefault(b.charAt(n-i-1),0)+1);
            if(map.size()==4) count+=2;
            else if(map.size()==3)
            {
                if(a.charAt(i)==a.charAt(n-i-1))
                    count+=2;
                else
                    count++;
            }
            else if(map.size()==2)
            {
                int c=0;

                for(int value:map.values())
                {
                    c=value;
                    break;                }

                if(c%2!=0)
                    count++;
            }
        }
        if(a.length()%2!=0)
        {
            if(a.charAt(n/2)!=b.charAt(n/2))
                count++;
        }
        return count;
    }
}

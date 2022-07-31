import java.util.Arrays;

public class p6 {
    p6 (String[] words, String target)
    {
        int f = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                f++;
            }
        }
        f= words.length - f;
        int place =0;
        String [] str = new String[f];
        for(int j=0;j<words.length;j++)
        {
        if(!words[j].equals(target))
            {
            str[place]=words[j];
            place++;
            }
        }
        System.out.println(Arrays.toString(str));

    }
}

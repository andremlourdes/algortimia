package recurrence;

public class RC21
{public static String InversaoFrase(String X, int N)
{if (N==0)
    return X;
else
    return X.charAt(N)+InversaoFrase(X.substring(0, N),N-1);}
    public static void main(String[] args)
    {int N;
        String X = "adreuqse a arap atierid ad";
        N=X.length()-1;
        System.out.println(InversaoFrase(X, N));}}
package recurrence;

public class RC20
{public static int Acker(int m, int n)
{if (m==0)
    return 1;
else
if (m==1 && n==0)
    return 2;
else
if (m>1 && n==0)
    return m+2;
else
    return Acker(Acker(m-1,n),n-1);}
    public static void main(String[] args)
    {int m=1, n=0;
        System.out.printf("Ackermann(%d,%d)=%d\n", m, n, Acker(m,n));
        m=3; n=0;
        System.out.printf("Ackermann(%d,%d)=%d\n", m, n, Acker(m, n));
        m = 10; n = 2;
        System.out.printf("Ackermann(%d,%d)=%d\n", m, n, Acker(m,
                n));}}

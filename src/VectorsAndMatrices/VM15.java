package VectorsAndMatrices;

public class VM15
{public static void main(String[] args)
{int [] A={13,21,45,63};
    int[] B = { 1, 10, 25, 35, 55, 80, 90 };
    int N=A.length, M=B.length;
    int[] C = new int[N+ M];
    int I, J, K;
    I = J = K = 0;
    while (I <= N - 1 && J <= M - 1)
    {if (A[I] <= B[J])
    {C[K] = A[I];
        I++;}
    else
    {C[K] = B[J];
        J++;}
        K++;}
    if (I>N-1)
    {for (int T=J; T<=M-1; T++)
    {C[K] = B[T];
        K++;}}
    else
    {for (int T=I; T<=N-1; T++)
    {C[K] = A[T];
        K++;}}
    for (K=0; K<=N+M-1; K++)
        System.out.printf("%d%3s",C[K]," ");
    System.out.println();}}
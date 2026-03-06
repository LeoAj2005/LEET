class Main {
    public static int Program (int x, int n) {
        int result = 1;
        if (n<0)
        {
            x = x/2;
            n = -n;
        }
        while (n >0)
        {
            if (n%2==1)
            {
                result = result * x;
            }
            x = x*x;
            n = n/2;
        }
        return result;
    }
    public static void main(String[] args)
    {
        int x;
        int n;
        int ans = Program(2,2);
        System.out.println(ans);    }
}

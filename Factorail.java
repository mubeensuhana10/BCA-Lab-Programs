class Factorial
{
    public static void main(String[] args)
    {
        int count=1;
        long fact=1;
        System.out.println("Number\t\tFactorial");
        while(count <= 10)
        {
            fact *= count;
            System.out.println(count + "\t\t" + fact);
            count++;
        }
    }
}

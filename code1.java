import java.util.Scanner;
interface Team
{
 int add(int a, int b)
}

class TeamImpl implements Team{
    public int add(int a,int b)
    {
        return a+b;
    }
}
class TeamLeader
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbes to sum");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        TeamImpl t1=new TeamImpl();
        int sum=n1+n2;
        t1.add(n1, n2);
        System.out.println(sum);
    }
}

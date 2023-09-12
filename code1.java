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
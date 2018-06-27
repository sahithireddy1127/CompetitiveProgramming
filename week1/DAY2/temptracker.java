public class temptracker {
    Integer size,sum;
    Integer max,min;
    Integer mode;
    int[] f=new int[111];
    public temptracker()
    {
        size=0;
        sum=0;
        max=Integer.MIN_VALUE;
        min=Integer.MAX_VALUE;
        mode=0;
    }
    public void insert(Integer a)
    {
        if(a>=0)
        {
            sum=sum+a;
            if(max<a)
            {
                max=a;
            }
            if(min>a)
            {
                min=a;
            }
            f[a]++;
            if(f[a]>f[mode])
            {
                mode=a;
            }
            size++;
        }
    }
    public Integer get_min()
    {
        if(size>0)
            return min;
        else
            return null;
    }
    public Integer get_max()
    {
        if(size>0)
            return max;
        else
            return null;
    }
    public Integer get_mode()
    {
        if(size>0)
            return f[mode];
        else
            return null;
    }
    public Double get_mean()
    {
        if(size>0)
        {
            return Double.parseDouble(sum/size+"");
        }
        else
         return 0.0;
    }
    public static void main(String[] args) {
        temptracker t=new temptracker();
        t.insert(50);
        t.insert(3);
        t.insert(5);
        t.insert(2);
        
        System.out.println(t.get_max());
        System.out.println(t.get_min());
        System.out.println(t.get_mode());
        System.out.println(t.get_mean());
    }
}

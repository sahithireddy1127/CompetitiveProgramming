import java.util.*;
import java.io.*;
class Meetings implements Comparable<Meeting>
{
    public int st;
    public int et;
    public Meetings(int st,int et)
    {
        this.st=st;
        this.et=et;
    }
    public int getSt()
    {
        return st;
    }
    public int getEt()
    {
        return et;
    }
    public void setSt(int st)
    {
        this.st=st;
    }
    public void setEt(int et)
    {
        this.et=et;
    }
    public int compareTo(Meetings m)
    {
     if(this.st>m.st)
     {
        return 1;
     }
     else if(this.st==m.st)
     {
         return 0;
     }
     else
     {
         return -1;
     }
    }

     @Override
    public String toString() {
        return "("+getSt()+","+getEt()+")";
    }
}
public class MergingMeetTimes {



    public ArrayList<Meetings> mergeMeeting(ArrayList<Meetings> a)
    {
        ArrayList<Meetings> result=new ArrayList<>();
        for(int i=0;i<a.size()-1;i++)
        {
            if(a.get(i).getEt()>=a.get(i+1).getSt())
            {
                if(a.get(i).getEt()>=a.get(i+1).getEt()){
                    a.get(i+1).setSt(a.get(i).getSt());
                    a.get(i+1).setEt(a.get(i).getEt());

                }
                else {
                    a.get(i+1).setSt(a.get(i).getSt());
                }

                a.get(i).setSt(Integer.MIN_VALUE);
                a.get(i).setEt(Integer.MIN_VALUE);
            }
        }
        for (int i =0; i<a.size(); i++) {
            if(a.get(i).getSt()!=Integer.MIN_VALUE){
                result.add(new Meetings( a.get(i).getSt(),a.get(i).getEt() ));
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        ArrayList<Meetings> a=new ArrayList<>();
        a.add(new Meetings(1,3));
        a.add(new Meetings(2,6));
      
        a.add(new Meetings(7,9));

        Collections.sort(a);
        MergingMeetTimes mt=new MergingMeetTimes();
        System.out.println(mt.mergeMeeting(a));

    }
}

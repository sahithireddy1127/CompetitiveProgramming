import java.util.Hashtable;

public class InflightEntertainment {
    public boolean findMovies(int flight_time, int [] movie){

        Hashtable<Integer,Integer> hash = new Hashtable<>();

        for (int i=0; i<movie.length; i++) {

            if(hash.get(flight_time-movie[i])==null){
                hash.put(movie[i],1);
            }
            else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        
        int flightLength = 12;
        int[] movieLengths = {6,6,2,20,12,4,1,3};
       
        


        InflightEntertainment inf = new InflightEntertainment();
        System.out.println(inf.findMovies(flightLength,movieLengths));
    }
}
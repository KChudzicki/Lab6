import java.util.StringTokenizer;

public class DataToken {
    public static void main(String[] args) {
        StringTokenizer data;

        String  wybranaData= "02/01/1998";
        data = new StringTokenizer(wybranaData,"/");
        System.out.println("DD: " + data.nextToken());
        System.out.println("MM: " + data.nextToken());
        System.out.println("RR: " + data.nextToken());



    }
}

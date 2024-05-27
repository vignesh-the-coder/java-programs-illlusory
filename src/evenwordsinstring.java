public class evenwordsinstring {
    public static void printing(String s)
    {
        for(String word : s.split(" "))
            if(word.length() % 2 == 0)
                System.out.println(word);
    }
    public static void main (String[] args){
        String s = "I am Hero of AimL Department";
        printing(s);
    }
}

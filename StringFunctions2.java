public class StringFunctions2 {
    public static void main(String args[]){
        String[] words = {"funk", "chunk", "furry","baconator"};

        // starts with method
        for(String w:words){
            if(w.startsWith("fu"))
            System.out.println(w + "Starts with fu");
        }
    }
}

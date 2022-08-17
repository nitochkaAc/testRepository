public class Polyndrom {

   /* public static void main(String[] args) {
        Polyndrom p = new Polyndrom();
        String[] arr = {"abc","car","ada","racecar","cool"};
        System.out.println(p.firstPolyndrome(arr));
    }
*/

    public String firstPolyndrome(String[] words){
        for (String w : words){
           if(isPoli(w)) return w;
        }
        return "";
    }

    public boolean isPoli(String words){
        for (int i = 0; i < words.length()/2; i++)
        {
            if (words.charAt(i)!=words.charAt(words.length()-1-i)) {
                return false;
            }

        }
        return true;
    }
}

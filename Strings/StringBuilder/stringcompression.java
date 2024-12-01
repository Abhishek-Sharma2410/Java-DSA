public class stringcompression{
    public static String stringCompression(String str){
        StringBuilder sb = new StringBuilder("");
        int count;
        str = str.toLowerCase();
        for(int i=0; i<str.length(); i++){
            char letter = str.charAt(i);
            sb.append(letter);
            count = 1;
            while(i<str.length() && (str.charAt(i)==letter)){
                count++;
                i++;
            }
            if(count > 1) sb.append(String.valueOf(count));
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str = "aaabbcccdd";
        System.out.println(stringCompression(str));
    }
}
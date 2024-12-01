public class stringbuilder{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Abhishek");
        System.out.println(sb.length());
        System.out.println(sb.insert(5,"not"));
        System.out.println(sb.delete(5,8));
        System.out.println(sb.reverse());
        sb.reverse();
        System.out.println(sb.append(" is learning DSA in java"));
    }
}
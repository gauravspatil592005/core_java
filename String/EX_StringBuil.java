public class EX_StringBuil {
    public static void main(String[] args) {
StringBuilder sb= new StringBuilder("gaurav");
sb.append(" patil");
sb.insert(0,"hello ");
sb.delete(4,6);
System.out.println(sb.reverse());
System.out.println(sb.length());

 System.out.println(sb);
    }
}

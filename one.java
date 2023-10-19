public class one {
    public static void main(String[] args) {
        foo(args);
    }

    public static void foo(String[] str){
        String [] strings = str;

        for (int i=0; i<strings.length; i++){
            System.out.println(strings[i]);
        }
    }
}
package equalsAndHashCode.string;

class Runner {
    public static void main(String[] args) {
        String s1 = new String("we");
        String s2 = new String("we");

        System.out.println("first:");
        System.out.println(s1==s2);
        System.out.println("second:");
        System.out.println(s1.equals(s2));
        System.out.println("=====================================");


        String s3 = "er";
        String s4 = "er";

        System.out.println("first:");
        System.out.println(s3==s4);
        System.out.println("second:");
        System.out.println(s3.equals(s4));
    }
}

package equalsAndHashCode;

class Runner {
    public static void main(String[] args) {
        Person person1 = new Person(1, "First", "Last");
        Person person2 = new Person(1, "First", "Last");
        Person person3 = new Person(1, "First", "Last");

        System.out.println(person1.equals(person1));
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
    }
}

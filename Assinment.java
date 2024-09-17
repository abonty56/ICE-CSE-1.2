public class Test{
    int roll;
    static String name;
    Test(){
        String name;
    }
    Test(int roll, String name){
        //code to execute
    }
    public static String getName() {
        name = "Tanha";
        return name;
    }

    public static void main(String[] args) {

        Test person1 = new Test();
        person1.name = getName();
        System.out.println("Person 1 - Name: " + person1.name);
    }
}

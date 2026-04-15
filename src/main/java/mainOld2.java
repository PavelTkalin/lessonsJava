public class mainOld2 {


    public static void main(String[] args) {

        UsaUser userAmerica = new UsaUser("Gena", 20);
        System.out.println(userAmerica.name);
        System.out.println(userAmerica.age);
        System.out.println(userAmerica.isAdult());
        userAmerica.sayMyName(userAmerica.name);

        RuUser userRussia = new RuUser("Vassily", 17);
        System.out.println(userRussia.name);
        System.out.println(userRussia.age);
        System.out.println(userRussia.isAdult());
        userRussia.sayMyName(userRussia.name);


    }


}

abstract class User {

    int ageOfAdult;
    int age;
    String name;

    public User(String name, int age) {

        this.age = age;
        this.name = name;
    }

    public Boolean isAdult() {


        return this.age >= ageOfAdult;
    }


}

class UsaUser extends User implements vocal {

    int ageOfAdult = 21;

    public UsaUser(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayMyName(String name) {
        System.out.println(name);
    }
}

class RuUser extends User implements vocal {

    int ageOfAdult = 18;

    public RuUser(String name, int age) {
        super(name, age);
    }

    @Override
    public void sayMyName(String name) {
        System.out.println(name);
    }
}

interface vocal {

    public void sayMyName(String name);


}




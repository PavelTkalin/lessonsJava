public class main {

    public static void main(String[] args) {
        User child = new User("Vlad", 12);
        User father = new User("Oleg", 42, child);
        User grandfather = new User("Vladimir", 72, father);
        father.printChildName();
        child.printChildName();
        grandfather.printGrandsonName();
    }

    //аргумент child надо предварительно создать
}

class User {

    String name;
    int age;
    User child;

    public User(String name, int age, User child) {
        this.name = name;
        this.age = age;
        this.child = child;

    }
//может быть валидация данных в конструкторе

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printChildName() {
        if (hasChild()) {
            System.out.println(child.name);
        } else {
            System.out.println("There is no child");
        }

    }

    public void printGrandsonName() {
        if (hasGrandson()) {
            System.out.println(child.child.name);
        } else {
            System.out.println("There is no grandson");
        }

    }

    public boolean hasChild() {

        return child != null;

    }

    public boolean hasGrandson() {

        if (child == null) {
            return false;
        } else if (child.hasChild()) {
            return true;

        } else return false;

    }

    // если функция возвращает булевое значение то return мы можем написать одной строчкой
    //пересмотреть линкед лист с этой точки зрения реального мира
    //HW написать метод который будет выводить возраст внука

}


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();

        // добавим в список ряд элементов
        states.add("Германия");
        states.add("Франция");
        states.add(states.size(), "Великобритания"); // добавляем на последнее место
        states.add(0,"Испания"); // добавляем на первое место
        states.add(1, "Италия"); // добавляем элемент по индексу 1

        System.out.printf("В списке %d элементов \n", states.size());
        System.out.println(states.get(1));
        states.set(1, "Дания"); //меняем значение  массиве
        for(String state : states){

            System.out.println(state);
        }
        // проверка на наличие элемента в списке
        if(states.contains("Германия")){

            System.out.println("Список содержит государство Германия");
        }

        states.remove("Германия");
        states.remove(0); // удаление первого элемента
        states.remove(states.size()-1); // удаление последнего элемента

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Mike"));
        people.add(0,new Person("Tom"));
        people.add(states.size(),new Person("Nick"));
        people.remove(1); // удаление второго элемента

        for(Person p : people){
            System.out.println(p.getName());
        }
        Person first = people.get(0);
        System.out.println(first.getName()); // вывод первого элемента
    }
}
class Person{

    private String name;
    public Person(String value){

        name=value;
    }
    String getName(){return name;}
}

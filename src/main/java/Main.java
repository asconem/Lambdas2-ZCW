import java.util.ArrayList;
import java.util.List;

public class Main implements CheckPerson {

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();
        Person person1 = new Person("Trey Anastasio", 55, Person.Sex.MALE, "trey@phish.com");
        Person person2 = new Person("Rick Mitarotonda", 29, Person.Sex.MALE, "rick@goosetheband.com");
        Person person3 = new Person("Carrie Brownstein", 45, Person.Sex.FEMALE, "cbrownstein@sleaterkinney.com");
        Person person4 = new Person("Jenny Lewis", 44, Person.Sex.FEMALE, "jlew@jennylewis.com");
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);

    }

    @Override
    public boolean test(Person p) {
        return false;
    }
}
package Lesson5;



public class Lesson5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mycompany.com", "89231235678", 30000, 30);
        persArray[1] = new Person("Chudinov Pavel", "Manager", "chupa@mycompany.com", "89231235679", 38000, 25);
        persArray[2] = new Person("Fedorov Anton", "HR", "feant@mycompany.com", "89231235680", 40000, 45);
        persArray[3] = new Person("Andreeva Anna", "Manager", "ananna@mycompany.com", "89231235681", 33000, 42);
        persArray[4] = new Person("Melnikov Konstantin", "Director", "melkon@mycompany.com", "89231235601", 80000, 58);

        info(persArray, 40);

    }

    static void info(Person pers[], int vybor) {
        for (int i = 0; i <pers.length; i++) {
            if (pers[i].age >= vybor) {
                System.out.printf("Информация по сотруднику %s", pers[i].name);
                System.out.println();
                System.out.printf("Возраст - %d, емайл - %s, телефон - %s, зарплата - %d, должность - %s", pers[i].age, pers[i].email, pers[i].phone, pers[i].salary, pers[i].spot);
                System.out.println();
            }
        }
    }

}

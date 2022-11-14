public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 12;
        if (age >= 18) {
            System.out.println("Поздравление пользователя с совершеннолетием");
        } else {
            System.out.println("Совершеннолетие не наступило");
        }
        System.out.println("Задание 2");
        int ageHuman = 25;
        if (ageHuman >= 7 && ageHuman < 18) {
            System.out.println("Человек ходит в школу");
        }
        if (ageHuman > 18 && ageHuman < 24) {
            System.out.println("Человек закончил школу, пора идти в университет");
        } else {
            System.out.println("Человек закончил университет, пора искать работу");
        }

        System.out.println("Задание 3");
        int passengers = 101;
        if (passengers <= 60) {
            System.out.println("В вагоне остались сидячие и стоячие места");
        }
        if (passengers > 60 && passengers <= 101) {
            System.out.println("В вагоне остались только стоячие места");
        } else
            System.out.println("В вагоне не осталось места");

        System.out.println("Задание 4");
        int ageHuman4 = 13;
        if (ageHuman4 >= 2 && ageHuman4 <= 6) {
            System.out.println("Если возраст человека равен " + ageHuman4 + " , то ему нужно ходить в детский сад");
        }
        if (ageHuman4 >= 7 && ageHuman4 <= 17) {
            System.out.println("Если возраст человека равен " + ageHuman4 + " , то ему нужно ходить в школу");
        }
        if (ageHuman4 >= 18 && ageHuman4 <= 23) {
            System.out.println("Если возраст человека равен " + ageHuman4 + " , то ему нужно ходить в университет");
        }
        if (ageHuman4 >= 24) {
            System.out.println("Если возраст человека равен " + ageHuman4 + " , то ему нужно ходить на работу");
        }
        System.out.println("Задание 4");
        int childAage = 14;
        if (childAage < 5) {
            System.out.println("Ребенок не может кататься на атракционе");
        }
        if (childAage > 5 && childAage < 14) {
            System.out.println("Ребенок может кататься на атракционе, только в сопровождении взрослого.");
        }
        if (childAage >= 14) {
            System.out.println("Ребенок может кататься на атракционе, без сопровождении взрослого.");
        }
        System.out.println("Задание 5");
        int one = 9;
        int two = 8;
        int free = 10;
        if (one > two && one > free) {
            System.out.println(one);
        }
           else if (two > one && two > free) {
                System.out.println(two);
            }

        else {
            System.out.println(free);
        }




    }
}

















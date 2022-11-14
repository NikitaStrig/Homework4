public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 12;
        if (age >= 18) {
            System.out.println("Поздравление пользователя с совершеннолетием");
        }
        else {
            System.out.println("Совершеннолетие не наступило");
        }
        System.out.println("Задание 2");
        int ageHuman = 25;
        if (ageHuman >= 7 && ageHuman < 18) {
            System.out.println("Человек ходит в школу");
        }
        if (ageHuman > 18 && ageHuman < 24) {
            System.out.println("Человек закончил школу, пора идти в университет");
        }
        else {
            System.out.println("Человек закончил университет, пора искать работу");
        }

        System.out.println("Задание 3");
        int passengers = 101;
        if (passengers <= 60){
            System.out.println("В вагоне остались сидячие и стоячие места");
        }
        if (passengers > 60 && passengers <= 101){
            System.out.println("В вагоне остались только стоячие места");
        }
        else
            System.out.println("В вагоне не осталось места");
    }
}




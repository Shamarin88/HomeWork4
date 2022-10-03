import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");

        int age = 24;

        if (age >= 18) {
            System.out.println("Поздравляем Вас с совершеннолетием");
        }
            if (age < 18) {
                System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
            }

            // Задание 2
        System.out.println("Задание 2");

            if (age >= 7 && age < 18) {
                System.out.println("Ребенок ходит в школу");
            }
            if (age >= 18 && age < 24) {
                System.out.println("Человек уже закончил школу и может отправляться в университет");
            }
            if (age >= 24) {
                System.out.println("Человек окончил университет и ему пора искать первую работу");
            }

            // Задание 3
        System.out.println("Задание 3");

            int trainCapacity = 65;

            if (trainCapacity <= 60) {
                System.out.println("В вагоне есть сидячие место");
            }
            if (trainCapacity >= 60 && trainCapacity <= 102) {
                System.out.println("В вагоне есть стоячие место");
            }
            if (trainCapacity > 102) {
                System.out.println("Вагон уже полностью забит");
            }

            // Задание 4
        System.out.println("Задание 4");

            int age1 = 25;

            if (age1 >= 18) {
                System.out.println("Поздравляем Вас с совершеннолетием");
            } else {
                System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
            }

            // Задание 5
        System.out.println("Задание 5");

            if (age1 >= 7 && age1 < 18) {
                System.out.println("Ребенок ходит в школу");
            } else if (age1 >= 18 && age1 < 24) {
                System.out.println("Человек уже закончил школу и может отправляться в университет");
            } else if (age1 >= 24) {
                System.out.println("Человек окончил университет и ему пора искать первую работу");
            }

            // Задание 6
        System.out.println("Задание 6");

            int trainCapacity1 = 150;

            if (trainCapacity <= 60) {
                System.out.println("В вагоне есть сидячие место");
            } else if (trainCapacity1 > 60 && trainCapacity1 <= 102) {
                System.out.println("В вагоне есть стоячие место");
            } else if (trainCapacity1 > 102) {
                System.out.println("Вагон уже полностью забит");
            }

            // Задание 7
        System.out.println("Задание 7");

            int age2 = 25;

            if (age2 >= 2 && age2 < 6) {
                System.out.println("Если возраст человека равен " + age2  + ", то ему нужно ходить в детский сад");
            } else if (age2 >= 7 && age2 < 18) {
                System.out.println("Если возраст человека равен " + age2  + ", то ему нужно ходить в школу");
            } else if (age2 >= 18 && age2 < 24) {
                System.out.println("Если возраст человека равен " + age2  + ", то ему нужно ходить в университет");
            } else if (age2 >= 24) {
                System.out.println("Если возраст человека равен " + age2  + ", то ему нужно ходить на работу");
            }

            // Задание 8
        System.out.println("Задание 8");

            int age3 = 22;

            if (age3 < 5) {
                System.out.println("Ребенок не может кататься на аттракционе");
            } else if (age3 >= 5 && age3 < 14) {
                System.out.println("Ребенок может кататься в сопровождении взрослых");
            } else if (age3 > 14) {
                System.out.println("Ребенок может кататься в без сопровождения взрослых");
            }

            // Задание 9
        System.out.println("Задание 9");

        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one > three) {
            System.out.println("Наибольшее число - " + one);
        } if (two > three && two > one) {
            System.out.println("Наибольшее число - " + two);
        } if (three > one && three > two){
            System.out.println("Наибольшее число - " + three);
        } else {
            System.out.println("Числа равны");
        }
    }
}



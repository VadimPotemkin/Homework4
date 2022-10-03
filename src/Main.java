public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        byte age = 17;
        if (age >= 18) {
            System.out.println("Поздравляем вас с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
        }

        //Задание 2
        System.out.println("Задание 2");
        byte ageChildren = 25;
        if (ageChildren >= 7 && ageChildren < 18) {
            System.out.println("Ребенок ходит в школу!");
        }
        if (ageChildren >= 18 && ageChildren < 24) {
            System.out.println("Человек закончил школу и может отправляться в университет");
        } else {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        //Задание 3
        System.out.println("Задание 3");
        short common = 102;
        short seat = 60;
        short commonToday = 59;
            if (commonToday < seat) {
            System.out.println("В вагоне есть сидячее место");
        }
        if (commonToday >= seat && commonToday <common) {
            System.out.println("В вагоне есть стоячее место");
        } else {
            System.out.println("Вагон уже полностью забит!");
        }
        //Задание 4
        System.out.println("Задание 4 смотреть ветку Hm4 в задание 1 изменила");

        //Задание 5
        System.out.println("Задание 5 смотреть ветку Hm4 в задание 2 изменила");

        //Задание 6
        System.out.println("Задание 6 смотреть ветку Hm4 в задание 3 изменила");
    }}
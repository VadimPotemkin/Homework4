public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        byte age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем вас с совершеннолетием!");
        }


        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
        }

        //Задание 2
        System.out.println("Задание 2");
        byte ageChildren = 24;
        if (ageChildren >= 7 && ageChildren < 18) {
            System.out.println("Ребенок ходит в школу!");
        }
        if (ageChildren >= 18 && ageChildren < 24) {
            System.out.println("Человек закончил школу и может отправляться в университет");
        }
        if (ageChildren >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }
        //Задание 3
        System.out.println("Задание 3");
        short common = 102;
        short seat = 60;
        short commonToday = 49;
        if (commonToday > common) {
            System.out.println("Вагон уже полностью забит!");
        }
        if (commonToday < seat) {
            System.out.println("В вагоне есть сидячее место");
        }
        if (commonToday >= seat && commonToday <common) {
            System.out.println("В вагоне есть стоячее место");
        }

    }}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        var taskOne = ("Задача №1");
        System.out.println(taskOne);
        int age1 = 8;
        System.out.printf(age1 >= 18 ?
                "Если возраст человека равен " + age1 + ", то он совершеннолетний." :
                "Если возраст человека равен " + age1 + ", то он не достиг совершеннолетия, нужно немного подождать.");
        System.out.println();

        var taskTwo = ("Задача №2");
        System.out.println(taskTwo);
        int temperature = 9;
        System.out.printf(temperature >= 5 ?
                "На улице " + temperature + " можно идти без шапки." :
                "На улице " + temperature + " нужно надеть шапку.");
        System.out.println();

        var taskThree = ("Задача №3");
        System.out.println(taskThree);
        int speed = 150;
        System.out.print(speed <= 60 ?
                "Если скорость " + speed + ", то можно ездить спокойно." :
                "Если скорость " + speed + ", то придется заплатить штраф.");
        System.out.println();

        var taskFour = ("Задача №4");
        System.out.println(taskFour);
        int agePeople = 3;
        boolean canNotGoToSchool = agePeople > 24;
        if (agePeople > 2 && agePeople <= 6) {
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить в детский сад");
        }
        if (agePeople > 7 && agePeople <= 17) {
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить в школу");
        }
        if (agePeople >= 18 && agePeople <= 24) {
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить в университет");
        }
        if (canNotGoToSchool) {
            System.out.println("Если возраст человека равен " + agePeople + ", то ему нужно ходить на работу");
        }

        var taskFive = ("Задача №5");
        System.out.println(taskFive);
        int ageChild = 13;
        boolean canRide = ageChild >= 14;
        if (ageChild > 0 && ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему нельзя кататься на аттракционе.");
        }
        if (ageChild >= 5 && ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься в сопровождении взрослого.");
        }
        if (canRide) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то ему можно кататься без сопровождения взрослого.");
        }

        var taskSix = ("Задача №6");
        System.out.println(taskSix);
        int seatCarriage = 162;
        boolean seatCarriageNot = seatCarriage > 103;
        if (seatCarriage >= 0 && seatCarriage <= 60) {
            System.out.println("В вагоне есть сидячие места.");
        } else {
            System.out.println("В вагоне нет сидячих мест.");
        }
        if (seatCarriage >= 0 && seatCarriage <= 102) {
            System.out.println("В вагоне есть стоячие места.");
        } else {
            System.out.println("В вагоне нет стоячих мест.");
        }
        if (seatCarriageNot) {
            System.out.println("Вагон уже полностью забит.");
        }

        var taskSeven = ("Задача №7");
        System.out.println(taskSeven );

        int one = 28;
        int two = 1;
        int three = 5;
        int max;
        if (one >= two && one >= three) {
            max = one;
        } else if (two >= three && two >= one) {
            max = two;
        } else {
            max = three;
        }
        System.out.println(max + " большее число.");







    }

}

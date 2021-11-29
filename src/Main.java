public class Main {
    /**
     * "Створити класи (мінімум по 2 поля і одному методу),
     * які дозволять описати наступні сутності: ЛЮДИНА, СОЛДАТ, КОМАНДИР, ГЕНЕРАЛ
     * знаючи, що генерал, солдат і командир - це люди,
     * при цьому від командира залежать 3 солдат, а від генерала 2 командира.
     * Людина повинна імліментувати інтерфейс ЗДАТНИЙ_ДО_БОЙОВИХ_ДІЙ,
     * який буде мати два методи: МОЖУ_ВОЮВАТИ і ДОПОВІДАТИ.
     * Дані методи повинні викидати власне виключення, що перевірється.
     * Створити штаб (в main методі один спільний масив) з 6 солдат, 2 командирів і генерала.
     * Кожна особа повинна доповісти, у кого перебуває в підпорядкуванні і про можливість воювати."
     */
    public static void main(String[] args) {
        Human[] headquarters = new Human[9];
        /*headquarters[0] = new General("General");
        headquarters[1] = new Commander("Commander 1");
        headquarters[2] = new Commander("Commander 2");
        headquarters[3] = new Soldier("Soldier 1");
        headquarters[4] = new Soldier("Soldier 2");
        headquarters[5] = new Soldier("Soldier 3");
        headquarters[6] = new Soldier("Soldier 4");
        headquarters[7] = new Soldier("Soldier 5");
        headquarters[8] = new Soldier("Soldier 6");*/
        for (int i = 0; i < headquarters.length; ++i) {
            if (i == 0) {
                headquarters[i] = new General("General");
            } else if (i > 2) {
                headquarters[i] = new Commander("Commander " + i, headquarters[0]);
            } else if (i % 2 == 0) {
                headquarters[i] = new Soldier("Soldier " + (i - 2), headquarters[2]);
            } else {
                headquarters[i] = new Soldier("Soldier " + (i - 2), headquarters[1]);
            }
        }
        for (int i = 0; i < headquarters.length; ++i) {
            System.out.println(headquarters[i].getFullName() + headquarters[i].report());
        }
    }
}

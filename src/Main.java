public class Main {
    public static void main(String[] args) {

        //Ex1 и Ex2
        int clientOS = 1;
        int clientDeviceYear = 2015;
        int targetYear = 2015;

        if (clientOS == 1 && targetYear > clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && targetYear <= clientDeviceYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && targetYear > clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        //Ex3
        //Не нашёл несоответсвий, многоточие в заданиях обычно означает необходимость вставить переменную
        int year = 2021;

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) && year > 1584) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Ex4
        int deliveryDistance = 95;
        int deliveryTime = 0;

        if (deliveryDistance <= 20) {
            deliveryTime = 1;
        } else if (deliveryDistance <= 60) {
            deliveryTime = 2;
        } else if (deliveryDistance <= 100) {
            deliveryTime = 3;
        }

        if (deliveryTime != 0) {
            System.out.println("Потребуется дней: " + deliveryTime);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }

        //Ex5
        int monthNumber = 5;

        switch (monthNumber) {
            case 1:
                System.out.println("Январь принадлежит к сезону зима");
                break;
            case 2:
                System.out.println("Февраль принадлежит к сезону зима");
                break;
            case 3:
                System.out.println("Март принадлежит к сезону весна");
                break;
            case 4:
                System.out.println("Апрель принадлежит к сезону весна");
                break;
            case 5:
                System.out.println("Май принадлежит к сезону весна");
                break;
            case 6:
                System.out.println("Июнь принадлежит к сезону лето");
                break;
            case 7:
                System.out.println("Июль принадлежит к сезону лето");
                break;
            case 8:
                System.out.println("Август принадлежит к сезону лето");
                break;
            case 9:
                System.out.println("Сентябрь принадлежит к сезону осень");
                break;
            case 10:
                System.out.println("Октябрь принадлежит к сезону осень");
                break;
            case 11:
                System.out.println("Ноябрь принадлежит к сезону осень");
                break;
            case 12:
                System.out.println("Декабрь принадлежит к сезону зима");
                break;
            default:
                System.out.println("Введён не правильный номер месяца");
        }
    }
}
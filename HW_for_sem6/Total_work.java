package HW_for_sem6;


import java.util.*;

public class Total_work {

    // 1) Подумать над структурой класса Ноутбук для магазина
//    техники - выделить поля и методы. Реализовать в java.
// 2) Создать коллекцию ноутбуков.
// 3) Написать мапу, которая будет содержать критерий 
//    (или критерии) фильтрации и выведет
//    ноутбуки, отвечающие фильтру.
//    Пример: ОЗУ - Значение, Объем ЖД - Значение,
//    Операционная система - Значение, Цвет - Значение
// 4) Отфильтровать ноутбуки их первоначального множества 
//    и вывести проходящие по условиям.
    public static void main(String[] args) {

        Notebook laptopHP1 = new Notebook("HP12ASX","4GB","256GB","14.0'","None","Black","Plastic",101);
        Notebook laptopHP2 = new Notebook("HP15ASZ","8GB","512GB","15.6'","Win11","Silver","Metal",102);
        Notebook laptopHP3 = new Notebook("HP20JFK","16GB","512GB","15.6'","Win11","Black","Plastic",103);

        Notebook laptopLen1 = new Notebook("Lenovo-3DS","4GB","128GB","14.0'","None","Black","Plastic",1004);
        Notebook laptopLen2 = new Notebook("Lenovo-4RF","8GB","256GB","15.6'","Win10","Black","Plastic",1005);
        Notebook laptopLen3 = new Notebook("Lenovo-5BN","16GB","512GB","15.6'","None","Silver","Metal",1006);

        Notebook laptopSams1 = new Notebook("Samsung NCS3","8GB","256GB","13.3'","Win10","Grey","Metal",10002);
        Notebook laptopSams2 = new Notebook("Samsung NC7A","16GB","512GB","15.6'","Win11","Silver","Metal",10003);

        Notebook laptopAser1 = new Notebook("Aser-TI43","4GB","256GB","14.0'","None","Black","Plastic",1104);
        Notebook laptopAser2 = new Notebook("Aser-TW33","8GB","256GB","15.6'","None","Black","Plastic",1105);
        Notebook laptopAser3 = new Notebook("Aser-TD23","8GB","512GB","15.6'","Win10","Black","Plastic",1106);

        List<Notebook> notebooks = new ArrayList<>(Arrays.asList(laptopHP1, laptopHP2, laptopHP3,
                laptopLen1, laptopLen2, laptopLen3, laptopSams1, laptopSams2, laptopAser1, laptopAser2, laptopAser3));

        String param = "512GB";
        System.out.println("Заданная SSD %s".formatted(param));

        iFilter(notebooks, param);

        System.out.println("----------------------------------------------------------------");
        laptopLen2.inDelivery();

        laptopSams1.outOfStock();

        laptopAser3.expectedReceipt();

    }


    public static List<Notebook> iFilter(List <Notebook> notebooks, String param) {
        Map<Integer, Notebook> mapNotebooks = new HashMap<>();
        List<String> choiceNotebooks = new ArrayList<>();

        for (Notebook item : notebooks) {
            mapNotebooks.put(item.iD, item);
        }
        System.out.println("-----------Красивый вывод---------------------------------------------------------------");
        for (Map.Entry<Integer, Notebook> filterNotebooks : mapNotebooks.entrySet()) {
            filterNotebooks.getKey();
            filterNotebooks.getValue();
            System.out.println(filterNotebooks);
        }
        System.out.println("-----------Фильтр по заданному параметру------------------------------------------------");
        for(Notebook item : notebooks) {
            if (item.ssd.toString() == param) {
                choiceNotebooks.add(String.valueOf(item));
            }
        }
        System.out.println(choiceNotebooks);

        return null;
    }
}
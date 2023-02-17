package HW_for_sem6;

public class Notebook {
    String name;
    String ram;
    String ssd;
    String matrix;
    String os;
    String color;
    String material;
    Integer iD;

    public Notebook(String name, String ram, String ssd, String matrix, String os, String color, String material, Integer iD) {
    this.name = name;
    this.ram = ram;
    this.ssd = ssd;
    this.matrix = matrix;
    this.os = os;
    this.color = color;
    this.material = material;
    this.iD = iD;
    }

    public void inDelivery(){
        System.out.println("Модель " + this.name + " в доставке");
    }

    public void outOfStock(){
        System.out.println("Модель " + this.name + " нет в наличии");
    }

    public void expectedReceipt(){
        System.out.println("Модель " + this.name + " ожидается поступление");
    }



    @Override
    public String toString() {
        return "Модель: " + this.name + ", RAM: " + this.ram + ", SSD: " + this.ssd + ", Диагональ: " + this.matrix + ", OC: " + this.os + ", Цвет корпуса: " + this.color + ", Материал корпуса: " + this.material + ", ID: " + this.iD;
    }

}
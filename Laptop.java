public class Laptop {
    
    private  String brand;
    private int ram;
    private int hdd;
    private String os;
    private String colors;



    public Laptop(String brand, int  ram, int hdd , String os, String colors){
        this.brand = brand;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.colors = colors;
    }

       public void printDescription (){
        System.out.println(brand);
        System.out.println("Оперативная память: " + ram + " Гб");
        System.out.println("Жесткий диск: " + hdd + " Гб");
        System.out.println("Операционная система: " + os);
        System.out.println("Цвет: " + colors);
    }

        @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if(!(obj instanceof Laptop)){
            return false;
        }
        int flag = 0;
        Laptop laptop = (Laptop) obj;
        if (brand.equals(laptop.brand) || brand.equals("")){ flag++; }
        if(ram <= laptop.ram || ram == 0){ flag ++; }
        if (hdd <= laptop.hdd || hdd == 0) { flag++; }
        if (os.equals(laptop.os) || os.equals("")){ flag++; }
        if (colors.equals(laptop.colors) || colors.equals("")){ flag++; }
        if (flag == 5){
            return true;
        }
        return false;
    }


}
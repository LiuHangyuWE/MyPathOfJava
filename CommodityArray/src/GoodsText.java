import java.util.Scanner;

public class GoodsText {
    public static void main(String[] args) {
        Goods[] arr = new Goods[5];
        Goods g1 = new Goods("001", "iPhone", 5000, 100);
        Goods g2 = new Goods("002", "iPad", 7000, 50);
        Goods g3 = new Goods("003", "iMac", 9000, 300);

        //别把以下赋值写到类里成为成员变量，应该放入方法
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        Scanner scanner = new Scanner(System.in);

        for (int i = 3; i < arr.length; i++) {
            Goods goods = new Goods();
            System.out.println("scan in the code:");
            goods.setId(scanner.next());
            System.out.println("scan in the brand:");
            goods.setName(scanner.next());
            System.out.println("scan in the price:");
            goods.setPrice(scanner.nextInt());
            System.out.println("scan in the stocks:");
            goods.setStock(scanner.nextInt());
            arr[i] = goods;
        }

        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println("列表如下：");
            System.out.println(goods.getId() + "," + goods.getName() + "," + goods.getPrice() + "," + goods.getStock());
        }

    }
}

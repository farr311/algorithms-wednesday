package lesson7.dynamicarray;

public class Runner {
    public static void main(String[] args) {

        DynamicArray da = new DynamicArray();

        System.out.println(da.isEmpty());
        da.add(1);
        da.add(2);
        da.add(3);
        da.add(4);
        da.add(5);
        da.add(6);
        da.add(7);
        da.add(8);
        da.add(9);
        da.add(10);

        da.print();
        da.addAt(6, 11);
        da.print();

        da.removeAt(6);
        da.print();

        da.remove();
        da.remove();
        da.print();

        System.out.println(da.get(5));
        System.out.println(da.get(6));

        da.shrinkSize();
        da.print();

        System.out.println(da.isEmpty());

        System.out.println(da.contains(5));

        da.add(1);
        da.add(1);
        da.add(1);
        da.add(1);
        da.clear();
        da.print();
    }
}

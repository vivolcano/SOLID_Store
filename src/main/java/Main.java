public class Main {
    public static void main(String[] args) {

        Furniture sofaViktor = new Sofa("Диван Виктор", 599, SofaType.SLIDING);
        Furniture sofaElena = new Sofa("Диван Елена", 399, SofaType.NOT_SLIDING);
        Furniture kitchenTable = new Table("Кухонный стол", 200, TableType.KITCHEN);
        Furniture readTable = new Table("Журнальный стол", 199, TableType.READ);

        Order order1 = new Order();
        order1.addFurnitire(readTable, kitchenTable);
        order1.createOrder();

        Order order2 = new Order();
        order2.addFurnitire(sofaViktor);
        order2.createOrder();


    }



}

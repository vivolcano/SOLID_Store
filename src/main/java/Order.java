import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Order {

    public static final int ORDER_NUMBER_SIZE = 9999;

    protected int number;
    protected List<Furniture> furnitures;

    public Order() {
        this.number = new Random().nextInt(ORDER_NUMBER_SIZE);
        this.furnitures = new ArrayList<>();
    }

    public void addFurnitire(Furniture... furnitures) {
        Collections.addAll(this.furnitures, furnitures);
        System.out.println("Следующие товар(ы) доблен(ы) в корзину: ");
        int count = 1;
        for (Furniture furniture : furnitures) {
            System.out.println("[" + count + "]" + " " + furniture);
            count++;
        }

    }

    public String showNumber() {
        return "№ заказа: " + number;
    }

    public void showBag() {
        System.out.println("Товары в корзине:");
        this.furnitures.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "" + number;
    }

    public void createOrder() {
        OrderProcessor processor = new OrderProcessor();
        processor.confirmOrder(this);
        processor.sendToOrderHistory(this);
    }
}


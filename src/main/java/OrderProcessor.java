public class OrderProcessor {

    public void confirmOrder(Order order) {

        System.out.println("Заказ № " + order.number +  " успешно создан!");
        new ConfirmationEmailSender().sendConfirmationEmail(order);
    };

    public void sendToOrderHistory(Order order) {

        new DataBaseRepository().saveOrderToDataBase(order);
    };


}

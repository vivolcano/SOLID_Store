public class ConfirmationEmailSender {
    public void sendConfirmationEmail(Order order) {
        System.out.println("На email отправлено подверждение заказа № " + order.number);
    }
}

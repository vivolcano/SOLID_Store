public class OrderProcessorWithProcessing extends OrderProcessor implements MakeReportExl, MakeReportPdf {

    @Override
    public void confirmOrder(Order order) {

        System.out.println("Заказ № " + order.number +  " успешно создан!");
        checkEmail();
        new ConfirmationEmailSender().sendConfirmationEmail(order);

    };

    @Override
    public void sendToOrderHistory(Order order) {
        checkDatabase();
        new DataBaseRepository().saveOrderToDataBase(order);
    };

    public void checkEmail() {
        System.out.println("Проверка почты");
    }

    public void checkDatabase() {
        System.out.println("Проверка соединение с базой данных");
    }


    @Override
    public void savaExlReport() {
        System.out.println("Сохранение отчета в exl");
    }

    @Override
    public void savaPDFReport() {
        System.out.println("Сохранение отчета в pdf");
    }
}

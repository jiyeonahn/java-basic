package class1;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[2];
        ProductOrder productOrder1 = new ProductOrder();
        productOrder1.productName = "두부";
        productOrder1.price = 2000;
        productOrder1.quantity = 2;
        productOrders[0] = productOrder1;

        ProductOrder productOrder2 = new ProductOrder();
        productOrder2.productName = "김치";
        productOrder2.price = 5000;
        productOrder2.quantity = 1;
        productOrders[1] = productOrder2;

        int sum = 0;
        for (ProductOrder productOrder : productOrders) {
            System.out.println(productOrder.price);
            sum += productOrder.price;
        }
        System.out.println("총 결제 금액: " + sum);
    }
}

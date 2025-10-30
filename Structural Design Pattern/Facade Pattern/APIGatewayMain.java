class APIGateway {
    UserService userService;
    OrderService orderService;
    PaymentService paymentService;

    public APIGateway(){
        this.userService = new UserService();
        this.orderService = new OrderService();
        this.paymentService = new PaymentService();
    }

    //Task
    public String getFullOrderDetails(String userId,String orderId,String paymentId){
        String userDetails = userService.getUserDetails(userId);
        String orderDetails = orderService.getOrderDetails(orderId);
        String paymentProcessing = paymentService.processPayment(paymentId);

        return userDetails + "\n" + orderDetails + "\n" + paymentProcessing;
    }

}
class OrderService {
    public String getOrderDetails(String orderId) {
        // Simulate fetching order details
        return "Order details for orderId: " + orderId;
    }
}
class PaymentService {
    public String processPayment(String paymentId) {
        // Simulate payment processing
        return "Processing payment with paymentId: " + paymentId;
    }
}
class UserService {
    public String getUserDetails(String userId) {
        // Simulate fetching user details
        return "User details for userId: " + userId;
    }
}
public class APIGatewayMain {
    public static void main(String[] args) {
        // Client code interacting with API Gateway (Facade)
        APIGateway apiGateway = new APIGateway();
        //Task
        System.out.println(apiGateway.getFullOrderDetails("123","456","789"));
    }
}

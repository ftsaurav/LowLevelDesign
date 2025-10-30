import java.util.HashMap;

public class PaymentService {
        HashMap<String, PaymentMethod> hm= new HashMap<>();

        public void addPaymentMethod(String name, PaymentMethod pm)
        {
            hm.put(name, pm);
        }
        
        public void MakePayment(String name)
        {
            PaymentMethod pm= hm.get(name);
            pm.pay();
        }
}

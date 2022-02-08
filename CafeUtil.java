import java.util.ArrayList;
import java.util.Date;
public class CafeUtil{

    public String greetMessage(){
        return "Hello!";
    }
    int total = 0;
    public int getStreakGoal(int numWeeks){
        for(int i=0; i<(numWeeks+1); i++){
            total += i;
        }
        return total;
    }
    double priceTotal = 0;
    public double getOrderTotal(double[] lineItems){
        for(int i=0; i<lineItems.length; i++){
            priceTotal += lineItems[i];
        }
        return priceTotal;
    }
    public void displayMenu(ArrayList<String> menu){
        for(int i=0; i<menu.size(); i++) {
            System.out.println(i + " : " + menu.get(i));
        }
    }
    public void addCustomer(ArrayList<String> customers){
        String userName = System.console().readLine();
        System.out.println(String.format("Hello, %s", userName));
        System.out.println(String.format("There are %d people in front of you",customers.size()));
        customers.add(userName);
        System.out.println(customers);

    }


}
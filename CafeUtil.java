import java.util.ArrayList;
import java.util.Date;
public class CafeUtil{
    // different methods, like functions
    public void printHello(){
        System.out.println("Hello from CafeUtil");
    }

    public String greetMessage(){
        return "Hello!";
    }

    public String greetSomeone(String name){
        return String.format("Hello, %s",name);
    }
    public String greetSomeone(int age){
        return String.format("Hello, you are "+ age + " years old.");
    }
    public String createMesage(String name, String petName, int age){
        return String.format("Hello, I am %s. I like %s. He is %d years old.", name, petName, age);
    }
    public String getCurrentDate(){
        Date d = new Date();
        // option 1
        String dStr = d.toString();
        return dStr;
        // option 2
        // return ""+d    
        // option 3
        // String testStr = new Date().toString();
        // return testStr;
    }
    // need to run a for loop to print array contents... loop through array
    public void printIntArray(int[] numArr){
        for(int i=0; i<numArr.length; i++){
            System.out.println(numArr[i]);
        }
    }
    // for loop (enhanced for loop shown in option 2, but no index)
    public void printArrayList(ArrayList<String> strArr){
        for(int i=0; i<strArr.size(); i++) {
            System.out.println("Hashtag "+ i + " : " + strArr.get(i));
        }
        for(String element: strArr){
            System.out.println(element);
        }
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
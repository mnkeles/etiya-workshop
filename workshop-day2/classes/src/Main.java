public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();
        customerManager2.Add();
        customerManager2.Remove();
        customerManager2.Update();


        int number1 = 10;
        int number2 = 20;
        number2 = number1;
        number1 = 30;
        System.out.println(number2);


        int[] numbers1 = new int[]{1, 2, 3};
        int[] numbers2 = new int[]{4, 5, 6};
        numbers1 = numbers2;
        numbers2[0] = 10;
        System.out.println(numbers1[0]);
    }
}
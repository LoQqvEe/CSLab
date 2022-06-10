import java.util.Scanner;

public class Cs04_Pro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n\n <================================================================================>");
        //Declare array of Goods & Price
        String[] ing = new String[1000];
        int[] inp = new int[1000];

        //Input no. menu
        System.out.print("\n\t\t<No. of menu>: ");
        int ng = sc.nextInt();
        System.out.println(" <---====================--->");
        System.out.println("\t[---Menu of Goods---]\n");
        //Input Goods & Price
        for(int i =0;i<ng;i++) {
            System.out.print("->\tGoods no."+(i+1)+": ");
            String goods = sc.next();
            ing[i]=goods;
            System.out.print("->\tPrice no."+(i+1)+": ");
            int price = sc.nextInt();
            inp[i]=price;
            System.out.println();
        }

        System.out.println("\n\n\n <--------------------------------------------------------->");
        System.out.println("\t\t\t\t\t[--Amount of Menu--]\n");
        //Print Menu
        for(int i =0;i<ng;i++) {
            System.out.println("   "+(i+1)+") " + "Goods: " + ing[i] + ",\tPrice: " + inp[i]);
        }
        System.out.println(" <--------------------------------------------------------->");


        System.out.println();

        while(true) {

            //Looping of order
            System.out.print("Continue: ");
            int con = sc.nextInt();
            System.out.println("**********");
            if(con!=1){
                System.out.println("\n\n\t\t\tStop Continue!\n\n\n");
                break;
            }
            while (con == 1) {
                //Input no. of list
                System.out.print("\n\n\n\n\t\tNo. of Goods' demand: ");
                int sum = 0;
                int nb = sc.nextInt();
                System.out.println(" <---=============================--->");
                System.out.println("\t\t\t\tList:\n");
                for (int x = 0; x < nb; x++) {
                    System.out.print((x + 1) + ") Choose Order: ");
                    int list = sc.nextInt();
                    sum += inp[list - 1];
                }
                System.out.println(" <---=============================--->\n\n");

                //Calculation of all prices
                System.out.println("Total Price: " + sum);
                System.out.println("*************************");

                //Input money
                System.out.print("Input Cash: ");
                int m = sc.nextInt();

                //Check statement
                if (m >= sum) {
                    System.out.println("\n\n ----> Change: " + (m - sum));
                } else {
                    System.out.println("\nPlease add more cash to complete your transaction to submit your order! {}Insufficient cash{}");
                    while (sum > m) {
                        System.out.print("Add More Cash: ");
                        int am = sc.nextInt();
                        m += am;
                    }
                    System.out.println("\n\n ----> Change: " + (m - sum));
                }

                System.out.println(" <================================================================================>");
                System.out.println("\n\n\t\t\t*** Order Confirmed, Thank you to buying with us! ***\n\n\n\n");
                con = 0;

            }
        }

    }
}

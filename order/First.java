package order;

import java.util.*;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

//import java.lang.*;
public class First {

    public static void function(ArrayList<Item> it) {
        System.out.println("Menu");
        System.out.print(String.format("%-20s%-20s%-20s\n", "ItemName", "Quantity", "Cost"));
        for (Item i : it) {
            System.out.println(String.format("%-20s%-20d%-20d", i.getName(), i.getQuantity(), i.getPrice()));
        }
    }

    public static void history(ArrayList<History> h) {
        System.out.print(String.format("%-20s%-20s%-20s\n", "ItemName", "Quantity", "Cost"));
        for (History i : h) {
            System.out.println(String.format("%-20s%-20d%-20d", i.getName(), i.getQuantity(), i.getPrice()));
        }
    }

    public static void main(String[] args) throws Exception {
//        Object xa=new String("ss");
//                Integer ca=(Integer)xa;
//      
        Scanner ob = new Scanner(System.in);
        ArrayList<Item> it = new ArrayList<Item>();
        ArrayList<User> u = new ArrayList<User>();
        ArrayList<History> h = new ArrayList<History>();
        ArrayList<Sample> s = new ArrayList<Sample>();
        First f1 = new First();
        int n;
        Admin ao = new Admin();
        Update x = new Update();
        BufferedReader buf = new BufferedReader(new FileReader("D:\\item.txt"));
        String data;
        while ((data = buf.readLine()) != null) {
            String[] detail = data.split(" ");
            //System.out.println(detail[0]+Integer.parseInt(detail[1])+Integer.parseInt(detail[2]));
            // System.out.println("hi");
            it.add(new Item(detail[0], Integer.parseInt(detail[1]), Integer.parseInt(detail[2])));
        }
        buf.close();
        File file1 = new File("D:\\user.txt");
        // System.out.println(file.length());
        if (!(file1.length() <= 1)) {
            BufferedReader buf1 = new BufferedReader(new FileReader("D:\\user.txt"));
            String data1;
            while ((data1 = buf1.readLine()) != null) {
                String[] detail1 = data1.split(" ");
                //System.out.println(detail[0]+Integer.parseInt(detail[1])+Integer.parseInt(detail[2]));
                // System.out.println("hi");
                u.add(new User(detail1[0], detail1[1]));
            }
            buf1.close();
        }
        File file = new File("D:\\sample.txt");
        // System.out.println(file.length());
        if (!(file.length() <= 1)) {
            BufferedReader buf4 = new BufferedReader(new FileReader("D:\\sample.txt"));
            String data4;

            while ((data4 = buf4.readLine()) != null) {
                String[] detail4 = data4.split(" ");
                //System.out.println(detail[0]+Integer.parseInt(detail[1])+Integer.parseInt(detail[2]));
                // System.out.println("hi");
                s.add(new Sample(detail4[0], Integer.parseInt(detail4[1])));
            }
            buf4.close();
        }
        BufferedReader buf5 = new BufferedReader(new FileReader("D:\\admin.txt"));
        String data5;
        data5 = buf5.readLine();

        //System.out.println(detail[0]+Integer.parseInt(detail[1])+Integer.parseInt(detail[2]));
        System.out.println(data5);
        ao.day = Integer.parseInt(data5);

        buf5.close();
        if (ao.day == 1) {
            for (Sample i : s) {
                int flag3 = 0;
                for (Item j : it) {
                    if ((i.name).equals(j.name)) {
                        j.price = i.price;
                    }

                }

            }
            s.clear();
        }

        // User uob=new User();
        do {

            System.out.println("1.Admin Login\n2.User SignUP\n3.User Login\n4.exit");
            n = ob.nextInt();
            //System.out.println(n);
            switch (n) {
                case 1: {

                    ob.nextLine();
                    Admin aob = new Admin();
                    System.out.println("Enter user name");
                    String name = ob.nextLine();
                    System.out.println("Enter password");
                    String password = ob.nextLine();
                    int flag = 0;
                    //  System.out.println(flag);
                    // System.out.println(aob.name);
                    if (name.equalsIgnoreCase(aob.name)) {
                        if (password.equalsIgnoreCase(aob.password)) {
                            flag = 1;

                        }
                    }
                    //System.out.println(flag);
                    if (flag == 1) {
                        System.out.println("Login successful");
                        f1.function(it);
                        int ch;
                        do {
                            System.out.println("1.Add Item\n2.Add quantity\n3.Set price\n4.set day\n5.setMaxCost\n6.Exit");
                            ch = ob.nextInt();
                            switch (ch) {
                                case 1: {
                                    ob.nextLine();
                                    int f = 0;
                                    System.out.println("Enter the item name");
                                    String itemName = ob.nextLine();
                                    System.out.println("Enter the quantity");
                                    int quan = ob.nextInt();
                                    System.out.println("Enter the price");
                                    int price = ob.nextInt();
                                    for (Item i : it) {
                                        if (i.name.equalsIgnoreCase(itemName)) {

                                            f = 1;

                                            break;
                                        }
                                    }
                                    if (f == 0) {
                                        Item ins = new Item(itemName, quan, price);
                                        it.add(ins);
                                        try {
                                            FileWriter fw = new FileWriter("D:\\item.txt");
                                            BufferedWriter buffer = new BufferedWriter(fw);
                                            for (Item i : it) {
                                                buffer.write(i.toString());

                                            }
                                            buffer.close();
                                            fw.close();

                                        } catch (Exception e) {
                                            System.out.println(e);
                                        }
                                    } else {
                                        System.out.println("Item already exist");
                                    }
                                    break;
                                }
                                case 2: {
                                    ob.nextLine();
                                    System.out.println("Enter the item name");
                                    String item = ob.nextLine();
                                    System.out.println("\nEnter the quantity");
                                    int quan = ob.nextInt();
                                    int f = 0;
                                    for (Item i : it) {
                                        if (i.name.equalsIgnoreCase(item)) {
                                            
                                            i.quantity += quan;
                                            f = 1;
                                            System.out.println("Available quantity of " + item + " is " + i.quantity);
                                             try {
                                            FileWriter fw = new FileWriter("D:\\item.txt");
                                            BufferedWriter buffer = new BufferedWriter(fw);
                                            for (Item k : it) {
                                                buffer.write(k.toString());

                                            }
                                            buffer.close();
                                            fw.close();

                                        } catch (Exception e) {
                                            System.out.println(e);
                                        }
                                            break;
                                        }
                                    }

                                    if (f == 0) {
                                        System.out.println("Item doesn't Exist!");
                                    }

                                    break;
                                }
                                case 3: {
                                    // int[] a=new int[100];
                                    int d = 0;
                                    ob.nextLine();
                                    System.out.println("Enter the item name");
                                    String item = ob.nextLine();
                                    System.out.println("Enter the price\n");
                                    int price = ob.nextInt();
                                    Sample ins = new Sample(item, price);
                                    s.add(ins);
                                    // for(Sample i:s)
                                    //System.out.println(i.toString());
                                    if (ao.day == 1) {
                                        for (Sample i : s) {
                                            int flag3 = 0;
                                            for (Item j : it) {
                                                if ((i.name).equals(j.name)) {
                                                    j.price = i.price;
                                                }

                                            }

                                        }
                                        s.clear();
                                    }

                                    if (!s.isEmpty()) {
                                        try {
                                            FileWriter fw3 = new FileWriter("D:\\sample.txt");
                                            BufferedWriter buffer3 = new BufferedWriter(fw3);
                                            for (Sample i : s) {
                                                buffer3.write(i.toString());

                                            }

                                            buffer3.close();
                                            fw3.close();

                                        } catch (Exception e) {
                                            System.out.println(e);
                                        }
                                    }

                                    // x=new Update(item,price);
                                    break;
                                }
                                case 4: {
                                    System.out.println("Do you want to close the day[1/0]");
                                    int day1 = ob.nextInt();
                                    ao = new Admin(day1);

                                    //ao.day=day1;
                                    // System.out.println(ao.day);
                                }

                            }
                        } while (ch < 5);
                    } else {
                        System.out.println("Login Failed");
                    }

                    break;
                }
                case 2: {
                    ob.nextLine();
                    System.out.println("Enter user name");
                    String name = ob.nextLine();
                    System.out.println("Enter password");
                    String password = ob.nextLine();
                    User ins = new User(name, password);
                    u.add(ins);
                    break;
                }
                case 3: {
                    ob.nextLine();
                    System.out.println("Enter user name");
                    String name = ob.nextLine();
                    System.out.println("Enter password");
                    String password = ob.nextLine();

                    int flag1 = 0;
                    for (User k : u) {
                        if (k.name.equalsIgnoreCase(name)) {
                            if (k.password.equalsIgnoreCase(password)) {
                                flag1 = 1;
                                break;
                            }
                        }
                    }
                    if (flag1 == 1) {
                        System.out.println("Login successful");
                        x.fun(it);

                        int ch;
                        do {
                            System.out.println("1.Order\n2.Exit");
                            ch = ob.nextInt();
                            switch (ch) {

                                case 1: {
                                    int c = 0;
                                    // Admin ao=new Admin();
                                    //System.out.println(ao.day);
                                    if (ao.day == 0) {
                                        int total = 0, cost, choice, avail, avalue;
                                        ob.nextLine();
                                        do {
                                            if (!(it.isEmpty())) {
                                                f1.function(it);
//                                  
                                                cost = 0;
                                                avail = 0;
                                                avalue = 0;
                                                System.out.println("Enter the item name");
                                                String item = ob.nextLine();
                                                System.out.println("Enter the quantity");
                                                int quan = ob.nextInt();
                                                for (Item i : it) {
                                                    if (i.name.equalsIgnoreCase(item)) {
                                                        avalue = i.quantity;
                                                        if (i.quantity >= quan) {
                                                            i.quantity -= quan;
                                                            cost = ((i.price) * quan);
                                                            avail = 1;
                                                            total += cost;
                                                        }
                                                    }
                                                }
                                                if (avail == 1) {
                                                    History ins = new History(item, quan, cost);
                                                    h.add(ins);
                                                } else {
                                                    System.out.println("only " + avalue + " quantities are avilable\n");
                                                    c = 1;
                                                }
                                                if (c != 1) {
                                                    f1.history(h);

                                                }
                                            } else {
                                                System.out.println("No items are available");
                                            }
                                            System.out.println("Do you want to order more items[1/0]?");
                                            choice = ob.nextInt();
                                            ob.nextLine();

                                        } while (choice == 1);
                                        f1.history(h);
                                        System.out.println("total cost :" + total);
                                    } else {
                                        System.out.println("Sorry....Day was closed..you cannot order anything...");
                                    }
                                    break;

                                }

                            }
                        } while (ch < 2);
                    } else {
                        System.out.println("Invalid login\n");
                    }
                    break;
                }

            }

        } while (n < 4);
//       for(Item i:it)
//                           {                               
//                              System.out.println(i.toString());
//                             
//                            }
        try {
            FileWriter fw = new FileWriter("D:\\item.txt");
            BufferedWriter buffer = new BufferedWriter(fw);
            for (Item i : it) {
                buffer.write(i.toString());

            }
            buffer.close();
            fw.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            FileWriter fw5 = new FileWriter("D:\\admin.txt");
            BufferedWriter buffer5 = new BufferedWriter(fw5);
            System.out.println(ao.day);
            Integer dayvalue = ao.day;
            buffer5.write(dayvalue.toString());
            buffer5.close();
            fw5.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            FileWriter fw1 = new FileWriter("D:\\user.txt");
            BufferedWriter buffer1 = new BufferedWriter(fw1);
            for (User i : u) {
                buffer1.write(i.toString());

            }
            buffer1.close();
            fw1.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

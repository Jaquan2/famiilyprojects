package class2;

public class Variables {
    public static void main(String[] args) {
        /*
        Below line is creating a box/reserving a box in the computers memory.
        we are calling it box and if we need the information that we are storing inside this box
        we can simply say it to the computer to give us the context of box1.
        int=> what type of data we want to store
        box1=> is the name of the box
        = sign will take whatever we write after it and will store it inside the box1
        10=> is what we are storing inside the box.
         */
        int box1=10;
        // when it is printed from box no ""
        System.out.println(box1); // bring the contents of box1 and print them on the console
        /*
        To store whole numbers (numbers without decimals points) we have 4 different types of boxes.
        for example 10 20 3000
        1) byte 2) short 3)int 4)long
         */
        byte box2=127; // range for byte is from -128 to 127 if we need to store large numbers we should try short
        short box3=32767; // range for short is -32768 to 32767
        int box4=2147483647; // most common type of box
        long maxBox= 12345679586858484L;// the maximum number
        short myBox=10000;
        System.out.println(myBox);
        int myBox2=10000;
        System.out.println(myBox2);

    }
}

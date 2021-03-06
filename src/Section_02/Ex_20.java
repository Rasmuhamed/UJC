package Section_02;

public class Ex_20 {
    public static void main(String[] args) {

        //Inefficient
        String info = "";

        info +="My name is Bob.";
        info += " ";
        info += "I am a builder";

        System.out.println(info);

        //More efficient.

        StringBuilder sb = new StringBuilder("");
        sb.append("My name is Sue.");
        sb.append(" ");
        sb.append("I am a lion tamer.");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();

        s.append("My name is Roger.")
                .append(" ")
                .append("I am skydiver");

        System.out.println(s.toString());

        //Formating

        System.out.print("Here is some text. \tThat was a tab.\nThat was a newline.");
        System.out.println(" More text.");


        //Formating integers
        System.out.printf("Total cost %-10d; quantity is %d\n", 5, 120);

        for(int i=0; i<20; i++){
            System.out.printf("%2d: %s\n", i, "here is some text");
        }

        //Formatting floating point value
        System.out.printf("Total value: %.2f\n", 5.212312);
        System.out.printf("Total value: %5.1f\n", 125.212312);

    }

}

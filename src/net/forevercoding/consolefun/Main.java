package net.forevercoding.consolefun;

public class Main {
    public static void main(String[] args) {
        Ansi AnsCont = new Ansi();

        //System.out.println(AnsCont.clearScreen());
        AnsCont.clearScreen();

        System.out.println(ANSI_CLS + ANSI_RESET);
        System.out.println("\n  Default text\n");

        System.out.println(ANSI_BOLD + "  Bold text\n");
        for (String fg : FOREGROUNDS) {
            for (String bg : BACKGROUNDS)
                System.out.print(fg + bg + "  TEST  ");
            System.out.println(ANSI_RESET);
        }

        System.out.println(ANSI_RESET + "\n  Back to default.\n");
        System.out.println("\u001b[10;25H" + ANSI_BRIGHT_RED + "  Hubba bubba dubba jububba\n");
        
    }
}
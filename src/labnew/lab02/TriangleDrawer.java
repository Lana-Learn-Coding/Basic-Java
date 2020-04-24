package labnew.lab02;

import util.Menu;

public class TriangleDrawer {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setEntry("1", "Draw triangle", TriangleDrawer::drawTriangle1);
        menu.setEntry("2", "Draw another triangle", TriangleDrawer::drawTriangle2);
        menu.setEntry("3", "Draw ano another triangle", TriangleDrawer::drawTriangle3);
        menu.setEntry("4", "Exit", TriangleDrawer::exit);

        while (true) {
            System.out.println();
            System.out.println("Triangle drawer menu:");
            menu.run();
        }
    }

    static void drawTriangle1() {
        int max = 6;
        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void drawTriangle2() {
        int max = 6;
        for (int i = 1; i <= max; i++) {
            for (int j = max; j >= i; j--) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }

    static void drawTriangle3() {
        int max = 13;
        for (int i = 1; i <= max; i += 2) {
            if (max - i > 0) {
                System.out.printf("%-" + (max - i) + "s", " ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void exit() {
        System.exit(0);
    }
}

package util;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private final Map<String, MenuEntry> entries = new HashMap<>();
    private String entriesFormat = "  %-4s %s";
    private String chooseMessage = "Please choose an option:";
    private String retryMessage = "Invalid option. Please choose again:";

    private static class MenuEntry {
        String description;
        Action action;

        public MenuEntry(String description, Action action) {
            this.description = description;
            this.action = action;
        }
    }

    public void setChooseMessage(String chooseMessage) {
        this.chooseMessage = chooseMessage;
    }

    public void setRetryMessage(String retryMessage) {
        this.retryMessage = retryMessage;
    }

    public void setEntry(String key, String description, Action action) {
        MenuEntry entry = new MenuEntry(description, action);
        entries.put(key, entry);
    }

    public void setEntriesFormat(String format) {
        entriesFormat = format;
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        entries.forEach((key, menuEntry) -> {
            System.out.printf(entriesFormat, key, menuEntry.description);
            System.out.println();
        });

        System.out.print(chooseMessage + " ");
        String option = sc.nextLine();
        while (!entries.containsKey(option)) {
            System.out.print(retryMessage + " ");
            option = sc.nextLine();
        }
        entries.get(option).action.execute();
    }
}
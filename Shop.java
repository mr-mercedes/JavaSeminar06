package ru.seminar06;

import java.util.*;

public class Shop {
    private static Map<Integer, String> bandMap = new HashMap<>(Map.of(1, "Bony",
            2, "Tony",
            3, "Kony",
            4, "Pony",
            5, "Rony"));

    private static Map<Integer, String> modelMap = new HashMap<>(Map.of(1, "A1",
            2, "B2",
            3, "C3"));

    private static Map<Integer, String> colorMap = new HashMap<>(Map.of(1, "black",
            2, "blue",
            3, "silver",
            4, "white"));

    private static Map<Integer, String> OSMap = new HashMap<>(Map.of(1, "Win",
            2, "Mac"));

    private static Map<Integer, String> HDMap = new HashMap<>(Map.of(1, "256",
            2, "512",
            3, "1024"));

    private static Map<Integer, String> RAMMap = new HashMap<>(Map.of(1, "16",
            2, "32",
            3, "64"));

    public static void main(String[] args) {
        Notebook note1 = new Notebook("Bony", "A1", "black", "U243-54", "Win", 111, "512", "64");
        Notebook note2 = new Notebook("Tony", "B2", "blue", "A121-22", "Mac", 222, "1024", "32");
        Notebook note3 = new Notebook("Kony", "C3", "silver", "T1457-5", "Win", 333, "1024", "32");
        Notebook note4 = new Notebook("Pony", "A1", "white", "U173-99", "Mac", 123, "512", "64");
        Notebook note5 = new Notebook("Rony", "B2", "black", "A523-17", "Win", 321, "256", "16");
        Set<Notebook> notebooks = new HashSet<>(Set.of(note1, note2, note3, note4, note5));
        String[] params = getSortParam();
        System.out.println(Arrays.toString(params));
        Notebook newNote = notebookConstract(params);
        for (Notebook note : notebooks){
            if (note.equals(newNote)){
                System.out.println(note);
            }
        }

    }

    public static String[] getSortParam() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        boolean flag = true;
        Map<Integer, String> map = new HashMap<>(Map.of(1, "Бренд",
                2, "Модель",
                3, "Цвет",
                4, "Серийный номер",
                5, "Операционная система",
                6, "Идентификационный номер",
                7, "Объем жесткого диска",
                8, "Объем оперативной памяти"));

        Map<Integer, String> yesNoMap = new HashMap<>(Map.of(0, "Да", 1, "Нет"));

        int operation = 0;
        while (flag) {
            for (Integer item : map.keySet()) {
                System.out.println(item + " : " + map.get(item));
            }
            System.out.print("Для сортировки выберити цифру: ");
            operation = scanner.nextInt();
            if (operation == 1) {
                for (Integer brand : bandMap.keySet()) {
                    System.out.println(brand + " : " + bandMap.get(brand));
                }
                System.out.print("Для сортировки выберити цифру: ");
                operation = scanner.nextInt();
                stringBuilder.append(bandMap.get(operation)).append(" ");
                for (Integer item : yesNoMap.keySet()) {
                    System.out.println(item + " : " + yesNoMap.get(item));
                }
                System.out.print("Добавить параметр для сортировки: ");
                operation = scanner.nextInt();
                flag = operation == 0 ? true : false;
            } else if (operation == 2) {
                for (Integer model : modelMap.keySet()) {
                    System.out.println(model + " : " + modelMap.get(model));
                }
                System.out.print("Для сортировки выберити цифру: ");
                operation = scanner.nextInt();
                stringBuilder.append(modelMap.get(operation)).append(" ");
                for (Integer item : yesNoMap.keySet()) {
                    System.out.println(item + " : " + yesNoMap.get(item));
                }
                System.out.print("Добавить параметр для сортировки: ");
                operation = scanner.nextInt();
                flag = operation == 0 ? true : false;
            } else if (operation == 3) {
                for (Integer color : colorMap.keySet()) {
                    System.out.println(color + " : " + colorMap.get(color));
                }
                System.out.print("Для сортировки выберите цвет: ");
                operation = scanner.nextInt();
                stringBuilder.append(colorMap.get(operation)).append(" ");
                for (Integer item : yesNoMap.keySet()) {
                    System.out.println(item + " : " + yesNoMap.get(item));
                }
                System.out.print("Добавить параметр для сортировки: ");
                operation = scanner.nextInt();
                flag = operation == 0 ? true : false;
            } else if (operation == 4) {
                System.out.println("Введите серийный номер для поиска: ");
            } else if (operation == 5) {
                for (Integer OS : OSMap.keySet()) {
                    System.out.println(OS + " : " + OSMap.get(OS));
                }
                System.out.print("Для сортировки выберите операционную систему: ");
                operation = scanner.nextInt();
                stringBuilder.append(OSMap.get(operation)).append(" ");
                for (Integer item : yesNoMap.keySet()) {
                    System.out.println(item + " : " + yesNoMap.get(item));
                }
                System.out.print("Добавить параметр для сортировки: ");
                operation = scanner.nextInt();
                flag = operation == 0 ? true : false;
            } else if (operation == 6) {
                System.out.println("Введите идентификационный номер для поиска: ");
            } else if (operation == 7) {
                for (Integer HD : HDMap.keySet()) {
                    System.out.println(HD + " : " + HDMap.get(HD));
                }
                System.out.print("Для сортировки выберите размер жесткого диска: ");
                operation = scanner.nextInt();
                stringBuilder.append(HDMap.get(operation)).append(" ");
                for (Integer item : yesNoMap.keySet()) {
                    System.out.println(item + " : " + yesNoMap.get(item));
                }
                System.out.print("Добавить параметр для сортировки: ");
                operation = scanner.nextInt();
                flag = operation == 0 ? true : false;
            } else if (operation == 8) {
                for (Integer RAM : RAMMap.keySet()) {
                    System.out.println(RAM + " : " + RAMMap.get(RAM));
                }
                System.out.print("Для сортировки выберите размер оперативной памяти: ");
                operation = scanner.nextInt();
                stringBuilder.append(RAMMap.get(operation)).append(" ");
                for (Integer item : yesNoMap.keySet()) {
                    System.out.println(item + " : " + yesNoMap.get(item));
                }
                System.out.print("Добавить параметр для сортировки: ");
                operation = scanner.nextInt();
                flag = operation == 0 ? true : false;
            }

        }
        return stringBuilder.toString().split(" ");
    }

    public static Notebook notebookConstract(String[] str){
        Notebook notebookTMP = new Notebook();
        for (int i = 0; i < str.length; i++) {
            for (Integer brand : bandMap.keySet()) {
                if (str[i].equalsIgnoreCase(bandMap.get(brand))){
                    notebookTMP.setBrand(bandMap.get(brand));
                }
            }
            for (Integer model : modelMap.keySet()) {
                if (str[i].equalsIgnoreCase(modelMap.get(model))){
                    notebookTMP.setModel(modelMap.get(model));
                }
            }
            for (Integer color : colorMap.keySet()) {
                if (str[i].equalsIgnoreCase(colorMap.get(color))){
                    notebookTMP.setColor(colorMap.get(color));
                }
            }
            for (Integer OS : OSMap.keySet()) {
                if (str[i].equalsIgnoreCase(OSMap.get(OS))){
                    notebookTMP.setOperationSystem(OSMap.get(OS));
                }
            }
            for (Integer HD : HDMap.keySet()) {
                if (str[i].equalsIgnoreCase(HDMap.get(HD))){
                    notebookTMP.setHeardDiskVolume(HDMap.get(HD));
                }
            }
            for (Integer RAM : RAMMap.keySet()) {
                if (str[i].equalsIgnoreCase(RAMMap.get(RAM))){
                    notebookTMP.setRAM(RAMMap.get(RAM));
                }
            }

        }
        return notebookTMP;
    }

}

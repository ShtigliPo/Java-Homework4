package ru.gb;

/**
 * Пусть дан LinkedList с несколькими элементами. 
 * Реализуйте метод, который вернет “перевернутый” список.
 */

import java.util.LinkedList;
import java.util.List;

public class App 
{
    public static void main( String[] args ) {
        LinkedList<String> originalList = new LinkedList<>();

        originalList.add ("1-12345");
        originalList.add ("2-abcdef");
        originalList.add ("3-examination");
        originalList.add ("4-script ready");

        System.out.println(originalList);
        System.out.println(replaceList(originalList));
    }

    public static List<String> replaceList (List<String> inList) {
        LinkedList<String> outList = new LinkedList<>();
        for (int i = inList.size() - 1; i >= 0; i--) {
            outList.add(inList.get(i));
        }
        return outList;
    }
}

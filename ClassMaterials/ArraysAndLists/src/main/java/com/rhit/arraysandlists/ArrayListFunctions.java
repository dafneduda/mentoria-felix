package com.rhit.arraysandlists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListFunctions {

    /**
     * Write a function that takes an array of strings and return an arraylist. The arraylist should contain only the
     * strings in the original list that begin with 'A'
     * <p>
     * So arrayListOfAs({"Abc","foo","AAA", "bar"}) yields ["Abc","AAA"]
     */
    public static ArrayList<String> arraylistOfAs(String[] strings) {
        // criar um array de palavras
        // percorrer o array e ver as palavras que começam com A
        // colocar numa Arraylist

        ArrayList<String> palavrasComA = new ArrayList<String>();
        for (String palavra : strings) {
            if (palavra.startsWith("A")) {
                palavrasComA.add(palavra);
            }
        }
        return palavrasComA;
    }

    /**
     * Takes an arrayList of numbers in sorted (ascending) order and a number to add. Adds the number in the correct
     * place in the sorted list.
     * <p>
     * so insertIntoSorted([1,5,9],6) yields [1,5,6,9]
     */
    public static void insertIntoSorted(ArrayList<Integer> list, int number) {

        list.add(number);
        Collections.sort(list);
    }

    /**
     * Takes an arraylist of strings and removes all strings longer than 3 characters.
     * <p>
     * So removeLongStrings(["a","xxxx","b","zzzzz"]) yields ["a","b"]
     */
    public static void removeLongStrings(ArrayList<String> strings) {

        for (int indice = strings.size()-1; indice >=0; indice--){
            if (strings.get(indice).length() >= 3) strings.remove(indice);
        }
    }
}
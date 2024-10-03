package com.rhit.arraysandlists;

import java.util.ArrayList;
import java.util.Arrays;
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

        list.add(number); // O(1)
        Collections.sort(list); // O(n*log(n)), 100 * 10 = 1000 -> O(n) = 100

//        // O(1)
//        if (list.isEmpty()) {
//            // O(1)
//            list.add(number);
//            return;
//        }
//
//        // 100 + 100 = 200
//        for (int indice = 0; indice < list.size() ; indice++) {
//            // .get(indice) -> 0(1);
//            // .add(indice, valor) -> O(n);
//            if (list.get(indice) >= number) {
//                list.add(indice, number);
//                return;
//            }
//            // O(1)
//            if (indice == list.size() - 1) {
//                list.add(number);
//                return;
//            }
//        }
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

/*
 * RemoveLessArrayList
 *
 * Description: ArrayList, that prohibits
 * removing elements from the structure.
 *
 * By: Alyona Korzhakova
 *
 * Created: 2018/03/26
 *
 * Updated: 2018/03/26
 */
package ua.training;

import java.util.ArrayList;

/**
 * Extends ArrayList, overriding remove methods.
 * @param <E>
 */
public class RemoveLessArrayList<E> extends ArrayList {

    @Override
    public E remove(int index) {
        System.out.println("Sorry! This is removeless ArrayList!");
        return E;
    }

    @Override
    private void fastRemove(int index) {
        System.out.println("Sorry! This is removeless ArrayList!");
    }

    @Override
    public void clear() {
        System.out.println("Sorry! This is removeless ArrayList!");
    }

    @Override
    public boolean remove(Object o) {
        System.out.println("Sorry! This is removeless ArrayList!");
        return true;
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        System.out.println("Sorry! This is removeless ArrayList!");
    }
}

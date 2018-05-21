package ArrayInteger;

import java.util.Arrays;

public class ArrayInteger {
    int[] array = new int[0]; // The default array.


    // The method adds a element[value] into the array.
    public void add (int value) {
        int[] array2 = Arrays.copyOf(array, array.length+1);
        array2[array2.length-1] = value;
        array = array2;
    }



    // The method adds a element[value] into the start of the array.
    public void addFirst (int value) {
        int[] array2 = new int[array.length+1];
        array2[0] = value;
        System.arraycopy(array, 0, array2, 1, array.length);
        array = array2;
    }



    // The method adds a element[value] into the end of the array.
    public void addLast (int value) {
        int[] array2 = Arrays.copyOf(array, array.length+1);
        array2[array2.length-1] = value;
        array = array2;
    }



    // The method returns all element of the array.
    public StringBuilder get () {
        StringBuilder s = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1) {
                s.append(array[i]);
            }
            else {
                s.append(array[i] + ", ");
            }
        }
        s.append("]");
        return s;
    }



    // The method returns integer value - a element[index] of the array.
    public int get (int index) {
        return array[index];
    }



    // The method returns a integer value - the first element of the array.
    public int getFirst () {
        return array[0];
    }



    // The method returns a integer value - the last element of the array.
    public int getLast () {
        return array[array.length-1];
    }



    // The method removes a element[index].
    public void remove (int index) {
        if (index == 0) {
            int[] array2 = new int[array.length-1];
            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    continue;
                }
                else {
                    array2[i-1] = array[i];
                }
            }
            array = array2;
        }
        else if (index == array.length-1) {
            int[] array2 = new int[array.length-1];
            for (int i = 0; i < array.length-1; i++) {
                array2[i] = array[i];
            }
            array = array2;
        }
        else {
            int[] array2 = new int[array.length-1];
            for (int i = 0; i < array.length; i++) {
                if (i > index) {
                    array2[i-1] = array[i];
                }
                if (i == index) {
                    continue;
                }
                if (i < index) {
                    array2[i] = array[i];
                }
            }
            array = array2;
        }
    }



    // The method removes all element of the array.
    public void removeAll () {
        array = new int[0];
    }



    // The method removes the first element of the array.
    public void removeFirst () {
        int[] array2 = new int[array.length-1];
        System.arraycopy(array, 1, array2, 0, array2.length);
        array = array2;
    }



    // The method removes the last element of the array.
    public void removeLast () {
        array = Arrays.copyOf(array, array.length-1);
    }



    // The method returns integer value - a size of the array.
    public int size () {
        return array.length;
    }




    // The method returns a boolean value:
    // The array is empty - [true].
    // The array is not empty - [false].
    public boolean isEmpty () {
        if (array.length == 0) return true;
        else return false;
    }



    // The method returns a integer value - max. value of the array.
    public int getMax () {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];
        }
        return max;
    }



    // The method returns a integer value - min. value of the array.
    public int getMin () {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        return min;
    }



    // The method returns a integer value - average value of the array.
    public int getAverage () {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count+=array[i];
        }
        int avg = count/array.length;
        return avg;
    }



    // The method sorts the array.
    public void sort () {
        Arrays.sort(array);
    }



    // The method returns a boolean value:
    // A [element] contains into the array - [true].
    // The [element] doesn't contains into the array = [false].
    public boolean contains (int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) return true;
        }
        return false;
    }



    // The method replaces all element by [value].
    public void replaceAll (int value) {
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }



    // The method replaces a element[index] by [value].
    public void replace (int index, int value) {
        array[index] = value;
    }



    // The method replaces the first element by [value].
    public void replaceFirst (int value) {
        array[0] = value;
    }



    // The method replaces the last element by [value].
    public void replaceLAst (int value) {
        array[array.length-1] = value;
    }



    // The method returns a integer value - a index of a [element].
    // If a [element] wasn't found then the method will return [0].
    public int indexOf (int element) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
            }
        }
        return index;
    }



    // The method returns a integer value - an amount all elements of the array.
    public int getAmount () {
        int amount = 0;
        for (int i = 0; i < array.length; i++) {
            amount+=array[i];
        }
        return amount;
    }



    // The method returns a integer value - an amount from [fPos] to [lPos] positions of the array.
    // The [fPos] and the [lPos] - a index of the array.
    public int getAmount (int fPos, int lPos) {
        int amount = 0;
        for (int i = 0; i < array.length; i++) {
            if (i >= fPos && i <= lPos) {
                amount+=array[i];
            }
        }
        return amount;
    }



    // The method returns a integer value - a range (from max. value to min. value).
    public int getRange () {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) max = array[i];
            if (min > array[i]) min = array[i];
        }
        return max-min;
    }
    
    
    
    // The method returns a integer value - product of all numbers of the array.
    public int getProduct () {
        int product = array[0];
        for (int i = 1; i < array.length; i++) {
            product*=array[i];
        }
        return product;
    }



    // The method returns a integer value - product of numbers from [fPos] to [lPos] positions of the array.
    public int getProduct (int fPos, int lPos) {
        int product = array[fPos];
        for (int i = fPos+1; i <= lPos; i++) {
            product*=array[i];
        }
        return product;
    }
}

class ArrayMethods{
    public int countOccurences(int[] someArray, int searchedInt, int index) {
        if (index >= someArray.length)
            return 0;

        int count = (someArray[index] == searchedInt) ? 1 : 0; 
        return count + countOccurences(someArray, searchedInt, index + 1); 
    }

    public int[] toArray(java.util.LinkedList<Integer> list){
        int[] arr = new int[list.size()]; 
        for(int i = 0; i < arr.length; i++) 
            arr[i] = list.get(i); 
        return arr;
    }
}

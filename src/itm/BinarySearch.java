package itm;

public class BinarySearch {
    private static Integer binarySearch(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) { // Пока эта часть не сократится до 1 элемента проверяем средний элемент
            int mid = (low + high) / 2;
            int guess = list[mid];
            if (guess == item) { // Значение найдено
                return mid;
            }
            if (guess > item) { // Много
                high = mid - 1;
            } else { // Мало
                low = mid + 1;
            }
        }
        return null; // Значения не существует
    }

    public static void main(String[] args) {
        int[] myList = {1, 3, 5, 7, 9};

        System.out.println(binarySearch(myList, 3)); // 1
        System.out.println(binarySearch(myList, -1)); // null
    }
}
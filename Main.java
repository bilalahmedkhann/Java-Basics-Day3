public class Main {
    public static void main(String[] args) {
        ElementOfArray ele = new ElementOfArray();
        ele.element();

    }
    public static class ElementOfArray {
        public void element() {
            int[] arr = {1, 3, 5, 6, 3, 54, 63, 21, 65};
            for (int j : arr) {
                System.out.print(j + " ");
            }
        }
    }

}
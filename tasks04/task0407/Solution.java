package tasks04.task0407;

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat.count++;

        Cat cat2 = new Cat();
        Cat.count++;
        System.out.print(Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}

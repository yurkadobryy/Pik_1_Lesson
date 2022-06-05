package Package1;

public class Lesson2
{
    public static void main(String[] args)
    {
        int apple = 5;
        System.out.println(apple);
        char letter = 'a';
        System.out.println(letter);

// char можно запихнуть текст
       char[] myArray = new char[6];
        myArray[2] = 'с';
        myArray[4] = 'о';
        myArray[5] = 'к';
        myArray[1] = 'е';
        myArray[0] = 'ч';
        myArray[3] = 'н';
        System.out.println(myArray);

        char[] myArray2 = myArray;
        myArray[0] = 'к';
        System.out.println(myArray);

        String text = String.copyValueOf(myArray);

        System.out.println(text);


    }
}

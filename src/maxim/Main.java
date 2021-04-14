package maxim;

public class Main {

    public static void main(String[] args) {

        // сезон 1
        int month = 10;
        if (month <= 2 || month == 12) {
            System.out.println("Зима");
        } else if (month <= 5) {
            System.out.println("Весна");
        } else if (month <= 9) {
            System.out.println("Лето");
        } else if (month <= 11) {
            System.out.println("Осень");
        }
        System.out.println();


// Сезон 2

        switch (month) {
            case 12:
            case 1:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("");

        }
        System.out.println();


        // 1-мерный массив в обратном порядке
        int[] arr = new int[10];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println();

// 2-мерный массив в виде таблицы с индексами строки и столбца
        int[][] squareArray = new int[2][3];
        squareArray[0][0] = 1;
        squareArray[0][1] = 2;
        squareArray[0][2] = 3;
        squareArray[1][0] = 1;
        squareArray[1][1] = 2;
        squareArray[1][2] = 3;
        for (int j = 0; j < squareArray.length; j++) {
            for (int k = 0; k < squareArray[j].length; k++) {
                System.out.print(squareArray[j][k] + "[" + j + "]" + "[" + k + "]" + "\t");
            }
            System.out.println();
        }




    }
}
public class ConditionAndLoop {
    public static void main(String[] args) throws Exception {
        /*
         * 條件式
         * 
         * if (條件) {
         * 條件成立時執行的程式碼
         * } else {
         * 條件不成立時執行的程式碼
         * }
         */
        // int a = 2;
        // int b = 3;

        // if((a <= b)) {
        // System.out.println("a 的確 <= b");
        // } else {
        // System.out.println("a 沒有 <= b");
        // }

        // int a = 2;
        // int b = 3;
        // if ((a==2) && (b==3)){
        // System.out.println("a 的確 = b");
        // }
        // else {
        // System.out.println("a 沒有 = b");
        // }

        // int a = 2;
        // int b = 3;
        // if ((a==2) || (b==5)){
        // System.out.println("1個以上正確");
        // }
        // else {
        // System.out.println("錯誤");
        // }

        // int a = 2;
        // int b = 3;

        // if((a == 2) && (b == 3)) {
        // System.out.println("a 的確 == 2 且 b 的確 == 3");
        // } else {
        // System.out.println("a 沒有 == 2 或 b 沒有 == 3");
        // }

        /*
         * 邏輯運算子
         * && : AND
         * || : OR
         * ! : NOT
         */

        /*
         * else if
         * 
         * if (條件1) {
         * 條件1成立時執行的程式碼
         * } else if (條件2) {
         * 條件2成立時執行的程式碼
         * } else {
         * 條件1跟條件2都不成立時執行的程式碼
         * }
         */
        // int a = 2;

        // if(a == 2) {
        // System.out.println("a : 2");
        // } else if(a == 3) {
        // System.out.println("a : 3");
        // } else if(a == 4) {
        // System.out.println("a : 4");
        // } else {
        // System.out.println("a 為2,3,4以外的數字");
        // }

        // int aa = 100;

        // if(aa==100)
        // {
        // System.out.println("超棒");
        // }else if(aa>=80||aa<=99)
        // {
        // System.out.println("很好");
        // }else if(aa>=60||aa<=79)
        // {
        // System.out.println("好");
        // }else if(aa>=0||aa<=59)
        // {
        // System.out.println("ok");
        // }

        /*
         * 簡化if else 寫法
         * (條件) ? 條件成立時執行的程式碼 : 條件不成立時執行的程式碼
         */
        // int a = 2;
        // int b = 3;

        // String min = (a < b) ? "A < B" : "A > B";
        // System.out.println(min);

        /*
         * 53,54 這兩行 效果等於以下寫法
         */
        // if(a < b) {
        // System.out.println("A < B");
        // } else {
        // System.out.println("B > A");
        // }

        /*
         * for 迴圈
         * for (初始值; 進入迴圈條件; 增量/減量) {
         * 條件成立時執行的程式碼
         * }
         */
        // for(int index = 0; index <= 10; index ++) {
        // System.out.println(index);
        // }

        // for (int aa = 2; aa <= 9; aa++) {
        // for (int bb = 1; bb <= 9; bb++) {
        // if (aa == bb) {
        // System.out.print("");
        // } else {
        // System.out.print(aa + " * " + bb + " = " + (aa * bb) + " ");
        // }
        // }
        // System.out.println();
        // }

        // for (int aa = 2; aa <= 9; aa++) {
        // for (int bb = 1; bb <= 9; bb++) {
        // if (aa != bb) {
        // System.out.print(aa + " * " + bb + " = " + (aa * bb) + " ");
        // }
        // }
        // System.out.println();
        // }

        // for (int x = 1; x <= 100; x++) {
        // if ((x % 15) == 0) {
        // System.out.println("x = " + x + "FizzBuzz");
        // } else if ((x % 5) == 0) {
        // System.out.println("x = " + x + "Buzz");
        // } else if ((x % 3) == 0) {
        // System.out.println("x = " + x + "Fizz");
        // }else
        // System.out.println("x = " + x);
        // }

        // for (int aa = 1; aa <= 9; aa += 2) {
        // for (int bb = 1; bb <= 9; bb += 4) {
        // System.out.println(aa + " * " + bb + " = " + (aa * bb));
        // }
        // }

        /*
         * for 迴圈 將array所有元素印出來範例
         * 元素長度可以用 array.length 取得
         * 可用Debug 觀察 index 的變化
         */
        // int[] bingo = {7, 22, 89, 55};
        // for(int index = 0; index < bingo.length; index ++) {
        // for(int index = 0; index <= bingo.length-1; index ++) {
        // System.out.println(bingo[index]);
        // }

        // int[] bingo = { 7, 22, 89, 55, 88 };
        // int sum = 0;
        // for (int index = 0; index <= bingo.length - 1; index++) {
        // sum = (sum + bingo[index]);
        // }
        // ;
        // System.out.println("5數加總為" + sum);

        // int[] bingo = { 7, 22, 89, 55, 88 };
        // int bigx = 0;
        // for (int index = 0; index <= bingo.length - 1; index++) {
        //     if (bingo[index] > bigx) {
        //         bigx = bingo[index];
        //     }
        //     ;
        //     System.out.println(bigx);

        // }

        /*
         * for 迴圈 減量範例
         * 這裡的 index 會從10開始，然後每次減1，直到 index <= 0 為止
         * 可用Debug 觀察 index 的變化
         */
        // for(int index = 10; index > 0; index --) {
        // System.out.println(index);
        // }

        /*
         * for each 迴圈
         * for (資料型態 單一變數名稱 : 陣列變數名稱) {
         * 條件成立時執行的程式碼
         * }
         */
        String[] students = { "A1", "A2", "A3" };
        for (String stu : students) {
        System.out.println(stu);
        }

        /*
         * 105 ~ 108 這幾行 效果等於以下寫法
         */
        // String[] students = { "A1", "A2", "A3" };
        // for (int index = 0; index <= students.length - 1; index++) {
        // System.out.println(students[index]);
        // }

    }
}
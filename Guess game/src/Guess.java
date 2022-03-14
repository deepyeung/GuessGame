
import java.util.*;
public class Guess {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int input = 0;  // 先宣告，初始化輸入變數 
        int answer = (int)(Math.random()*10 + 1);
        System.out.println(answer);
        for(int i = 0; i < 3; i++) {
        System.out.print("請輸入一個數字(最多猜三次): ");
        input = sc.nextInt();
        if(input == answer) {
        System.out.println("恭喜答對了! 答案是" + answer);
        break;
        }
        System.out.println("答錯了!");
        }
        if(input != answer) {
            System.out.println("遺憾，答錯三次!遊戲結束!答案是" + answer);
        }}}
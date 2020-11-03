package Demo01;

public class 爬楼梯 {
    private static int calculateCount(int ladder, int maxJump) {
        int jump = 0;
        if (ladder == 0) {
            return 1;
        }
        if (ladder >= maxJump) {
            // 剩下的楼梯大于最大可跳跃数
            for (int i = 1; i <= maxJump; i++) {
                jump += calculateCount(ladder - i, maxJump);
            }
        } else {
            // 剩下的楼梯不足最大可跳跃数
            jump = calculateCount(ladder, ladder);
        }
        return jump;
    }
    public static void main(String[] args) {
        int ladder = 20;
        int maxJump = 2;
        int i = calculateCount(ladder, maxJump);
        System.out.println(i);
    }
}

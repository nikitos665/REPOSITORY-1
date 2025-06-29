class Solution{
    private static Solution sol = new Solution();
    private Solution(){}
    public static Solution getInstance(){
        return sol;
    }
    public double getAnswer(double x, double y){
        if(y == 0){
            return -1;
        }
        else{
            return 2*x+3/y;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Solution solution = Solution.getInstance();
        System.out.println(solution.getAnswer(3.0,4.0));
        Solution solution1 = Solution.getInstance();
        System.out.println(solution1.getAnswer(3.1,4.2));
        System.out.println(solution.hashCode() == solution1.hashCode());
    }
}
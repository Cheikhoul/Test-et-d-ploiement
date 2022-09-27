public class Calculator {
    public int val1;
    public int val2;    

    public int add(int terme1, int terme2) {
        int sum = terme1 + terme2;
        return sum;
    }
    public int sub(int terme1, int terme2) {
        int diff = terme1 - terme2;
        return diff;
    }
    public int mul(int terme1, int terme2) {
        int prod = terme1 * terme2;
        return prod;
    }
    public int div(int terme1, int terme2) {
        if (terme2 == 0) {
            throw new IllegalArgumentException();
        }
        int qt = terme1 / terme2;
        return qt; 
    }
}
	
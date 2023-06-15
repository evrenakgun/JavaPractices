public class Sample {
    public String getMyName() {
        return "Evren Akgün";
    }

    public int addTwoNumbers(int a, int b) {
        return a + b;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }

    public String[] getTokens(String text, String separator) {
        return text.split(separator);
    }
}

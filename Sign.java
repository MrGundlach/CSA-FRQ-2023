public class Sign {
    private String message;
    private int width;

    public Sign(String message, int width) {
        this.message = message;
        this.width = width;
    }

    public int numberOfLines() {
        int len = message.length();
        if (len % width != 0) {
            return len / width + 1;
        }    
        return message.length() / width;
    }

    public String getLines() {
        String result = new String();
        String working = message;
        int num = numberOfLines();
        while (num > 0 && working.length() > width) {
            result += working.substring(0, width) + ";";
            working = working.substring(width);
            num++;
        }
        result += working;    
        return result;
    }
}
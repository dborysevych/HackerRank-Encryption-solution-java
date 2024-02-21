
class Result {

    /*
     * Complete the 'encryption' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String encryption(String s) {
    // Write your code here
        s = s.replaceAll(" ", "");
        StringBuilder ret = new StringBuilder();
        int c = (int)Math.ceil(Math.sqrt(s.length()));
        int f = (int)Math.floor(Math.sqrt(s.length()));
        
        for(int i = 0; i < c;i++) {
            int j = 0;
            while(j <= f && j*c + i < s.length()) {
                ret.append(s.charAt(j*c + i));
                j++;
            }
            ret.append(" ");
        }
        
        
        return ret.toString();
    }

}

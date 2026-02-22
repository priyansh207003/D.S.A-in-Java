class Solution {
    public String addBinary(String a, String b) {
        int n1 = a.length() - 1;
        int n2 = b.length() - 1;
        int c = 0;
        int base = 2;

        StringBuilder result = new StringBuilder();
        while (n1 >= 0 || n2 >= 0 || c > 0) { 
            int t1 = (n1 >= 0) ? a.charAt(n1--) - '0' : 0;
            int t2 = (n2 >= 0) ? b.charAt(n2--) - '0' : 0;

            int sum = t1 + t2 + c;
            c = sum / base;  
            result.append(sum % base);  
        }

        return result.reverse().toString();  
    }
}

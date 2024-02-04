public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1234321));
        System.out.println(isPerfectNumber(8128));
        System.out.println(numberToWords(125));
    }

    public static boolean isPalindrome(int number) {
        int absoluteNumber = number;
        if(number<0) {
            absoluteNumber= number*(-1);
        }
        String strNumber = String.valueOf(absoluteNumber);
        int j = strNumber.length()-1;
        for(int i=0; i<strNumber.length()/2; i++) {
            if(strNumber.charAt(i) != strNumber.charAt(j)){
              return false;
            }
            j--;
        }
        return true;
    }

    public static boolean isPerfectNumber(int number) {
        if(number<0) {
            return false;
        }
        else {
            int result= 0;
            for(int i=1; i<=number/2; i++ ) {
                if (number%i == 0 ) {
                    result+=i;
                }
            }
        if(result==number) {
            return true;
        }
        else
            return false;

        }
    }
    public static String numberToWords(int number) {
        if (number < 0) {
            return "Invalid Value";
        } else {
            String strNumber = String.valueOf(number);
            String result= "";
            for (int i = 0; i < String.valueOf(number).length(); i++) {
                if (strNumber.charAt(i) == '0') {
                    result+= "Zero ";
                }
              else  if (strNumber.charAt(i) == '1') {
                    result+= "One ";
                }
               else if (strNumber.charAt(i) == '2') {
                    result+= "Two ";
                }
           else if (strNumber.charAt(i) == '3') {
                    result+= "Three ";
                }

                else if (strNumber.charAt(i) == '4') {
                    result+= "Four ";
                }
                else if (strNumber.charAt(i) == '5') {
                    result+= "Five ";
                }
                else if (strNumber.charAt(i) == '6') {
                    result+= "Six ";
                }
                else if (strNumber.charAt(i) == '7') {
                    result+= "Seven ";
                }
                else if (strNumber.charAt(i) == '8') {
                    result+= "Eight ";
                }
                else  {
                    result+= "Nine ";
                }
            }
            return result.trim();
        }

    }

}
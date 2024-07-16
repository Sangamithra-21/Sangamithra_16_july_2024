public class NumberConversion {
    public static void main(String[] args) {
        String[] ones = {"","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] tens = {"","Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "eighty", "ninety"};
        String[] teens={"","Eleven","Twelve","Thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninety"};
        String result = "";
        int num = 3151;
        int digit = 1;
        while (num > 0) {
            int rem = num % 10;
            int val = digit*rem;
            if(val<=9)
            {
                result=ones[rem]+" "+result;
            }
            else if(val>=10 && val<=19)
            {
                result=teens[rem]+" "+result;
            }
            else if(val>=20 && val<=99)
            {
                if(val%10==0) {
                    result = tens[rem] +" " + result;
                }
            }
            else if(val>=100 && val<=999)
            {
                result = ones[rem]+" "+" Hundred and " +result;
            }
            else if(val>=1000 && val<=10000)
            {
                result= ones[rem]+" Thousand and "+result;
            }

            digit = digit * 10;
            num = num / 10;
        }
        System.out.println(result);
    }
}

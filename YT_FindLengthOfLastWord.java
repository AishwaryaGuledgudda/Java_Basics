public class YT_FindLengthOfLastWord {
    //find the lenght of the last word in a string
    // "Hello world" "_____Hello_____World____"

    public static void main(String[] args) {
        String str = "  Hello   World  ";
        String newStr = str.trim();
        int count=0;
        char[] arr = newStr.toCharArray();
        for(int i=arr.length-1;i>=0;i--) {
            if(arr[i]!=' '){
                count++;
            } else {
                System.out.println(count);
                break;

            }
        }
        }

        }



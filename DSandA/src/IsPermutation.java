import java.util.Arrays;

public class IsPermutation {
    
    public static void main(String[] args) {
        System.out.println(isPermutation("aabbaab", "ababcab"));
    }
    
    public static boolean isPermutation(String a, String b) {
        // Don't count spaces
        String dA = a.replaceAll(" ", "");
        String dB = b.replaceAll(" ", "");
        String[] aArr = dA.split("");
        String[] bArr = dB.split("");
        
        // They aren't permutations if they aren't the same size.
        if (dA.length() != dB.length()) {
            return false;
        // Sort arrays of characters; if the arrays don't match, no permutation.
        } else {
            Arrays.sort(aArr);
            Arrays.sort(bArr);
            
            for (int i = 0; i < aArr.length; i++) {
                if (!(aArr[i].equals(bArr[i]))) {
                    return false;
                }
            }
            return true;
        }
    }
    
}
package oops;

																													

public class Compareto			{																														

	public static int method_name(String var1, String var2) {
        char[] data1 = var1.toCharArray();
        char[] data2 = var2.toCharArray();
        int i=0, j=0;
        while (i<data1.length && j<data2.length) {
            if (data1[i] != data2[i]) {																																																										
                return data1[i] - data2[j];
            }																																																																															
            i++;
            j++;
        }																																																																																											
        return data1.length - data2.length;
    }																																																																											

    public static void main(String[] args) {
        String var1, var2;
        var1 = "abc";
        var2 = "abd";
        System.out.println(method_name(var1, var2));
    }
}

																														
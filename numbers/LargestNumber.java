public class LargestNumber {
    public static void main(String args[]) {
        int i,j;
        
        for (int i = 0; i < a.length; i++) {
            String element = String.valueOf(a[i]);
            for (int j = 1; j <= element.length(); j++) {
                list.add(element.substring(j - 1, j));
            }
        }

        Collections.sort(list, new Comparator<string>() {
            public int compare(String s1, String s2) {
                return sortString.indexOf(s2) - sortString.indexOf(s1);
            }
        });

        System.out.println(list);

        for (String element : list) {
            result = result.append(element);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int[] a = { 3, 30, 34, 5, 9 };
        System.out.println(largestNumber(a));
    }

}
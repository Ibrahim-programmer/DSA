// class Solution {
//     public String sortSentence(String s) {
//         StringBuilder fina = new StringBuilder();
//         String[] temp = s.split(" ");
//         Map<Integer, String> mp = new HashMap<>();
//         for (String i : temp) {
//             mp.put(Integer.parseInt(Character.toString(i.charAt(i.length() - 1))), i.substring(0, i.length() - 1));
//         }
//         System.out.println(mp);
//         mp.forEach((key, value) -> {
//             fina.append(value);
//             if(mp.containsKey(key+1)){
//                 fina.append(" ");
//             }
//         });
//         return fina.toString();
//     }
    
// }
class Solution {
    public String sortSentence(String s) {
        String input[] = s.split(" ");
        String ans[]  = new String[input.length];
        for(String in:input){
            int i = Character.getNumericValue(in.charAt(in.length()-1));
            ans[i-1]= in.substring(0,in.length()-1);
        }
        return String.join(" ",ans);
    }
}
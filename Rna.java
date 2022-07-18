import java.util.*;
class RnaTranscription {
    String transcribe(String dnaStrand) {
       // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        HashMap<Character,Character> rna=new HashMap<>();
        String ans="";
        rna.put('G','C');
        rna.put('C','G');
        rna.put('T','A');
        rna.put('A','U');
        for(int i=0;i<dnaStrand.length();i++){
            ans+=rna.get(dnaStrand.charAt(i));
        }
        return ans;
    }
}

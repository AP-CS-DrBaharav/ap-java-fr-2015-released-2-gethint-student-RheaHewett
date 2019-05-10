
public class HiddenWord {

    private String h ;
    
    public HiddenWord(String word){
        h = word;
    }
    
    public String getHint(String w){
        String out ="";
        for (int ii=0; ii<w.length() ; ++ii) {
            String s = w.substring(ii,ii+1);
        
            if (h.substring(ii,ii+1).equals(s))
                out += s;
            else {
                boolean found = false;
                for (int jj=0; jj<h.length(); ++jj){
                    if (h.substring(jj,jj+1).equals(s)) {
                        out += "+";
                        found = true;
                        break;
                    }
                }
                if (!found)
                    out+="*";
            }
        }
        return out;
    }
    
    
    
}



public class HiddenWordTester {

    
    static public void main(String[] args){
        
        HiddenWord puzzle = new HiddenWord("HARPS");
        
        System.out.println(" puzzle.getHint(\"AAAAA\") ==>  (should be +A+++) : "+ puzzle.getHint("AAAAA"));
        System.out.println(" puzzle.getHint(\"AAAAA\") ==>  (should be H****) : "+ puzzle.getHint("HELLO"));
        System.out.println(" puzzle.getHint(\"AAAAA\") ==>  (should be H*++*) : "+ puzzle.getHint("HEART"));
        System.out.println(" puzzle.getHint(\"AAAAA\") ==>  (should be HAR*S) : "+ puzzle.getHint("HARMS"));
        System.out.println(" puzzle.getHint(\"AAAAA\") ==>  (should be HARPS) : "+ puzzle.getHint("HARPS"));
    }
    
}

package dictionary;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{

    private HashMap<String, Set<String> > dictionary;
    
    public PersonalMultipleEntryDictionary(){
        
         HashMap<String, Set<String> > d = new HashMap<String, Set<String> >();
    
    this.dictionary = d;
    }
    
public void add(String word, String entry){
    
    
   if (!this.dictionary.containsKey(word) ) {
    
    this.dictionary.put(word, new HashSet<String>() );
       
   }

         Set<String> finished = this.dictionary.get(word);
          finished.add(entry);
    
   

}

    @Override
    public Set<String> translate(String word) {
        
        return dictionary.get(word);
        
    }

    @Override
    public void remove(String word) {
        
        dictionary.remove(word);
        
    }


    
}



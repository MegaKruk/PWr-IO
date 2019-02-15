package fitnesse;

import fit.ColumnFixture;
import java.util.IllegalFormatCodePointException;

public class ApplicationFixture extends ColumnFixture
{
            
        String[] myData;
        
        public boolean addClient() throws IllegalFormatCodePointException{
            try {
                int a = Data.facade.clientList.size();
                Data.facade.AddNaturalPersonClient(myData);
                int b = Data.facade.clientList.size();
                return a != b;
            } 
            catch(IllegalFormatCodePointException e){
                
            }
            return false;
          
        }
}

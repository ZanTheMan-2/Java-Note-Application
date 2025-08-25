
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author ZanTheMan
 */
public class CRUD {
     static ArrayList<StringBuffer> notes = new ArrayList<>();
  
    public static void main(String[] args) {
        lop();

    }
    
    public static void lop(){
       try{
     String choice = "-1";
    
    while(Integer.parseInt(choice) != 0){
         choice = JOptionPane.showInputDialog(null, "---Notes Maneger---"
            + "\n1. Create note"
            + "\n2. View Notes"
            + "\n3. Update Notes"
            + "\n4. Delete Notes"
            + "\n0. Exit");
    

    if(Integer.parseInt(choice) == 1)createNote();
    if(Integer.parseInt(choice) == 2)view();
    if(Integer.parseInt(choice) == 3)updateNote();
    if(Integer.parseInt(choice) == 4)deleteNote();
    if(Integer.parseInt(choice) == 0) JOptionPane.showMessageDialog(null, "Beyyyy :D");

        }
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, "Please enter a valid number!");
        lop();
        } 
    }
    public static void createNote(){
        String note = JOptionPane.showInputDialog(null, "What is your note? ");
        notes.add(new StringBuffer(note));
    }
    public static void view(){

        if(notes.isEmpty()){
            JOptionPane.showMessageDialog(null, "No notes found!");
        }else{
             StringBuilder allNotes = new StringBuilder("--- Your Notes ---\n");
            for(int i = 0; i < notes.size(); i++){
                allNotes.append(i + 1).append(". ").append(notes.get(i).toString()).append("\n");
            }
             JOptionPane.showMessageDialog(null, allNotes.toString());

        }
    }
    
    public static void updateNote(){
         if(notes.isEmpty()){
            JOptionPane.showMessageDialog(null, "No notes found!");

        }else{
        String noteNumber = JOptionPane.showInputDialog(null, "Which note do you want to change? ");
        String change = JOptionPane.showInputDialog(null, "What is your change? ");
        
        notes.get(Integer.parseInt(noteNumber) - 1).replace(0, notes.get(Integer.parseInt(noteNumber) - 1).length(), change);
        }
    }
    
    public static void deleteNote(){
        if(notes.isEmpty()){
            JOptionPane.showMessageDialog(null, "No notes found!");

        }else{
        String noteNumber = JOptionPane.showInputDialog(null, "Which note do you want to delete? ");
        notes.remove(Integer.parseInt(noteNumber)-1);
        }
    }
}

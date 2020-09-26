//@importing JFrame for the main function
import javax.swing.JFrame;

/*  <h2> <b>Membership controller</b> </h2>
<p>
*@a program will provide the control to membership officer
*@importing awt,swing librarise for view
*@creating main method to call the function
*@setting the size to the view
</p>

*/
public class InsuranceOfficerController {
    public static void main(String[] args) {
          InsuranceOfficerView insobj = new InsuranceOfficerView ();
    //@to exit the program
    insobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        insobj.setSize(600,800);
        insobj.setVisible(true);
    }
    
    
    /*@this part of code is not using in the program
    private InsuranceOfficerModel theModel;
    private  InsuranceOfficerView theView;
    
    public InsuranceOfficerController (InsuranceOfficerModel theModel,InsuranceOfficerView theView){
    
        this.theModel = theModel;
        this.theView = theView;
        this.theView.addContainerListener(new containerListner());
        
    }
   public class containerListner implements ActionListner{
   
   }*/
    
}

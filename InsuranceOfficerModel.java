/*  <h2> <b>Insurance officer model</b> </h2>
<p>
*@a program that will provide the functionalities of Insurance officer
*@creating  a method for determine the membership type,that the type is permium or regular
*@creating  two methods for discounting to member
</p>

*/



public class InsuranceOfficerModel {
    
    //@declearing private variable for insuranceType,userId 
    private String insuranceType,userId;
    
    //@calling the constructor to initialize the value,of private variable
    public InsuranceOfficerModel(String insuranceType,String userId){
    
        this.insuranceType = insuranceType;
        this.userId = userId;
    }
       
    //@declearing setter-getter method for accessing the private variable
     
     public void setInsuranceType(String insuranceType){
     this.insuranceType= insuranceType;
     }
     
     public String getInsuranceType(){
     return insuranceType;
     }
     //@declearing setter-getter method for user id
     public void setUserId(String userId){
     this.userId= userId;
     }
     
     public String getUserId(){
     return userId;
     
     }
     //@creating a method to provide the banks name
     public String ProvideBankInformation(){
        String BanksName = null;    
        return BanksName;
     }
    
}

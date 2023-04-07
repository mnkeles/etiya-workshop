public class CustomerManager {
    private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal=customerDal;
    }

    public void add(){
        customerDal.Add();

        //OracleCustomerDal oracleCustomerDal=new OracleCustomerDal(); bu senaryoda bağımlıyız
    }
}
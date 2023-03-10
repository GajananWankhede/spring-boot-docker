package demo.city.service.services.iservice;

public class GSTService implements CalculateGST,GSTR2B {
    @Override
    public Integer calculateGst() {
        return 1270;
    }

    @Override
    public Integer calculateGSTR2B() {
            return 1400;
    }
}

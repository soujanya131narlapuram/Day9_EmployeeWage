
public class EmpWageForMultiCompanies {
    public int companyWage;
    public int numOfWorkingDays;
    public int workingHrsPerMonth;
    int Full_Time = 8;
    int Part_Time = 4;
    int a_count = 0;//absent days count
    int ft_count = 0;//fulltime days count
    int pt_count = 0;//part time days count
    public EmpWageForMultiCompanies(int companyWage,int numOfWorkingDays,int workingHrsPerMonth)
    {
        this.companyWage=companyWage;
        this.numOfWorkingDays=numOfWorkingDays;
        this.workingHrsPerMonth=workingHrsPerMonth;
    }

    public void calculation_of_wage()
    {

        for (int i = 0; i < 30; i++)
        {
            double  randomCheck = Math.floor(Math.random() * 10) % 3;
            //System.out.print("Random check value:" + randomCheck);
            switch ((int) randomCheck)
            {
                case 0:
                    System.out.print("A-");
                    a_count++;
                    break;
                case 1:
                    System.out.print("FT-");
                    ft_count++;
                    break;
                case 2:
                    System.out.print("PT-");
                    pt_count++;
                    break;
                default:
                    System.out.println("not  usable");
            }
            if (((ft_count + pt_count) >= numOfWorkingDays) || ((pt_count * 4 + ft_count * 8) >= workingHrsPerMonth)) {
                break;
            }

        }
        System.out.println();
    }

    public void DisplayResult() {
        int employee_wage_ForMultiCompanies = (pt_count * Part_Time * companyWage) + (ft_count * Full_Time * companyWage);
        System.out.println("total absent days =" + a_count);
        System.out.println("total full time days =" + ft_count);
        System.out.println("total part time days =" + pt_count);
        System.out.println("total wage for the company: =" + employee_wage_ForMultiCompanies);
    }

    public static void main(String[] args)
    {
        EmpWageForMultiCompanies ob1=new EmpWageForMultiCompanies(10,20,200);
        ob1.calculation_of_wage();
        System.out.println("First company employee wage is:");
        ob1.DisplayResult();
        EmpWageForMultiCompanies ob2=new EmpWageForMultiCompanies(8,22,100);
        ob2.calculation_of_wage();
        System.out.println("Second company employee wage is:");
        ob2.DisplayResult();
    }
}



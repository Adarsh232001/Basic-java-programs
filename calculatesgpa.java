import java.util.Scanner;
class clculatesgpa
{
    public static void main(String args[])
    {
        System.out.println("********************************* CALCULATE SGPA & CGPA ****************************************");
        Scanner sa = new Scanner(System.in);
        adarsh kumar = new adarsh();
        for(;;)
        {
            System.out.println("Choose the given option bellow: ");
            System.out.println("1.Calcualte SGPA from Grade points");
            System.out.println("2.Calcualte SGPA from Marks");
            System.out.println("3.Calcualte CGPA");
            System.out.println("4.Exit");
            System.out.println("NOTE:Credits Earned will be decresed if the subject was passed in supplementry");
            int choice = sa.nextInt();
            switch(choice)
            {
                case 1: System.out.println("Semester Grade Point Average is: "+kumar.sgpa_with_grade());
                        break;
                case 2: System.out.println("Semester Grade Point Average is: "+kumar.sgpa_with_marks());
                        break;
                case 3: System.out.println("Cumulative Grade Point Average is: "+kumar.cgpa());
                        break;
                case 4: System.exit(0);
                        break;
                default:System.out.println("Choose the correct option:");
            }
        }
    }
    
}
class adarsh
{
    Scanner s = new Scanner(System.in);
    public float sgpa_with_grade()
    {   
        int sum_of_credits=0;
        int credits;
        int grade_points;
        float sum_sgpa=0;
        System.out.println("Enter the no of subjects: ");
        int n =s.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter the "+i+" Subject credits Earned: ");
            credits=s.nextInt();
            if(valid_credits(credits))
            {
            sum_of_credits = sum_of_credits + credits;
            System.out.println("Enter the "+i+" Subject grade points: ");
            grade_points = s.nextInt(); 
            if(valid_grade_points(grade_points))
            {
                sum_sgpa = sum_sgpa + (credits*grade_points);
            }
            else
                System.out.println("Enter a valid grade Points!!!!!!!!!!!!!!");
            }
            else
                System.out.println("Enter a valid credits!!!!!!!!!!!!!!!!!!!!");
        }                                                                                                          
        float final_sgpa = sum_sgpa/sum_of_credits;
        return final_sgpa;
    }
    public float sgpa_with_marks()
    {
        float sum_of_credits=0;
        int credits;
        int marks;
        int sum_sgpa=0;
        System.out.println("Enter the no of subjects: ");
        int n =s.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter the "+i+" Subject credits Earned: ");
            credits=s.nextInt();
            if(valid_credits(credits))
            {
            sum_of_credits = sum_of_credits + credits;
            System.out.println("Enter the "+i+" Subject Total marks: ");
            marks = s.nextInt(); 
            sum_sgpa = sum_sgpa + (credits*cal_grade_points(marks));
            }
            else
                System.out.println("Enter a valid credits!!!!!!!!!!!!!!!!!!!!");

        }
        float final_sgpa = sum_sgpa/sum_of_credits;
        return final_sgpa;

    }
    public int cal_grade_points(int marks)
    {
        int grade_points=0;
     if(marks>100||marks<0)
        {
            System.out.println("Enter a valid marks obtained");
            System.exit(0);
        }
        else{
            if(marks>=90)
                grade_points=10;
            else if(marks<90 && marks>=80)
                grade_points=9;
            else if(marks<80 && marks>=70)
                grade_points=8;
            else if(marks<70 && marks>=60)
                grade_points=7;
            else if(marks<60 && marks>=45)
                grade_points=6;
            else if(marks<45 && marks>=40)
                grade_points=4;
            else if(marks<40)
            {
                grade_points=0;
                System.out.println("This subject cannot be calculated. calculate after passing in supplementry exam!!!!!!!!!");
                System.exit(0);
            }
        }
        return grade_points;
    }
    public float cgpa()
    {   
        float average=0;
        System.out.println("Enter the No. of semesters to calculate CGPA: ");
        int n = s.nextInt();
        if(n<2||n>9)
            System.out.println("Enter a valid number of semesters");
        else{
        float sum_of_sgpa=0;
        int semester=0;
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter the "+i+" semester SGPA");
            float sgpa =s.nextFloat();
            if(sgpa>=10.0||sgpa==0){
                System.out.println("Incorrect SGPA try calculating it from above options");
            }

            else{
            sum_of_sgpa = sum_of_sgpa + sgpa;
            semester++;
            }
        }
        average = sum_of_sgpa/semester;
        }
        return average;
    }
    public boolean valid_credits(int credits)
    {   
        if(credits<=4||credits!=0)
           return true;
        else
        {
            System.out.println("Credits connot be more than 4");
            return false;
        }
    }
    public boolean valid_grade_points(int grade_points)
    {
        if(grade_points<=10 && grade_points>=6)
            return true;
        else if(grade_points==4 || grade_points==0)
            return true;
        else 
            return false;

    }
}
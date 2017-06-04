package intervalscheduling;
import java.util.*;

/**
 *
 * @author Brian Lee
 */

public class IntervalScheduling {
public static void main(String[] args) {
        // TODO code application logic here
        Job[] test = new Job[10];    
        Job job1 = new Job();
job1.setJobName("job1");
job1.setStartTime(1);
job1.setStartTime(2);
job1.setStartTime(50);

Job job2 = new Job();
job2.setJobName("job2");
job2.setStartTime(3);
job2.setStartTime(5);
job2.setStartTime(20);

Job job3 = new Job();
job3.setJobName("job3");
job3.setStartTime(6);
job3.setStartTime(19);
job3.setStartTime(100);

Job job4 = new Job();
job4.setJobName("job4");
job4.setStartTime(2);
job4.setStartTime(100);
job4.setStartTime(200);

test[0] = job1;
test[1] = job2;
test[2] = job3;
test[3] = job4;
        mostTasksFinder(test);
    }
    
public class Job{
    String jobName;
    double jobStartTime;
    double jobEndTime;
    double weight;

public void setJobName(String jobName){
    this.jobName = jobName;
}

public void setStartTime(double startTime){
    this.jobStartTime = startTime;
}

public void setEndTime(double endTime){
    this.jobEndTime = endTime;
}

public void setWeight(double weight){
    this.weight = weight;
}
public String getJobName(){
    return this.jobName;
}

public double getStartTime(){
    return this.jobStartTime;
}

public double getEndTime(){
    return this.jobEndTime;
}

public double getWeight(){
    return this.weight;
}

}

public void initialization(){

}

// Opening excel sheet
HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Sample sheet");

    Map<String, Object[]> data = new HashMap<String, Object[]>();
    data.put("1", new Object[] { "Emp No.", "Name", "Salary" });
    data.put("2", new Object[] { 1d, "John", 1500000d });
    data.put("3", new Object[] { 2d, "Sam", 800000d });
    data.put("4", new Object[] { 3d, "Dean", 700000d });

    Set<String> keyset = data.keySet();
    int rownum = 0;
    for (String key : keyset) {
        Row row = sheet.createRow(rownum++);
        Object[] objArr = data.get(key);
        int cellnum = 0;
        for (Object obj : objArr) {
            Cell cell = row.createCell(cellnum++);
            if (obj instanceof Date)
                cell.setCellValue((Date) obj);
            else if (obj instanceof Boolean)
                cell.setCellValue((Boolean) obj);
            else if (obj instanceof String)
                cell.setCellValue((String) obj);
            else if (obj instanceof Double)
                cell.setCellValue((Double) obj);
        }
    }

    try {
        FileOutputStream out = new FileOutputStream(new File("D:\\new.xls"));
        workbook.write(out);
        out.close();
        System.out.println("Excel written successfully..");

        /** Opening Excel File From Java **/

        try {
            Desktop.getDesktop().open(new File("D:\\new.xls"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
//Sort Jobs by Start Time
public static Job[] sortJobs(Job[] jobs){
    int test = 100;
    int realtest = 20;
    int testetstaaAaa = 200;
    return jobs;
}

//Find out which Jobs to do
public static Job[] mostTasksFinder(Job[] jobs){
    int amountOfJobs = jobs.length;
    while (amountOfJobs != 0){
        Job bestJob = new Job();
        double earliestEndTime = 10000.0;
        for (int n = 0; n < jobs.length; n++){
            if(earliestEndTime > jobs[n].getEndTime()){
               earliestEndTime = jobs[n].getEndTime();
               bestJob = jobs[n];
            }
    }
       for (int n = 0; n <jobs.length; n++){
           if (jobs[n].getStartTime() < earliestEndTime)
               amountOfJobs --;
       }
    }
    return jobs;
}
}

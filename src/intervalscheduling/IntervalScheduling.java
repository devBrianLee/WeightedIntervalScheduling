package intervalscheduling;
import java.util.*;

/**
 *
 * @author Brian Lee
 */

public class IntervalScheduling {
    
public static void main(String[] args) {
        // TODO code application logic here
        
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

Job[] test = new Job[10];

public void initialization(){
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
}

public static Object[] mostTasksFinder(Object[] jobs){ 
    Object[] taskList = new String[100];
    HashMap <String, Double> find;
    
    return taskList;

}
}

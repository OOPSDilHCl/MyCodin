import java.util.Arrays;
class Job{
  int id, profit, deadline;
  Job(int id, int deadline, int profit){
    this.id=id;
    this.profit=profit;
    this.deadline=deadline;
  }
}
public class JobSequencing{
  public int[] jobScheduling(Job[] jobs){
    Arrays.sort(jobs,(p,q)->Integer.compare(q.profit, p.profit));
    int maxDeadline=0;
    for(Job job : jobs){
      if(maxDeadline<job.deadline){
        maxDeadline=job.deadline;
      }
    }
    int[] hash=new int[maxDeadline+1];
    Arrays.fill(hash, -1);
    int cnt=0,tprofit=0;
    for(Job job : jobs){
      for(int i=job.deadline;i>0;i--){
        if(hash[i]==-1){
          hash[i]=job.id;
          cnt++;
          tprofit += job.profit;
          break;
        }
      }
    }
    return new int[] {cnt,tprofit};
  }
  public static void main(String[] args){
    Job[] jobs={
      new Job(1,2,100),
      new Job(2,1,19),
      new Job(3,2,27),
      new Job(4,1,25),
      new Job(5,3,15)
    };
   JobSequencing sol=new JobSequencing();
    int[] result=sol.jobScheduling(jobs);
    System.out.println(result[0]+" "+result[1]);
  }
}
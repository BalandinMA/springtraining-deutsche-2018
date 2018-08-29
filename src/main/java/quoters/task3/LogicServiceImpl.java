package quoters.task3;


public class LogicServiceImpl implements LogicService {
    @Benchmark
    @Transaction
    public void doLogic() {
        System.out.println("... rocket science logic ...");
    }
}

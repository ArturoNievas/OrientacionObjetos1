package ar.edu.unlp.info.oo1.ej10_jobScheduler;

public class JobSchedulerFIFO extends JobScheduler {

	public JobSchedulerFIFO() {
		super();
	}
	
	@Override
	public JobDescription next() {
		JobDescription nextJob = null;
		if (!jobs.isEmpty()) {
			nextJob = jobs.get(0);
			this.unschedule(nextJob);
        }
        return nextJob;
	}	
}

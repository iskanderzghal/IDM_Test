package com.Test;

public class TimeDuration {

	 private int numberOfSeconds;

	    public TimeDuration(int numberOfSeconds) throws BadBadValueException {
	        if (numberOfSeconds < 0) {
	            throw new BadBadValueException("Negative number given");
	        }
	        this.numberOfSeconds = numberOfSeconds;
	    }

	    public int getNumberOfSeconds() {
	        return numberOfSeconds;
	    }

	    public void setNumberOfSeconds(int numberOfSeconds) {
	        this.numberOfSeconds = numberOfSeconds;
	    }

	    @Override
	    public String toString() {
	    	int seconds = (int) (this.numberOfSeconds) % 60 ;
	    	int minutes = (int) ((this.numberOfSeconds / 60) % 60);
	    	int hours   = (int) ((this.numberOfSeconds / (60*60)) % 24);

	    	return "TimeDuration{" + hours + "h " + minutes + "m " + seconds +"s}";
	    }
	
	
	
}


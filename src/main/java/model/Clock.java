package model;

import java.util.Date;

/** @Author Leonardo Bonfim
 * Essa ordem é valida para todos os vetores de relógio
    * clock[0] -> seconds
    * clock[1] -> minutes
    * clock[2] -> hours
 **/
public class Clock extends Thread {

    private long number = 0;
    private int numberThread = 0;
    private int sleep = 0;
    private Date date;

    public Clock(long number, int numberThread, int sleep) {
        this.number = number;
        this.numberThread = numberThread;
        this.sleep = sleep;
        date = new Date();
    }

    public void tryNumber(int numberThread) throws InterruptedException {

        Long[] time = {
                (long) date.getSeconds(),
                (long) date.getMinutes(),
                (long) date.getHours()
        };

        Hours clock = new Hours(new Date());
        System.out.println("Thread >>>" + numberThread);
        for (int i = 0; i < number; i++) {
            Thread.sleep(sleep);
            time[0]++;
            time = clock.updateHours(
                    clock.constructClock(time[0], time[1], time[2])
            );
            System.out.println(clock);
        }
    }

    @Override
    public void run() {
        try {
            tryNumber(numberThread);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Hours {

    long hours = 0;
    long minutes = 0;
    long seconds = 0;
    StringBuilder formatDate;

    public Hours(Date date) {
        this.hours = date.getHours();
        this.minutes = date.getMinutes();
        this.seconds = date.getSeconds();
    }

    public Long[] updateHours(Long...clock ) {
        formatDate = null;
        this.seconds = clock[0];
        this.minutes = clock[1];
        this.hours = clock[2];
        return clock;
    }
    public Long[] constructClock(Long...clock) {
        if (clock[0] == 60) {
            clock[1] += 1;
        }
        clock[0] = clock[0] == 60 ? 0 : clock[0];
        if (clock[1] == 60) {
            clock[2] += 1;
        }
        clock[1] = clock[1] == 60 ? 0 : clock[1];
        return clock;
    }

    @Override
    public String toString() {
        formatDate = new StringBuilder();
        formatDate.append("|-- ").append((int) hours).append(" hours : ");
        formatDate.append((int) minutes).append(" minutes : ");
        formatDate.append((int) seconds).append(" seconds").append(" --|");
        return formatDate.toString();
    }
}
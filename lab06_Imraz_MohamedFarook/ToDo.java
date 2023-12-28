import java.text.DecimalFormat;
public class ToDo {
    private static int count = 1 ;
    private int itemNumber  ;
    private int hours;
    private int minutes;
    private boolean completed;
    private String title;
    DecimalFormat df ;

    public void printItem(){
            df = new DecimalFormat("00");
            if (completed){
                System.out.println("Item" + itemNumber+ ": " + title + " | Completed at " + df.format(hours) + ":" + df.format(minutes) );
            }else{
                System.out.println("Item" + itemNumber+ ": " + title + " | Not Completed"  );
            }

        }


    public void convertTime(String timeEnded) {
        if (timeEnded.length() !=5){
            this.completed = false;
            hours = -1;
            minutes  = -1;
        }
        String hrs = timeEnded.substring(0,2);
        String mins = timeEnded.substring(3);
        hours = Integer.parseInt(hrs);
        minutes = Integer.parseInt(mins);

        if (hours>23){
            this.completed = false;
            hours =-1;
        }
        if (minutes>59){
            this.completed =false;
            minutes =-1;
        }

    }
    public int getMinutes(){
        return minutes;
    }
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    public int getHours(){
        return hours;
    }
    public String getTitle(){
        return title;
    }
    public boolean getCompleted(){
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public ToDo(String title, boolean completed){
        this.title = title;
        this.completed = completed;
        itemNumber = count++;
        hours =0;
        minutes = 0;
    }
    public ToDo(){
        this("No Item", false);
    }
}

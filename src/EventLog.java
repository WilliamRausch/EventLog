import java.util.List;
import java.util.ArrayList;

public class EventLog {
   public  List<Event> eventList = new ArrayList<>();

   public boolean addEvent(Event event){

       try {
           if(event.action!=null &&event.name != null) {
               if (event.action == "Face2Face" || event.action == "PhoneCall" || event.action == "TextMessaging" || event.action == "Unknown") {

                   System.out.println(event.action);
                   System.out.println(event.name);
                   eventList.add(event);
                   return true;
               } else {
                   return true;
               }
           }else{
               return true;
           }
       }catch(IllegalArgumentException ex){
           return false;

       }
   }

   public int getNumEvents (){
       return eventList.size();

   }

    public EventLog() {

    }
}

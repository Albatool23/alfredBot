import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name ) {
        return String.format("Good %s,. Lovely to see you." , name);
    }
    


    public String dateAnnouncement() {
        return String.format("It is currently %s ", new Date());
    }
    


    public String respondBeforeAlexis(String conversation) {
     
        if(conversation.indexOf("Alexis") > -1) {
            return "She's really of no help. What can I get for you?";
        }

        if (conversation.indexOf("Alfred") > -1) {
            return "At your service, naturally. How may I be of assistance?";
        }

        return "Right. And with that I shall retire.";
    }
    }
 



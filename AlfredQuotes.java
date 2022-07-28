import java.util.Date;
public class AlfredQuotes {

    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name ) {
        
        return String.format("Hello ,. Lovely to see you." , name);
    }



    public String dateAnnouncement() {
        Date date = new Date();
        return "Current date is " + date;
    }


    public String respondBeforeAlexis(String conversation) {

        if (conversation.contains("Alexis")){
            return conversation + "Right away, sir. She certainly isn't sophisticated enough for that.";
        }else if(conversation.contains("Alfred")){
            return conversation + "At your service. As you wish, naturally.";
        }else{
            return conversation + "Right. And with that I shall retire.";
        }
    }

}



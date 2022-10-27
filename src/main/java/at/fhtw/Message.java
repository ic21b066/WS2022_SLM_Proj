package at.fhtw;

public class Message {

    public String message;

    public Message(){}

//    public long add(int numberOne, int numberTwo) {
//        return numberOne+numberTwo;
//    }

    public void set(String text)
    {
        setMessage(text);
    }

    public void reset()
    {
        setMessage("Everything OK");
    }

    public String sayOK() {
        return "OK";
    }

    public String getMessage() {
        return message;
    }


    public void setMessage(String message) {
        this.message = message;
    }
}

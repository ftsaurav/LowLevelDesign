import java.util.ArrayList;

interface ChatMediator{
    void sendMessage(String msg, User user);
    void addUser(User user);
}
class ChatRoom implements ChatMediator{
    private ArrayList<User> userList= new ArrayList<>();

    @Override
    public void sendMessage(String msg, User sender) {
        for(User user: userList)
        {
            if(user!=sender)
            {
                user.recieveMessage(msg, sender);
            }
        }
    }

    @Override
    public void addUser(User user) {
        userList.add(user);
    }
    
}
class User{
    private String name;
    private ChatMediator chatMediator;

    public User(String name, ChatMediator chatMediator)
    {
        this.name= name;
        this.chatMediator= chatMediator;
    }

    public void sendMessage(String msg)
    {
        System.out.println(this.name + " Sending a msg " + msg);
        chatMediator.sendMessage(msg, this);
    }

    public void recieveMessage(String msg, User sender){
        System.out.println(this.name + " received message: '" + msg + "' from " + name);
    }

}
public class ChatMediatorMain {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();
        User rahul = new User("Rahul",chatRoom);
        User amit = new User("Amit",chatRoom);
        User neha = new User("Neha",chatRoom);

        chatRoom.addUser(rahul);
        chatRoom.addUser(neha);
        chatRoom.addUser(amit);

        amit.sendMessage("Hi everyone");
    }
        
}

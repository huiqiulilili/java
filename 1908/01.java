interface IMessage{
    public static final String MSG = "I am biter";
    public abstract void print();
}

interface INews{
    public abstract String getNews();
}

class MessageImpl implements IMessage , INews{
    public void print(){
        System.out.println(IMessage.MSG);
    }

    public String getNews(){
        return IMessage.MSG;
    }
}

public class Practice {
    public static void main(String[] args) {
        IMessage m = new MessageImpl();
        m.print();
        INews n =(INews) m;
        System.out.println(n.getNews());
    }
}

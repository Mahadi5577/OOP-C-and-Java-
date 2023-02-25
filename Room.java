public class Room {
    int RoomNo;
    String RoomType;
    float RoomArea;
    boolean ACmachine;
    public Room()
    {
        System.out.println("HEllo, an object of Room is created");

    }
    public Room(int no,String type,float area,boolean AC)
    {
        RoomNo=no;
        RoomType=type;
        RoomArea=area;
        ACmachine=AC;
    }
    void displayInfo()
    {
        System.out.println("Room Number = "+ RoomNo + "\n"+ "Room Type = "+ RoomType +"\n"+ "Room Area = "+ RoomArea + "\n" + "AC Machine = " + ACmachine);
    }

    public static void main(String[] args) {
        Room obj= new Room(813, "LAB", 15.6F, false );
        Room obj1= new Room();
        obj1.displayInfo();
    }

}

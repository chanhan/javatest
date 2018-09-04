package cn.test.mybatis.po;

public class TrainOrder {
    private int id;

    private String SerialId;

    private String PassengerNames;

    public String getPassengerNames() {
        return PassengerNames;
    }


    public void setPassengerNames(String passengerNames) {
        this.PassengerNames = passengerNames;
    }


    public String getSerialId() {
        return SerialId;
    }

    public void setSerialId(String serialId) {
        SerialId = serialId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStartStationName() {
        return StartStationName;
    }

    public void setStartStationName(String startStationName) {
        StartStationName = startStationName;
    }

    private String StartStationName;


    public TrainActivity getActivity() {
        return activity;
    }

    public void setActivity(TrainActivity activity) {
        this.activity = activity;
    }

    private TrainActivity activity;

    @Override
    public String toString() {
        return "TrainOrder{" +
                "id=" + id +
                ", SerialId='" + SerialId + '\'' +
                ", PassengerNames='" + PassengerNames + '\'' +
                ", StartStationName='" + StartStationName + '\'' +
                ", activity=" + activity +
                '}';
    }
}

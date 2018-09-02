package cn.test.mybatis.po;

public class OrderAll extends TrainOrder {
    public long getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(long passengerId) {
        this.passengerId = passengerId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    private long passengerId;
    private String passengerName;

    @Override
    public String toString() {
        return "OrderAll{" +
                "passengerId=" + passengerId +
                ", passengerName='" + passengerName + '\'' +
                '}'+super.toString();
    }
}

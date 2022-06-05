package atm;

/**
 * 物理读卡设备
 * 从卡片读入原始设备
 */
public class PhysicalCardReader {
    private String name;

    public PhysicalCardReader(String name){
        this.name = name;
    }

    public Integer readInfo(String buf){
        return null;
    }

    public void ejectCard(){

    }

    public void eatCard(){

    }
}

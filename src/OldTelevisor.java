public class OldTelevisor implements Televisor {
    @Override
    public void turnOn() {
        if (turnedOn == false){
            turnedOn = true;
            System.out.println("Появилось небольшое шипение...");
            System.out.println("Засветился экран...");
            System.out.println("Телевизор " + name + " включен.");
        }
        else {
            System.out.println("Телевизор " + name +  " уже включен, не ломай пульт!");}

    }

    @Override
    public void turnOff() {
        if (turnedOn == true){
            turnedOn = false;
            System.out.println("Экран погас.");
            System.out.println("Телевизор " + name + " выключен.");
        }
        else {
            System.out.println("Телевизор " + name + " и так выключен. Не ломай пульт!");}
    }

    @Override
    public void turnOnOrOffByRemoteControl(RemoteControl remoteControl) {
        isRemoteControlEnabledToUseWithTv(remoteControl);
        if (isRemoteControlEnabledToUseWithTv(remoteControl) == true){
            if (turnedOn == false){
                turnOn();
            }
            else if (turnedOn == true){
                turnOff();
            }
        }
        else if (isRemoteControlEnabledToUseWithTv(remoteControl) == false){
            System.out.println("Данный пульт не подходит к телевизору " + name + " модели " + model);
        }

    }

    private String name;
    private String model;
    private boolean turnedOn = false;


    public OldTelevisor(String name, String model) {
        this.name = name;
        this.model = model;
    }

    private boolean isRemoteControlEnabledToUseWithTv (RemoteControl remoteControl){
        boolean check = false;
        for (int i = 0; i < remoteControl.getModels().length; i++){
            if (remoteControl.getModels()[i].equals(model)){
                check = true;
                break;
            }
            else {check = false;}
        }
        for (int i = 0; i < remoteControl.getNames().length; i++){
            if (remoteControl.getNames()[i].equals(name)){
                check = true;
                break;
            }
            else {check = false;}
        }
        return check;

    }

}

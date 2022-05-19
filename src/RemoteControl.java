public class RemoteControl {
    private String [] names;
    private String [] models;



    public String[] getNames() {
        return names;
    }

    public String[] getModels() {
        return models;
    }

    public RemoteControl(String[] names, String[] models) {
        this.names = names;
        this.models = models;
    }

    public void pressTurnOnButton (Televisor televisor){
        televisor.turnOnOrOffByRemoteControl(this);
    }
}

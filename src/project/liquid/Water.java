package project.liquid;

public abstract class Water {

    private String color = "no";
    private String transparency = "transparent";
    private String smell = "no";
    private int temperature = 0;

    public String getColor() {
        return color;
    }

    public String getTransparency() {
        return transparency;
    }

    public String getSmell() {
        return smell;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransparency(String transparency) {
        this.transparency = transparency;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}

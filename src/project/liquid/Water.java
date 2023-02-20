package project.liquid;

public abstract class Water {

    private String color;
    private String transparency;
    private String smell;
    private double temperature;

    public String getColor() {
        return color;
    }

    public String getTransparency() {
        return transparency;
    }

    public String getSmell() {
        return smell;
    }

    public double getTemperature() {
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

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}

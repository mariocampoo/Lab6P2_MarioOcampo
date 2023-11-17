
import java.awt.Color;

public class Auto {
    private String marca;
    private String modelo;
    private Color color;
    private int precio;

    public Auto() {
    }

    public Auto(String marca, String modelo, Color color, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Auto" + "\n"
                + " Marca = " + marca + "\n"
                + " Modelo = " + modelo + "\n"
                + " Color = " + color + "\n"
                + " Precio = " + precio;
    }
    
    
    
}
